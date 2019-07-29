  package exercise25july19;

public class MyThread extends Thread{
	public void run()
	{
		//display();
		String tname=Thread.currentThread().getName();
		
		//System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<=4;i++)
		{
			System.out.println(tname+" Running ");
		
		}
	//System.out.println("Running");
	}
	/*public void display()
	{
		System.out.println("Display");
	}*/
}
