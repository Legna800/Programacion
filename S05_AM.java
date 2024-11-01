import java.util.Scanner;

public class S05_AM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numRegistro = -1;
        int tieneHermano = -1;
        int viveEnZona = -1;
        boolean esCorrecto;

        System.out.print("Numero de registro del niño: ");
        esCorrecto = scanner.hasNextInt();
        if (esCorrecto) {
            numRegistro = scanner.nextInt();
            if (numRegistro < 0 || numRegistro > 499) {
                System.out.println("Numero de registro incorrecto");
                return;
            }
        } else {
            System.out.println("Entrada no valida. Debe ser un numero entero");
            return;
        }

        System.out.print("Tienes algun hermano en el centro (0:no / 1:si)? ");
        esCorrecto = scanner.hasNextInt();
        if (esCorrecto) {
            tieneHermano = scanner.nextInt();
            if (tieneHermano != 0 && tieneHermano != 1) {
                System.out.println("Datos incorrectos. Debe ser 0 o 1");
                return;
            }
        } else {
            System.out.println("No valido. Debe ser un numero entero");
            return;
        }

        System.out.print("Vives en la zona de la escuela (0:no / 1:si)? ");
        esCorrecto = scanner.hasNextInt();
        if (esCorrecto) {
            viveEnZona = scanner.nextInt();
            if (viveEnZona != 0 && viveEnZona != 1) {
                System.out.println("Datos incorrectos. Debe ser 0 o 1");
                return;
            }
        } else {
            System.out.println("Entrada no valida. Debe ser un numero entero");
            return;
        }

        System.out.println("Datos introducidos correctamente");
        System.out.println("Número de registro: " + numRegistro);
        System.out.println("Tiene hermanos en el centro: " + (tieneHermano == 1 ? "Si" : "No"));
        System.out.println("Vive en la zona de la escuela: " + (viveEnZona == 1 ? "Si" : "No"));

        scanner.close();
    }
}