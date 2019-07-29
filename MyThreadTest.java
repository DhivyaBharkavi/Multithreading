package exercise25july19;

public class MyThreadTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		System.out.println(t.getName());
		//System.out.println("Main thread"+Thread.currentThread().getPriority());
		
		//t.stop();
		MyThread t1 = new MyThread();
		t1.start();
		//t1.getPriority();
		//String name=t1.setName("Dhivya");
		t1.setName(" Dhivya");
		//String tt=t1.getName();
		System.out.println(t1.getName());
		//t.display();
		MyThread t2 = new MyThread();
		t2.start();
	
		
	}

}
