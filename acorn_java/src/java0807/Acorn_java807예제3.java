package java0807;

import java.util.Scanner;

public class Acorn_java807����3 {
	public static void main(String[] args) {
		System.out.println("�����մϴ�, �հ��Դϴ�!");
		
		System.out.println("���հ��Դϴ�.");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("��������:");
		int iNlscore = sc.nextInt();
		
		System.out.println("��������:");
		int iMathscore = sc.nextInt();
		
		System.out.println("��������:");
		int iEngscore = sc.nextInt();
		
		
		int iSum = (iNlscore+iEngscore+iMathscore);
		System.out.println("�� ������ �� �� :"+iSum);
		
		int midscore = (iSum /3);
		System.out.println("�� ������ ���"+midscore);
		
	}
}
