package exercise29july19;

public class Thread4 extends Thread{
	SyncBlock sb;
	Thread4(SyncBlock b)
	{
		sb=b;
	}
	public void run(int n)
	{
		synchronized(sb)
		{
			sb.print(n);
		}
	}
}
