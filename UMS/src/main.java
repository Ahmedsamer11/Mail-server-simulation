
import eg.fue.cs.jobs.*;
import eg.fue.cs.messages.*;
import eg.fue.cs.users.*;

public class main {
    public static void main(String[] args) 
	{
		FullTimeUser u1 = new FullTimeUser();
		u1.setName("Ahmed Samer");
		u1.setAge(22);
		u1.changeJob(new TeachingAssistant("Ahmed Samer", "Excellent TA", "CS", "Programming", 2020));
		u1.setAddress("AS@eg.fue");
		PartTimeUser u2 = new PartTimeUser();
		u2.setName("Saif");
		u2.setAge(22);
		u2.changeJob(new Student("Saif", "A+ Student", "CS", "Digtial Media", 2));
		u2.setAddress("Saif@eg.fue");
		PartTimeUser u3 = new PartTimeUser();
		u3.setName("Mohamed Ahmed");
		u3.setAge(37);
		u3.changeJob(new Lecturer("Mohamed Ahmed", "Excellent Lecturer", "CS", "Software Engineering", 5));
		u3.setAddress("MA@eg.fue");
		PartTimeUser u4 = new PartTimeUser();
		u4.setName("Amr Diab");
		u4.setAge(28);
		u4.changeJob(new TeachingAssistant("Amr Diab", "Average TA", "CS", "Programming", 2017));
		u4.setAddress("AD@eg.fue");
		System.out.println(u1.sendMsg(u4, new PrivateMessage("Hello", "I would like to congrat you", u1, u2)));
		
		
	}
}
