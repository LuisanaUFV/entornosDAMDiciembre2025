package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int antiguedad = 0;
		System.out.println("Introduce antiguedad:");
		antiguedad = sc.nextInt();
		Salario salario = new Salario(antiguedad, 200);
		System.out.println("Salario final: " + salario.calcularSalarioFinal());
		
		sc.close();
				

	}

}
