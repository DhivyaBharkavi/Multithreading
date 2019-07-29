package exercise29july19;

public class Thread3 extends Thread{
	PrintEvenNo pp;
	Thread3(PrintEvenNo p)
	{
		pp=p;
	}
	public void run()
	{
		pp.even();
	}

}
