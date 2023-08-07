package java0807;

import java.util.Scanner;

public class Array03 {
public static void main(String[] args) {
	

	
	Scanner sc = new Scanner(System.in);
	System.out.println("양수값을 입력하시오");
	int a = sc.nextInt();
	
	
	int[] number = new int [a];
	for(int i=0; i<number.length; i++) {
		number [i] = i+1;
		System.out.println(i+1);
	}
	
	
	
	
	
	}
}
