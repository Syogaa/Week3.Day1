package week3.day1.assignments;

public class Automation implements Language, TestTool 
{
public void Java()
{
	System.out.println("Jave is an Object Oriented Programming language.");
}
public void Selenium()
{
	System.out.println("Selenium is a Testing tool.");
}
public static void main(String[] args)
{
	Automation executionclass = new Automation();
	executionclass.Java();
	executionclass.Selenium();
}
}
