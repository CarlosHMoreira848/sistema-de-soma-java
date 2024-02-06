import java.util.Scanner;
public class SistemaSoma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor1, valor2;
		System.out.println("Bem vindo ao sistema de soma! Para começar digite o primeiro valor: ");
		valor1 = input.nextInt();
		System.out.println("Muito bem! Agora digite o segundo valor para somar: ");
		valor2 = input.nextInt();
		int resultado = valor1 + valor2;
		System.out.println("O resultado da soma é: " + resultado + "!");
	}
}
