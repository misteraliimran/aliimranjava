package lesson3;


interface Eatable {
 void eat(String food);
}


interface Runable {
 int run(int number);
}

public class Animal2 implements Eatable, Runable {
 @Override
 public void eat(String food) {
     System.out.println("I am eating: " + food);
 }

 @Override
 public int run(int number) {
     return number * 20;
 }
}