import java.util.ArrayList;

public class StudentList
	{
	
	private String lastName;
	private String firstName;
	private String courseOne;
	private String gradeOne;
	private String courseTwo;
	private String gradeTwo;
	private String courseThree;
	private String gradeThree;
	private double gpa;
	
	public StudentList(String l, String f, String co, String go, String ct, String gt, String cth, String gth, double g)
	{
		lastName = l;
		firstName = f;
		courseOne = co;
		gradeOne = go;
		courseTwo = ct;
		gradeTwo = gt;
		courseThree = cth;
		gradeThree = gth;
		gpa = g;
	}
	
	
		
	// loop through data file and add to array list
	// constructor needs all 10 parts
	
	
	ArrayList <Student> StudentList = new ArrayList <Student>();
	}
