import java.util.*;
class As29
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]={{1,2,3},{3,4},{6,7}};
		int oned=0;
		int noof=0;
		for(int a[]:arr)
		{
			oned++;
			for(int b:a)
			{
				noof++;
				System.out.println(b+" ");	
			}
			System.out.println("every one d array" +noof);
		}
		System.out.println("every 2d array" +oned);
	}
}