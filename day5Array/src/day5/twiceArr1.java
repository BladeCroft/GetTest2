package day5;

public class twiceArr1 {
 public static void main(String[]args){
	 int [][] arr1 = new int [2][3];
	 System.out.println(arr1);
	 System.out.println(arr1[0]);
	 System.out.println(arr1[1][2]);
	 int[][] arr = new int[3][];				//����һ����ά����,�����ά������������һά����,����һά���鶼û�б���ֵ
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[3];					//��һ��һά�����п��Դ洢����intֵ
		arr[1] = new int[5];					//�ڶ���һά�����п��Դ洢���intֵ
		System.out.println("------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
 }
}
