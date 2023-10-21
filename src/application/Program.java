package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//CÁLCULO DO IMC
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		System.out.print("MASSA(KG): ");
		double kg = t.nextDouble();
		System.out.print("ALTURA(m): ");
		double m = t.nextDouble();
		
		double imc = kg / (Math.pow(m, 2));
		
		if(imc < 17) {
			System.out.println("Muito abaixo do peso!");
		} 
		else if (imc >= 17 && imc < 18.5) {
			System.out.println("Abaixo do peso!");
		} 
		else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso ideal!");
		} 
		else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso!");
		} 
		else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade!");
		} 
		else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade severa!");
		} 
		else {
			System.out.println("Obesidade mórbida!");
		}

	}

}
