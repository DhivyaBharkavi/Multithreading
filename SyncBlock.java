package exercise29july19;

public class SyncBlock {
	int n=10;
	public void print(int n)
	{
		//n=10;
		synchronized(this)
		{
			for(int i=0;i<=n;i++)
			{
				int check=0;
				if(n%i!=0)
				{
					check=1;
				}
				if(check==1)
				{
					System.out.println(Thread.currentThread().getName()+"Odd numbers are "+i);
				}
			}
		}
	}
	
}
