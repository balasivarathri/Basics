package ConditionalStatements;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.print("Even Numbers from 1 to 100 are :");
			for(int i=1;i<=100;i++) {
			if(i%2==0)
				System.out.print(i + " ");
			}
		System.out.println("\n");
		System.out.print("Odd Numbers from 1 to 100 are :");
	
		for(int j=1;j<=100;j++) {
			if(j%2!=0)
				System.out.print(j + " ");
			
				}
	}
}
