package exercise29july19;

public class PrintSequence {

		public void printNaturalNumber()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" I is "+i);
			}
		}
}
