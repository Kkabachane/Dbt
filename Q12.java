import java.util.Scanner;
class Q12
{
	public static void main(String args[])
	{
		float gs,bs,hra,da;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr basic salary");
		bs=sc.nextFloat();
		if(bs<10000)
		{
			 hra=bs*10/100;
			 da=bs*90/100;
		}
		else
		{
			hra=2000;
			da=bs*98/100;
		}
		gs=bs + da + hra;
		System.out.println("Basic salary:"+bs);
		System.out.println("hra:"+hra);
		System.out.println("da:"+da);
		System.out.println("gs:"+gs);
	}
}