package lesson4;

public class Main {
    public static void main(String[] args) {
        String text = "Mənim kodum sənin kodundan yaxşıdır. Mən kodu yaxşı yazıram.";
        String word = "kod";

        int index = text.indexOf(word);
        int count = 0;
        while (index != -1) {
            System.out.println("Tapıldı indeksdə: " + index);
            count++;
            index = text.indexOf(word, index + 1);
        }
        System.out.println("Kod sözü ümumilikdə " + count + " dəfə yazılıb.");
    }
}
