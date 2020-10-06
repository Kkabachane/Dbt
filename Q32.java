class Students
{
	private int rollno;
	private String name;
	private static int total=0;
	
	Students()
	{
		total++;
	}
	void setData(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void show()
	{
		System.out.println(rollno+" "+name);
		System.out.println("count=" +total);
	}
}
class Q32
{
	public static void main(String args[])
	{
		Students s=new Students();
		Students s1=new Students();
		Students s2=new Students();
		s.setData(1,"Test1");
		s.setData(2,"Test2");
		s.setData(3,"Test3");
		s.show();
		//s.show();
		//s.show();
	}
}