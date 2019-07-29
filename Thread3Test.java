package exercise25july19;

public class Thread3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t = new Thread3();
		t.start();
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread3 t1 = new Thread3();
		t1.start();
	}

}
