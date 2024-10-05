/**
 * 
 */
package java_samples.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java_samples.java.emp.Employee;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(-100 <= 2);
		
		System.out.println(".....Hello Veera...");
		int []nums1 = {1,2,4,0,0,0};
		int []nums2 = {2,5,6};
		merge(nums1, 3, nums2, 3);
		
//		System.exit(1);
		
//		System.out.println(Java8SamplesMain.compareString("Veera", "Veera"));
		//String empSame, int empId, int salary, int managerId
		Employee e1 = new Employee("Veera", 123, 20, 987);
		Employee e2 = new Employee("Rima", 987, 2100, 456);
		Employee e3 = new Employee("Om", 456, 2000, 99);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		List<Stream<Employee>> empWhoEarnsMoreThanMgrs = employees.stream().map(e  -> 
		employees.stream().filter(m -> e.getSalary() > m.getSalary())).collect(Collectors.toList());
		
		for (Stream<Employee> s :  empWhoEarnsMoreThanMgrs) {
			s.forEach(System.out::println);
		} 
	}
	
	 // Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
    // Input: nums1 = [0], m = 0, nums2 = [1], n = 1 Output: [1]
		public static void merge(int[] nums1, int m, int[] nums2, int n) {
			int[] resNum = new int[m + n];
			for (int i = 0; i < m + n; i++) {
				if (i < m) {
					resNum[i] = nums1[i];
				} else {// i=4, m=3
					resNum[i] = nums2[i - m];
				}
				if (i > 0) {
					int prevVal = resNum[i - 1];
					int currVal = resNum[i];
					if (prevVal > currVal) {
						int temp = currVal;
						currVal = prevVal;
						prevVal = temp;

						resNum[i] = currVal;
						resNum[i - 1] = prevVal;
					}
				}
			}

			nums1 = resNum;

			System.out.println(Arrays.toString(nums1));
		}

}
