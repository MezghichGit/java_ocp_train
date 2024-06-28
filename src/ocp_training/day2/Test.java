package ocp_training.day2;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		/*
		Prediction pred = (String ch)->{return ch.contains("oc");};
		
		
		Prediction filter = (String ch)->{return ch.length()>4;};
		System.out.println(pred.test("ocp"));*/
		/*
		Supplier<StringBuilder> s1 = StringBuilder::new;
		Supplier<StringBuilder> s2 = () -> new StringBuilder("OCP");
		System.out.println(s1.get());
		System.out.println(s2.get()); 
		
		PredImple p = new PredImple();
		p.info();
		Prediction.info2();*/
		/*
		String paragraph = "formation ocp pour sagem";
		Predicate<String> filter = paragraph::contains;
		System.out.println(filter.test("sagem"));*/
		
		//String formation = "ocp";
		//formation.isEmpty();
		//Predicate<String> pred = String::isEmpty;
		//System.out.println(pred.test("sagem"));
		
		List<String>names = Arrays.asList("Rihab","Zied","Mohamed","Achraf","Nour","Dhia","Imen","Slah");
		//names.forEach(System.out::println);
		Stream<String> s = names.stream();
		//long total = s.filter(x->x.length()>=4).peek(System.out::println).filter(x->x.contains("i")).sorted().peek(System.out::println).count();
		//System.out.println(s.count());
		
		//System.out.println(total);
		List<String> finalList = s.filter(x->x.length()>=4).peek(System.out::println).filter(x->x.contains("i")).sorted().peek(System.out::println).collect(Collectors.toList());
		System.out.println(finalList);
	}

}
