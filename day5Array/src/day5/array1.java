/*package day5;


public class array1 {
	public static void main(String[] args){
		System.out.println("hello!");
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int arr3[] = arr2;
		System.out.println(arr1[0]);
		System.out.println(arr1);
		arr1[0]=10;arr1[1]=20;arr2[0]=30;arr3[1]=40;arr3[0]=50;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr3[1]);
		System.out.println(arr2);
		System.out.println(arr3);
		arr1 = null;
		System.out.println(arr1[0]);
		//System.out.println(arr1[1]);
		//System.out.println(arr3[4]);
	}
}
import java.util.Random;

public class array1 {

	public enum Weekdays{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int day = rd.nextInt(7) + 1;
		System.out.println(day);
		
		
		switch (day) {
		case MONDAY:
			System.out.println("����������һ��");
			break;
		case TUESDAY:
			System.out.println("���������ڶ���");
			break;
		case WEDNESDAY:
			System.out.println("��������������");
			break;
		case THURSDAY:
			System.out.println("�����������ģ�");
			break;
		case FRIDAY:
			System.out.println("�����������壡");
			break;
		case SATURDAY:
			System.out.println("��������������");
			break;
		default:
			System.out.println("�����������գ�");
			break;
		}
	}
}*/