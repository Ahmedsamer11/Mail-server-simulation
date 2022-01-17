
package eg.fue.cs.jobs;


public class TeachingAssistant extends Job{
    private int graduationYear;

	public TeachingAssistant() {
		super();
		this.graduationYear = 0;
	}

	public TeachingAssistant(String name, String description, String faculty,
			String department, int level) {
		super(name, description, faculty, department);
		this.graduationYear = level;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	
}
