package week3.day1.assignments;

public class Students {

	public void getStudentInfo(int id)

	{
		System.out.println("Student ID is: " + " " + id);
	}
	public void getStudentInfo(int id, String name)

	{
		System.out.println("Student ID is: " + " " + id);
		System.out.println("Student Name is: " + " " + name);
	}
	public void getStudentInfo(String email, long phoneNumber)

	{
		System.out.println("Email ID is: " + " " + email);
		System.out.println("Student Phone Number is: " + " " + phoneNumber);
	}
	public static void main(String[] args)
	{
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(315333);
		studentInfo.getStudentInfo(315333, "Yogalakshmi S");
		studentInfo.getStudentInfo("syogaa2020@gmail.com", 9876543210L);
}
}