package exercise29july19;

public class Thread2 extends Thread{
	PrintSequence ps;
	Thread2(PrintSequence p)
	{
		ps=p;
	}
	public void run()
	{
		ps.printNaturalNumber();
	}
}
