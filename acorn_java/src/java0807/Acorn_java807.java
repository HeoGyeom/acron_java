package java0807;

import java.util.Scanner;

public class Acorn_java807 {
	public static void main(String[] args) {
		System.out.println("1.�Է� ");
		System.out.println("2.���� ");
		System.out.println("3.��ȸ ");
		System.out.println("4.���� ");
		System.out.println("5.���� ");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� >>>> ");
		
		Scanner sc = new Scanner(System.in);
		int iUserInputValue = sc.nextInt();
		
		if(iUserInputValue == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		}else if (iUserInputValue == 2) {
			System.out.println("���� �޴��Դϴ�.");
		}else if (iUserInputValue == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		}else if (iUserInputValue == 4) {
			System.out.println("���� �޴��Դϴ�.");
		}else if (iUserInputValue == 5) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else {
			System.out.println("������ �� ���� �޴��Դϴ�.");
		}
		
		
}
}