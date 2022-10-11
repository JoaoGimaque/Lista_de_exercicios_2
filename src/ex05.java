import java.util.Scanner;

public class ex05 {
	
	public static void verifica(int numero) {
		
		if(numero>=18){
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		verifica(numero);
		
		scanner.close();

	}

}
