package day6Object;

public class demo916student {
	public static void main(String[] args){
		System.out.println("Monster Hunter World����ice");
		student С�� = new student();
		С��.name = "·������С��";
		С��.age = 22;
		С��.gender = "��";
		С��.study();
		student faiz = new student();
		faiz.name = "��ү";
		faiz.study();
		//System.out.println(С��.name);
	}

}
class student{
	String name;
	int age;
	String gender;
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
}
class ohone{
	String brand;
	int price;
	public void play(){
		System.out.println("�ͺ���������");
	}
	public void call(){
		System.out.println("110");
	}public void message(){
		System.out.println("�༭hello world");
	}
}