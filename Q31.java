//import util.java.Scanner;
class Students
{
	private int rollno;
	private String name;
	void setData(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void show()
	{
		System.out.println(rollno+" "+name);
	}
}
class Q31
{
	public static void main(String args[])
	{
		Students s=new Students();
		s.setData(1,"Test1");
		s.show();
	}
}