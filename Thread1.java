package exercise29july19;

public class Thread1 extends Thread{
	PrintSequence ps;
	Thread1(PrintSequence p)
	{
		ps=p;
	}
	public void run()
	{
		ps.printNaturalNumber();
	}
 }
