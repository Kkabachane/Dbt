class Q55
{
	public static void main(String args[])
	{
		String s="Number of words in string count";
		int counter=0;
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				flag=true;
				continue;
			}
			if(flag)
			{
				counter++;
			}
			flag=false;
		}
		System.out.println(counter);
	}
}