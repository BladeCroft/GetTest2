package day5;

import java.util.Scanner;

public class arr5week {
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������1-7�����֣�ϵͳ��Ϊ���Զ�ת�������ڼ�");
		int week = sc.nextInt();
		System.out.println("����" + getweek(week));*/
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ӧ�����ڷ�Χ��1-7");
		int week = sc.nextInt();

		System.out.println("����" + getweek(week));
	}
	public static char getweek(int week) {
		char[] arr = {' ','һ','��','��','��','��','��','��'};		//������һ�����ڱ�
		return arr[week];											//ͨ��������ȡ���е�Ԫ��
	}
}
