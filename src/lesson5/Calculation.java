package lesson5;

public class Calculation {
    public void setPrice(Object obj) {
        if (obj instanceof Car) { // evvelceden yoxlayiriq
            Car car = (Car) obj; // casting
              if (car.year < 2000) {
                car.price = 2000;
            } else if (car.year < 2015) {
                car.price = 10000;
            } else {
                car.price = 20000;
            }
        }else {
           System.out.println("Obyekt Car tipində deyil!");
        }
        }
    }
