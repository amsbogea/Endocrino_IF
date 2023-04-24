package endocrino_IF;

import java.util.Scanner;

public class Endocrino_IF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double peso, altura,imc;
		
		System.out.println("Informe a altura em metros.");
		altura = input.nextDouble();
		
		System.out.println("Informe o peso em Kg.");
		peso = input.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 20 ) {
			System.out.println("Abaixo do peso");
		}else if (imc >= 20 && imc <=25) {
			System.out.println("Normal");
		}else if (imc > 25 && imc <=30) {
			System.out.println("Excesso de peso");
		}else if (imc > 30 && imc <= 35) {
			System.out.println("Obesidade");
		}else {
			System.out.println("Obesidade Mórbida");
		}
		
		input.close();
	}

}
