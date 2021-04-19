package Loops;

public class Forloop {
	int i;

	public static void main(String[] args) {

		System.out.println("The numbers are :");
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("------------");
		Forloop f = new Forloop();
		f.forLoop();
	}

	public void forLoop() {
		for (int i = 1; i <= 20; i = i + 1) {
			System.out.println(i);
		}
		

	}

}
