package java0807;

import java.util.Scanner;

public class Acorn_javaswitch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int iMonth = sc.nextInt();
//	if((iMonth >= 3) && (iMonth <=6)){
//		System.out.println(iMonth +"���� ���Դϴ�.");
//	} else if ((iMonth>=7)&&(iMonth<=8)){
//		System.out.println(iMonth +"���� �����Դϴ�");
//	}else if ((iMonth>=9)&&(iMonth<=11)) {
//		System.out.println(iMonth +"���� �����Դϴ�.");
//	}else if ((iMonth==12)&&(iMonth>=2)){
//		System.out.println(iMonth+"���� �ܿ��Դϴ�.");
//	}else {
//		System.out.println(iMonth+"���� �߸� �Էµ� ���Դϴ�.");
//	}
	
	
	
	switch(iMonth) {
	case 3:
	case 4:
	case 5:
	case 6:
		System.out.println(iMonth + "���� ���Դϴ�.");
		break;
	case 7:
	case 8:
		System.out.println(iMonth + "���� �����Դϴ�.");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println(iMonth + "���� �����Դϴ�.");
		break;
	case 12:	
	case 1:	
	case 2:	
		System.out.println(iMonth + "���� �ܿ��Դϴ�.");
		break;
	default:
		System.out.println(iMonth +"���� �߸� �Էµ� ���Դϴ�.");
		 break;
	}
	
}
}
