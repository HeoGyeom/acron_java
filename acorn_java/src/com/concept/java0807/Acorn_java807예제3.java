package com.concept.java0807;

import java.util.Scanner;

public class Acorn_java807예제3 {
	public static void main(String[] args) {
		System.out.println("축하합니다, 합격입니다!");
		
		System.out.println("불합격입니다.");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("국어점수:");
		int iNlscore = sc.nextInt();
		
		System.out.println("수학점수:");
		int iMathscore = sc.nextInt();
		
		System.out.println("영어점수:");
		int iEngscore = sc.nextInt();
		
		
		int iSum = (iNlscore+iEngscore+iMathscore);
		System.out.println("세 과목의 총 합 :"+iSum);
		
		int midscore = (iSum /3);
		System.out.println("세 과목의 평균"+midscore);
		
	}
}
