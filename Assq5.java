import java.util.Scanner;
class Assq5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius");
		int r= sc.nextInt(); 
		float pi=3.14F;
		double area=pi*r*r;
		double cir=2*pi*r;
		System.out.printf("value of cir= %.3f\n",cir);
		System.out.printf("value of area= %.3f\n",area);
	}

}