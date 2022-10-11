import java.util.Scanner;

public class ex06 {
	
	public static void validar(int idade) {
		if(idade <= 0 || idade >= 150) {
			System.out.println("idade invalida, tente novamente");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = scanner.nextInt();
		
		validar(idade);
		
		scanner.close();
		
	}
	
}
