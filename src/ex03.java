import java.util.Scanner;

public class ex03 {
	
	public static void maior(int num1,int num2) {
		
		if(num1 > num2 ) {
			System.out.println("o primeiro numero e maior");
		}else if(num1 < num2) {
			System.out.println("o segundo numero e maior");
		} else if(num1 == num2) {
			System.out.println("sao iguais");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		maior(numero1, numero2);
		
		scanner.close();
	}

}
