package java0807;

public class Array01 {

	public static void main(String[] args) {
		
		int[] numbers = new int [10];
		
		
		for( int i =0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for(int i =0; i<10; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
