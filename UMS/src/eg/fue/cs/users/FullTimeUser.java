
package eg.fue.cs.users;

import eg.fue.cs.jobs.Job;


public class FullTimeUser extends User{
    public FullTimeUser() {
		super();
	}

	public FullTimeUser(String name, String address, Job job, int age,
			String faculty, String department) {
		super(name, address, job, age, faculty, department);
	}
}
