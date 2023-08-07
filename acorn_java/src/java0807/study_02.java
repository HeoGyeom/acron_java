package java0807;

import java.util.Scanner;

public class study_02 {
public static void main(String[] args) {
	
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("숫자를 입력하세요 >>");
//	int a = sc.nextInt();
//	for(int i=1; i<=a; i++) {
//		System.out.print(i + " ");
//	}
//	if(a<1) {
//		System.out.println("1이상의 숫자를 입력하세요");		
//	}
	
	int iInputValue = 0;
	Scanner sc = null;
	int breakFlag = 0;
	
	sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.println("정수 입력>>>");
		iInputValue = sc.nextInt();
		
		if(iInputValue < 1) {
			continue;
		}else {
			for(int i =0; i<iInputValue; i++) {
				System.out.print((i + 1)+ " ");
			}
			System.out.println();
			breakFlag = 1;
		}
		if(breakFlag == 1)break;
	}
	sc.close();
}
}
