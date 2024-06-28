package ocp_training.day3;

public class ExempleRunnable {

	public static void main(String[] args) { // thread principal
		System.out.println(Thread.currentThread().getName());
		System.out.println("begin");
		
		Worker w = new Worker();
		Master m = new Master();
		Thread t1 = new Thread(w); // premier thread
		t1.start();
		for(int k = 0; k<10; k++)
		{
			System.out.println("k = "+k);
		}
		new MyWorker().start();
		new Thread(m).start();  // deuxième thread
		
		System.out.println("end");
		
		

	}

}
