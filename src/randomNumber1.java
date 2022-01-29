

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class randomNumber1 {

	public static void main(String[] args) {
		int size;
		int smallestValue;
		int largestValue;
	
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Set<Integer> s = new LinkedHashSet<Integer>();

		for (int i = 0; i < 500; i++) {
			s.add(rn.nextInt(999 - 101 + 1) + 101);

		}
		System.out.println(s.size());

		while (s.size() != 500) {
			s.add(rn.nextInt(999 - 101 + 1) + 101);
		}
		System.out.println(s.size());
		System.out.println(s);
		
		System.out.println("enter the array size");

		size = sc.nextInt();
		int[] arr = new int[size];
	//	System.out.println("enter the array size");
		System.out.println("enter Nth element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		smallestValue = arr[0];
		largestValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestValue) {
				largestValue = arr[i];

			}

			else if (arr[i] < smallestValue) {
				smallestValue = arr[i];
			}
		

		}
		System.out.println("this is the Nth smallest  =" + "\t" +smallestValue);
	}
}
