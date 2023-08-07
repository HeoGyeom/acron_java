package java0807;

import java.util.Scanner;

public class study_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>");
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			System.out.print(i + " ");
		}
		if(a<1) {
			System.out.println("1이상의 숫자를 입력하세요");
		}
		
		
	
		
	}
}
