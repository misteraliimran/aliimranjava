package lesson7;

public class User {
	 private int age;

	 public void setAge(int age) throws AgeException {
	     if (age < 14) {
	         throw new AgeException("Yaş 14-dən az ola bilməz!");
	     }
	     this.age = age;
	 }

	 public int getAge() {
	     return age;
	 }
	}