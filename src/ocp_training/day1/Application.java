package ocp_training.day1;

import static ocp_training.day1.calcul.UtilMath.PI;
import static ocp_training.day1.calcul.UtilMath.getPI;

import ocp_training.day2.Animal;
import pack1.*;
import pack2.*;
/*import pack1.B;
import pack1.C;*/
//import pack2.C;

public class Application {

	public static void main(String[] args) {
		int tab[],x;
		int [] tab2;
		//int x=1;
		//System.out.println(x);
		/*System.out.println("Hello Sagem");
		byte x = 10;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		int xi = 2147483647;
		//max long : 9223372036854775807
		        long xl = 2147483648L;*/
		/*double moy = 12.5;
		float note = 12.5F;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);*/
		
		//System.out.println(Etudiant.MAX_AGE);
		Etudiant e = new Etudiant();
		//System.out.println(e.nom); //null
		//System.out.println(e.age); //0
		//Etudiant e2 = e;
		System.out.println("******");
		Etudiant e2 = new Etudiant();
		A a = new A();
		B b = new B();
		pack2.C  c = new pack2.C();
		D d = new D();
		E e3 = new E();
		System.out.println(PI);
		System.out.println(getPI());
		int _=100;
		
		Animal a2 = new Animal();
		a2.age = 2;
		//a2.
		
	}

}
