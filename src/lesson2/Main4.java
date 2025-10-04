package lesson2;

public class Main4 {
	public static void main(String[] args) {
		int i = 1;
		int tekCem = 0;
		int cutCem = 0;

		while (i <= 100) {
			if (i % 2 == 0) {
				cutCem += i;
			} else {
				tekCem += i;
			}
			i++;
		}

		int ferq = tekCem - cutCem;
		System.out.println("Tək cəmi: " + tekCem);
		System.out.println("Cüt cəmi: " + cutCem);
		System.out.println("Fərq: " + ferq);
	}
}
