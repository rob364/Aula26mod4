import java.util.Locale;
import java.util.Scanner;

public class Aula26mod4 {

	public static void main(String[] args) {
		//Entrada de dados com scanner sc
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Exercicio 1
		//String x;
		//x = sc.next();//O x recebe sc.next que me dara o direito de digitar no console, essa palavra ficara armazenada dentro de x
		//System.out.println("Você digitou: " + x);
		//sc.close();//esse comando encerra a varaivel sc
		
		//Exercicio 2 
		//int x;
		//x = sc.nextInt();//como a varaivel é do tipo inteiro é necessario colocar o nextInt
		//System.out.println("você digitou:" + x);
		
		//sc.close();

		//Exercicio 3 o Scanner com .flutuante
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Você digitou:" + x);
	
		//sc.close();
		
		
		//Exercicio 3 o Scanner com .flutuante
		
		//double x;
		//x = sc.nextDouble();
		//System.out.printf("Você digitou: %.2f%n", x);
	
		//sc.close();
		
		//Exercicio 4
		//char x;
		//x = sc.next().charAt(0);//vai permitir ler o dado somente da primeira linha.
		//System.out.println("Você digitou:" + x);
		
		//sc.close();
		
		//Exercicio 5
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
		
	}

}
