package lesson7;

public class Main {
	 public static void main(String[] args) {
	     User user = new User();

	     try {
	         user.setAge(18);
	         System.out.println("İstifadəçinin yaşı: " + user.getAge());
	     } catch (AgeException e) {
	    	 System.out.println(e.getMessage());
}
	 }
}