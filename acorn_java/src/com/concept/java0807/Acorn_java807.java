package com.concept.java0807;

import java.util.Scanner;

public class Acorn_java807 {
	public static void main(String[] args) {
		System.out.println("1.입력 ");
		System.out.println("2.수정 ");
		System.out.println("3.조회 ");
		System.out.println("4.삭제 ");
		System.out.println("5.종료 ");
		System.out.println("메뉴 번호를 입력하세요 >>>> ");
		
		Scanner sc = new Scanner(System.in);
		int iUserInputValue = sc.nextInt();
		
		if(iUserInputValue == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if (iUserInputValue == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if (iUserInputValue == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if (iUserInputValue == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if (iUserInputValue == 5) {
			System.out.println("프로그렘이 종료됩니다.");
		}else {
			System.out.println("실행할 수 없는 메뉴입니다.");
		}
		
		
}
}