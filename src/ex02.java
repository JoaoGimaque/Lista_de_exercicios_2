import java.util.Scanner;

public class ex02 {
	
	public static void verifica(int numero) {
		
		if(numero >0) {
			System.out.println("positivo");
		}else if (numero < 0){
			System.out.println("negativo");
		}else if(numero == 0) {
			System.out.println("zero");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		verifica(numero);
		
		scanner.close();

	}

}
