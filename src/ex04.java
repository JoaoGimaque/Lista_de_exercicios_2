import java.util.Scanner;

public class ex04 {
	
	public static void verifica(int numero) {
		if(numero%2 == 0){
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		verifica(numero);
		
		scanner.close();
	}

}
