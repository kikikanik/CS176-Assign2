import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question2 {

	public static void main(String[] args) {		
		Scanner input= new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter integers ending with Q: ");
		
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		
		System.out.println(list);	//for clarity, print out list
		System.out.println();	
		
		//part 1
		System.out.print("Elements at even index: ");
		for(int i = 0; i < list.size(); i += 2) {
		    System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		//part 2
		System.out.print("Even Elements: ");
		for (Integer evenElements : list) {
			if (evenElements%2 == 0) {
				System.out.print(evenElements + " ");
			}
		}
		
		System.out.println();
		
		//part 3 
		System.out.print("Odd Elements: ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2 == 1) {
				System.out.print(list.get(i) + " ");
			}
		}
		
		System.out.println(); 
		
		//part 5
		System.out.println("First Element: " + list.get(0));
		System.out.println("Middle Element: " + list.get((list.size()/2) + (list.size() % 2)));
		System.out.println("Last Element: " + + list.get(list.size() - 1));
		
		//part 4
		 Collections.reverse(list);
		 System.out.println("List in Reverse order: " + list);
		 
		
		//part 6
		int largest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > largest) {
				largest = list.get(i);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == largest) {
				System.out.println("Largest value: " + largest);
			}
		}
		
		//part 7
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (i%2 ==0) {
				result -= list.get(i);
			}
			else {
				result += list.get(i);
			}
		}
			System.out.print("The alternating sum is: " + result);
		
		input.close();
	}
}
