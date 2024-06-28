package ocp_training.day2;

@FunctionalInterface
public interface Prediction {
	
	public boolean test(String ch);
	
	default public void info() {
		display();
	}
	
	static public void info2() {
		System.out.println("OCP");
	}
	
	private void display() { // version 9
		System.out.println("OCP");
	}
	
	private static void displayStatic() { // version 9
		System.out.println("OCP");
	}
}
