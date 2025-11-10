package dec20;

import java.util.Scanner;

public class Shertler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Yetişkinsən");
        } else {
            System.out.println("Uşaqsan");
        }

        System.out.print("Birinci ədədi daxil edin: ");
        int a = input.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Birinci ədəd böyükdür");
        } else if (a == b) {
            System.out.println("İki ədəd bərabərdir");
        } else {
            System.out.println("İkinci ədəd böyükdür");
        }

        System.out.print("Riyaziyyat balını daxil edin: ");
        int riy = input.nextInt();

        System.out.print("Fizika balını daxil edin: ");
        int fiz = input.nextInt();

        if (riy >= 60 && fiz >= 70) {
            System.out.println("Hər iki dərsdən keçdiniz");
        } else if (riy < 60 && fiz < 70) {
            System.out.println("Hər iki dərsdən kəsildiniz");
        } else {
            System.out.println("Bir fənndən keçdiniz, digərində kəsildiniz");
        }

        input.nextLine();
        System.out.print("Həftənin bir gününü daxil edin: ");
        String gun = input.nextLine();

        if (gun.equalsIgnoreCase("Şənbə") || gun.equalsIgnoreCase("Bazar")) {
            System.out.println("Həftə sonu");
        } else if (gun.equalsIgnoreCase("Bazar ertəsi") || gun.equalsIgnoreCase("Cümə")) {
            System.out.println("Həftənin başlanğıcı və ya sonu");
        } else {
            System.out.println("Həftə içi");
        }

        System.out.print("Gün nömrəsini daxil edin (1-7): ");
        int gunNomre = input.nextInt();

        switch (gunNomre) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi!");
        }

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ay = input.nextInt();

        switch (ay) {
            case 12: case 1: case 2:
                System.out.println("Fəsil: Qış");
                break;
            case 3: case 4: case 5:
                System.out.println("Fəsil: Yaz");
                break;
            case 6: case 7: case 8:
                System.out.println("Fəsil: Yay");
                break;
            case 9: case 10: case 11:
                System.out.println("Fəsil: Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi!");
        }

        switch (ay) {
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("İyun");
                break;
            case 7:
                System.out.println("İyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi!");
        }

        System.out.println("\nMəhsul seçin:");
        System.out.println("1. Alma");
        System.out.println("2. Portağal");
        System.out.println("3. Banan");
        System.out.println("4. Üzüm");

        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Alma - 1.5 AZN");
                break;
            case 2:
                System.out.println("Portağal - 2.0 AZN");
                break;
            case 3:
                System.out.println("Banan - 1.8 AZN");
                break;
            case 4:
                System.out.println("Üzüm - 3.0 AZN");
                break;
            default:
                System.out.println("Yanlış məhsul seçimi!");
        }

        input.close();
    }
}
