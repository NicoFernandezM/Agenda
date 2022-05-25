import java.util.Scanner;

public class CrearContacto {
    private static Scanner scanner = new Scanner(System.in);

    public static String darNombre() {
        System.out.println("Por favor ingrese el nombre.");
        return scanner.nextLine();
    }

    public static String darApellido() {
        System.out.println("Por favor ingrese el apellido.");
        return scanner.nextLine();
    }

    public static String darNumeroTelefonico() {
        System.out.println("Por favor ingrese el número telefónico.");
        return scanner.nextLine();
    }

    public static String darDireccion() {
        System.out.println("Por favor ingrese la dirección.");
        return scanner.nextLine();
    }

    /*public static Contacto getContacto() {

    }*/
}
