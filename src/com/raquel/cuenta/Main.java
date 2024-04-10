package com.raquel.cuenta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creación de nuestro objeto Cuenta (el único con el que interectuaremos)
		Cuenta nuestraCuenta = new Cuenta("Raquel", 13.5);

		// Menu
		try (Scanner scan = new Scanner(System.in)) {
			boolean salir = false;
			int opcion;

			System.out.println("¡Bienvenido/a a MiBanca!");
			while (!salir) {
				System.out.println("Eliga una de las siguientes opciones: ");
				System.out.println(" 1. Consultar saldo\n 2. Ingresar\n 3. Retirar\n 4. Salir");

				opcion = scan.nextInt();

				switch (opcion) {
				// Consultar saldo
				case 1:
					System.out.println("El saldo de su cuenta es de: " + nuestraCuenta.getCantidad() + "€");
					break;
				// Ingresar saldo
				case 2:
					System.out.println("Introduzca la cantidad a ingresar: ");
					double ingreso = scan.nextDouble();
					nuestraCuenta.ingresar(ingreso);
					break;
				// Retirar saldo
				case 3:
					System.out.println("Introduzca la cantidad a retirar: ");
					double retiro = scan.nextDouble();
					nuestraCuenta.retirar(retiro);
					break;
				// Salir
				case 4:
					salir = true;
					System.out.println("¡Hasta luego!");
					break;
				default:
					System.out.println("Debe elegir entre 1 y 4");
				}

			}
		}

	}

}
