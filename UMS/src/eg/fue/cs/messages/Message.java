
package eg.fue.cs.messages;
import eg.fue.cs.users.User;

public class Message {
    private String body;
	private String subject;
	private User to;
	private User from;

	public Message()
	{
		this.body = "";
		this.subject = "";
		this.from = new User();
		this.to = new User();
	}
	
	public Message(String body, String subject, User from, User to){
		this.body = body;
		this.subject = subject;
		this.from = from;
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}
	
}
