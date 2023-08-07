package java0807;

import java.util.Scanner;

public class Acorn_java807예제2 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		
		if( i>0  && i %  2 ==0) {
			System.out.println("짝수");
		}else if(i > 0 && i % 2 ==1){
			System.out.println("홀수");
		}else{
			System.out.println("양수를 입력하세요.");
		}
		
	}
}

