package javageneration;

import java.util.Scanner;

public class cursojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner leernombre = new Scanner(System.in);
        System.out.print("Como te llamas: ");
        String nombre = leernombre.nextLine();
        
        Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresas tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = curso(edad, nombre);
		System.out.println(mensaje);
	}

	public static String curso(int edad, String nombre) {
		String mensaje = "";
		if(edad >=18 && edad<=29) {
			mensaje = "Felicidades " + nombre + ", estas aceptado en "
					+ "el programa de generation Java Full Stack";
		} else {
			mensaje = "No cumples lo requisitos para el bootcamp "
					+ "Java Full Stack";
		}
		
		return mensaje;
	}
}