import java.util.Scanner;

public class ex08 {
	
	public static void imc(double altura, double peso) {
		
		double imc = peso / (altura*altura);
		
		 if (imc < 17) {
			 System.out.println("muito abaixo do peso");
		 }else if (imc < 18.5) {
	        	System.out.println("abaixo do peso");
		 }else if (imc < 25) {
	        	System.out.println("com o peso normal");
		 }else if (imc < 30) {
	        	System.out.println("acima do peso");
		 }else if (imc < 35) {
	        	System.out.println("com obesidade 1");
		 }else if (imc < 40 ) {
	        	System.out.println("com obesidade 2 (severa)");
		 }else {
	        	System.out.println("com obesidade 3 (móbida)");
		 }
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double altura = scanner.nextDouble();
		double peso = scanner.nextDouble();
		
		imc(altura, peso);
		
		scanner.close();
	}

}
