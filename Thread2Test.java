package exercise25july19;

public class Thread2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t = new Thread2();
	
		//t.isDaemon();
		t.setDaemon(false);
		t.start();
	}

}
