package cn.jp.test;

public class Puppy {
   int puppyAge;
   
   public Puppy(String name){
	   System.out.println("С����������" + name);
   }
   
   public void setAge(int age){
	   puppyAge = age;
   }
   public int getAge(){
	   System.out.println("С����������" + puppyAge);
	   return puppyAge;
   }
   
   
   public static void main(String[] args){
	   Puppy myPubby = new Puppy("tommy");
	   myPubby.setAge(2);
	   myPubby.getAge();
	   System.out.println("����ֵ" + myPubby.puppyAge);
	   
   }
}
