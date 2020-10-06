class Q57
{
	public static void main(String args[])
	{
		String s="This is java";
		char ar[]=s.toCharArray();
		int l=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==(' ') || ar.length-1)
			{
				l=(ar[i]==(' '))?i-1 : i;
				int a=0;
				while(l>a)
				{
					char temp=ar[l];
					ar[l]=ar[a];
					ar[a]=temp;
					l--;
					a++;
				}
				a=i+1;
			}
		}
		System.out.println(new String(ar));
	}
}