package ocp_training.day3;

public class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i<10; i++)
		{
			System.out.println("i = "+i);
		}
		
	}

}
