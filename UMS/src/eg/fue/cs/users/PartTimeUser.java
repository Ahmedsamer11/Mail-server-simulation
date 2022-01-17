
package eg.fue.cs.users;

import eg.fue.cs.jobs.Job;


public class PartTimeUser extends User{
    public PartTimeUser() {
		super();
	}

	public PartTimeUser(String name, String address, Job job, int age,
			String faculty, String department) {
		super(name, address, job, age, faculty, department);
	}
}
