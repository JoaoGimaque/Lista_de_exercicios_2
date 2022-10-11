import java.util.Scanner;

public class ex07 {
	
	public static void converter(double metros) {
		
		System.out.println("km: " + metros / 1000);
		System.out.println("hm: "+ metros / 100);
		System.out.println("dam: "+ metros / 10);
		System.out.println("dm: "+ metros * 10);
		System.out.println("cm: "+ metros * 100);
		System.out.println("mm: "+ metros * 1000);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double metros = scanner.nextInt();
		
		converter(metros);
		
		scanner.close();
	}

}
