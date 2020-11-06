public class Question1 {

	public static void main(String[] args) {
		/*
		 * //import java.util.Scanner;
		 * 
		 * public class test2{
		 * 
		 * public static void main(String args[]){
		 * 
		 * System.out.print("Enter 2D array size and elements: "); Scanner in = new
		 * Scanner(System.in); int n =in.nextInt(); int array[][]=new int[n][n];
		 * 
		 * for(int i=0; i<n;i++) { for(int j=0; j < n ;j++) { array[i][j]=in.nextInt();
		 * System.out.print(array[i][j] + " "); } System.out.println(); }
		 * 
		 * System.out.println("Reverse Array: "); for (int i = n -1; i >=0 ; i--) { for
		 * (int j = n -1; j >=0 ; j--) { System.out.print(array[j][i] + " "); }
		 * System.out.println(); }
		 * 
		 * in.close(); } }
		 */	
		
		int array[] [];
		int result = 0;
		array = new int[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = i+j;
				result += array[i][j];
			}
		}
		System.out.println("The Second row values are: ");
		for (int j = 0; j < array.length; j++) {
			int i = 1;
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
		System.out.println("The Third row values are: ");
		for (int i = 0; i < array.length; i++) {
			int j = 2;
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
		System.out.println("The sum of all the elements is: "+ result);
		System.out.println("The tabular form is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
