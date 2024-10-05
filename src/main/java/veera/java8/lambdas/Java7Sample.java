package veera.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Sample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Veerapandian", "Manimuthu", 30),
				new Person("Valli", "Manimuthu", 27), new Person("Parvathi", "Manimuthu", 28),
				new Person("Prabhaharan", "Manimuthu", 35), new Person("Ramachandran", "Manimuthu", 40));

		// sort by firstName
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return  o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		//create a method to print all persons
		printAll(persons);
		System.out.println("----****----");
		//create a method to print person firstName starting with V
		printPersonStartingWithFirstNameAsV(persons);
		System.out.println("----****----P");
		//create a method to print person firstName starting with P
		printPersonWithSomeCondition(persons, new IPerson() {
			@Override
			public boolean someCondition(Person p) {
				return p.getFirstName().startsWith("P");
			}
		});		
		System.out.println("----****----V");
		printPersonWithSomeCondition(persons, new IPerson() {
			@Override
			public boolean someCondition(Person p) {
				return p.getFirstName().startsWith("V");
			}
		});

	}
	
	private static void printPersonWithSomeCondition(List<Person> persons, IPerson person) {
		for (Person p : persons) {
			if (person.someCondition(p)) {
				System.out.println(p);
			}
		}
	}
	
	

	private static void printPersonStartingWithFirstNameAsV(List<Person> persons) {
		for (Person p : persons) {
			if (p.getFirstName().startsWith("V")) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}

}
