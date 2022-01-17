
package eg.fue.cs.jobs;


public class Lecturer extends Job{
    private int experienceYears;

	public Lecturer() {
		super();
		this.experienceYears = 0;
	}

	public Lecturer(String name, String description, String faculty,
			String department, int experienceYears) {
		super(name, description, faculty, department);
		this.experienceYears = experienceYears;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
}
