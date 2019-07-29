package exercise29july19;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSequence ps = new PrintSequence();
		PrintEvenNo pp = new PrintEvenNo();
		SyncBlock b = new SyncBlock();
		Thread1 t = new Thread1(ps);
		t.start();
		
		Thread2 t1 = new Thread2(ps);
		t1.start();
		
		Thread3 t2  = new Thread3(pp);
		t2.start();
		
		Thread4 t3 = new Thread4(b);
		t3.start();
		
	}

}
