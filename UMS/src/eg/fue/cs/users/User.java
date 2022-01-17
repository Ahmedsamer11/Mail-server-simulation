
package eg.fue.cs.users;
import java.util.ArrayList;

import eg.fue.cs.jobs.Job;
import eg.fue.cs.jobs.Lecturer;
import eg.fue.cs.jobs.Student;
import eg.fue.cs.jobs.TeachingAssistant;
import eg.fue.cs.messages.Message;
import eg.fue.cs.messages.PrivateMessage;
import eg.fue.cs.messages.PublicMessage;

public class User {
    private String userName = " ", address = " ";
	private int age = 0;
	private ArrayList<Message> inbox;
	private ArrayList<Message> sent;
	private Job job;

	public User() {
		userName = " ";
		address = " ";
		age = 0;
		inbox = new ArrayList<Message>();
		sent = new ArrayList<Message>();
		job = new Job();
	}

	public User(String name, String address, Job job, int age, String faculty,
			String department) {
		userName = name;
		this.age = age;
		this.address = address;
		this.job = job;
		inbox = new ArrayList<Message>();
		sent = new ArrayList<Message>();
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		userName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void changeJob(Job job) {
		if (job instanceof TeachingAssistant || job instanceof Lecturer
				|| job instanceof Student)
			this.job = job;
	}

	public void receiveMsg(Message msg) {
		this.inbox.add(msg);
	}

	public void addToSent(Message msg) {
		this.sent.add(msg);
	}

	public boolean sendMsg(User u, Message msg) {
		if (this instanceof FullTimeUser) {
			if(this.sendHelper(u, msg))
				return true;
		} else if (this instanceof PartTimeUser) {
			if (u instanceof FullTimeUser) {
				if(this.sendHelper(u, msg))
					return true;
			} else if (u instanceof PartTimeUser) {
				if (u.getJob().getDepartment() == this.getJob().getDepartment()
						&& u.getJob().getFaculty() == this.getJob()
								.getFaculty()) {
					if(this.sendHelper(u, msg))
						return true;
				}
			}
		}
		return false;
	}

	public boolean sendHelper(User u, Message msg) {
		if (msg instanceof PrivateMessage) {
			if (u.job instanceof Lecturer && this.job instanceof Lecturer) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			} else if (u.job instanceof TeachingAssistant && this.job instanceof TeachingAssistant) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			} else if (u.job instanceof Student && this.job instanceof Student) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			} else
				return false;

		} else if (msg instanceof PublicMessage) {
			if (u.job instanceof Student && this.job instanceof Student) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			} else if (this.job instanceof TeachingAssistant
                                && u.job.getFaculty().equals(this.job.getFaculty())
                                && u.job.getDepartment().equals(this.job.getDepartment())) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			} else if (this.job instanceof Lecturer) {
				u.receiveMsg(msg);
				this.addToSent(msg);
				return true;
			}
		}
		return false;
	}

	public boolean deleteMsg(Message msg) {
		for (int i = 0; i < inbox.size(); i++) {
			if (msg.getBody() == inbox.get(i).getBody()
					&& msg.getSubject() == inbox.get(i).getSubject()
					&& msg.getFrom() == inbox.get(i).getFrom()
					&& msg.getTo() == inbox.get(i).getTo()) {
				inbox.remove(inbox.get(i));
				return true;
			}
		}
		return false;
	}
}
