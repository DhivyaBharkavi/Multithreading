package exercise25july19;

public class Thread1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
		Thread1 t1 = new Thread1();
		t1.start();
		Thread1 t2 = new Thread1();
		t2.start();
		//System.out.println("Default Priority is "+t.getPriority());
		//t.setPriority(2);
		//t.setPriority(10);
		t.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//System.out.println("Change to setPriority is "+t.getPriority());
	}

}
