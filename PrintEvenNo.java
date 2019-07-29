package exercise29july19;

public class PrintEvenNo {
	synchronized public void even()
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			int check=0;
			if(i%2==0)
			{
				check=1;
				
			}
			if(check==1)
			{
				System.out.println(Thread.currentThread().getName()+" Even numbers are "+i);
			}
		}
	}
}
