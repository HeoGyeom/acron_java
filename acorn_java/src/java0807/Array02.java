package java0807;

public class Array02 {
public static void main(String[] args) {
	int iArr[] = new int [10];
	for (int i=9, j=0; i>=0; i--, j++) {
		iArr[j] = i+1;
	}
	for(int i =0; i<10; i++) {
		System.out.print(iArr[i] + " ");
		}
	}
}
