package veera.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8SampleLambda {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Veerapandian", "Manimuthu", 30),
				new Person("Valli", "Manimuthu", 27), new Person("Parvathi", "Manimuthu", 28),
				new Person("Prabhaharan", "Manimuthu", 35), new Person("Ramachandran", "Manimuthu", 40));

		// sort by firstName
		Collections.sort(persons, (p1, p2) ->  p1.getFirstName().compareTo(p2.getFirstName()));
		
		System.out.println("----****----All");
		//create a method to print all persons
		printPersonWithSomeCondition(persons, p -> true, p -> System.out.println(p));
		
		System.out.println("----****----P");
		//create a method to print person firstName starting with P
		printPersonWithSomeCondition(persons,   p ->  p.getFirstName().startsWith("P"), p -> System.out.println(p));
		
		System.out.println("----****----V");
		printPersonWithSomeCondition(persons,  p ->  p.getFirstName().startsWith("V"), p -> System.out.println(p.getFirstName()));

	}
	
	private static void printPersonWithSomeCondition(List<Person> persons, Predicate<Person> person, Consumer<Person> consumer) {
		for (Person p : persons) {
			if (person.test(p)) {
				consumer.accept(p);
			}
		}
		
	}
/*
	private static void printPersonWithSomeCondition(List<Person> persons, Predicate<Person> person) {
		for (Person p : persons) {
			if (person.test(p)) {
				System.out.println(p);
			}
		}
	} */

	/*public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Veerapandian", "Manimuthu", 30),
				new Person("Valli", "Manimuthu", 27), new Person("Parvathi", "Manimuthu", 28),
				new Person("Prabhaharan", "Manimuthu", 35), new Person("Ramachandran", "Manimuthu", 40));

		// sort by firstName
		Collections.sort(persons, (p1, p2) ->  p1.getFirstName().compareTo(p2.getFirstName()));
		
		System.out.println("----****----All");
		//create a method to print all persons
		printPersonWithSomeCondition(persons, p -> true);
		
		System.out.println("----****----P");
		//create a method to print person firstName starting with P
		printPersonWithSomeCondition(persons,   p ->  p.getFirstName().startsWith("P"));
		
		System.out.println("----****----V");
		printPersonWithSomeCondition(persons,  p ->  p.getFirstName().startsWith("V"));

	}
	
	private static void printPersonWithSomeCondition(List<Person> persons, Predicate<Person> person) {
		for (Person p : persons) {
			if (person.test(p)) {
				System.out.println(p);
			}
		}
	}*/
	
	/*private static void printPersonWithSomeCondition(List<Person> persons, IPerson person) {
		for (Person p : persons) {
			if (person.someCondition(p)) {
				System.out.println(p);
			}
		}
	}*/

}
