import java.util.Scanner;
class Assq10
{
	public static void main(String args[])
	{
		float cel,fahrenheit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		fahrenheit=sc.nextFloat();
		cel=(5*(fahrenheit-32)/9);
		System.out.printf("Temperature in celcius is %.2f",cel);
	}
}