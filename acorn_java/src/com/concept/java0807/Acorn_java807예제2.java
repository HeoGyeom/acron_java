package com.concept.java0807;

import java.util.Scanner;

public class Acorn_java807����2 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int i = sc.nextInt();
		
		if( i>0  && i %  2 ==0) {
			System.out.println("¦��");
		}else if(i > 0 && i % 2 ==1){
			System.out.println("Ȧ��");
		}else{
			System.out.println("����� �Է��ϼ���.");
		}
		
	}
}

