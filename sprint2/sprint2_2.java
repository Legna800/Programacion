import java.util.Scanner;

public class Carpeta {
    public static void main(String[] args) {
        int puntos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de orden de inscripcion:");
        int numeroInscripcion = scanner.nextInt(); 

        System.out.println("Cuantos hermanos tienes en el centro?");
        int hermanos = scanner.nextInt();
        if (hermanos >= 1) {
            puntos += 40; 
        }

        System.out.println("Vives en la misma poblacion? (si/no)");
        String mismaPoblacion = scanner.next();
        if (mismaPoblacion.equals("si")) {
            puntos += 30; 
        } else if (mismaPoblacion.equals("no")) {
            System.out.println("Tu padre o madre trabaja en la misma poblacion? (si/no)");
            String trabajaMismaPoblacion = scanner.next();
            if (trabajaMismaPoblacion.equals("si")) {
                puntos += 20; 
            }
        }

        System.out.println("Tienes alguna discapacidad igual o superior al 33% o enfermedad cronica? (si/no)");
        String discapacidad = scanner.next();
        if (discapacidad.equals("si")) {
            puntos += 10; 
        }

        System.out.println("Formas parte de una familia numerosa o monoparental? (si/no)");
        String familiaNumerosa = scanner.next();
        if (familiaNumerosa.equals("si")) {
            puntos += 15; 
        }

        System.out.println("Tu padre, madre, tutor legal o hermano ha estado escolarizado en la misma escuela? (si/no)");
        String escolarizado = scanner.next();
        if (escolarizado.equals("si")) {
            puntos += 5; 
        }

        scanner.close();
        System.out.println("Total de puntos para el niño / a con numero de inscripcion " + numeroInscripcion + ": " + puntos);
    }
}