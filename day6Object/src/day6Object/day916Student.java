package day6Object;

public class day916Student {
 public static void main(String[] args){
	 stud st = new stud();
	 print(st);
	 new stud().age = 11;
	 new stud().name = "����";
	 new stud().play();
 }
 public static void print(stud s){
	 s.name="�Ƽ�";
	 s.age = 18;
	 s.play();
 }
}
class stud{
	 static String name;
	 //static int age;
	 int age;
	 public void play(){
		 System.out.println(age+"���"+name+"�ڴ���Ϸ");
	 }
}