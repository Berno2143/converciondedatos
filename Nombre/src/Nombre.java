import java.util.Scanner;
public class Nombre {

    public static void main(String[] args)
	{
		String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Como te llamas: ");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("¡Como estas " + nombre + "!");
        System.out.println("¡Espero y te encuentres bien!");
        System.out.println("¡Bueno " + nombre + " Adios!");
	}
}

