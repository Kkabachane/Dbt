class Q62
{
    public static void main(String args[])
    {Thread t1=new Thread();
       new newThread();
    	new newThread1();
              System.out.println("Exiting main thread");
       }
}
class NewThread1 implements Runnable
{
Thread t1;
NewThread1()
{
    t1=new Thread(this,"Prime number");
     System.out.println("t1 is created"+t1);
    t1.start();
}
public void run()
{
int i=2,no=11 ,flag=1;
      
         try
           {
	int n2= no/2;
    	if(n2==0)
     	System.out.println("no.is not prime");
    	else
     	System.out.println("no.is prime");
                   Thread.sleep(1000);
          }
            catch(InterruptedException e)
               {
                  System.out.println("Exception"); 
               }
}
}