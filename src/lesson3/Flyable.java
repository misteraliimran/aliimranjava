package lesson3;

package lesson3;

//Flyable interface
interface Flyable {
void fly(String name);
}

public class Main {
public static void main(String[] args) {

   // 1-ci anonim sinif - Quş
   Flyable bird = new Flyable() {
       @Override
       public void fly(String name) {
           System.out.println(name + " göydə uçur 🕊️");
       }
   };

   // 2-ci anonim sinif - Kəpənək
   Flyable butterfly = new Flyable() {
       @Override
       public void fly(String name) {
           System.out.println(name + " çiçəklərin üzərində uçur 🦋");
       }
   };

   // 3-cü anonim sinif - Yarasa
   Flyable bat = new Flyable() {
       @Override
       public void fly(String name) {
           System.out.println(name + " gecə uçur 🦇");
       }
   };

   // İstifadə
   bird.fly("Qartal");
   butterfly.fly("Kəpənək");
   bat.fly("Yarasa");
}
}