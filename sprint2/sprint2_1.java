package sprint2;

import java.util.Scanner;

/**
 * @author AngelMarin
 */

public class sprint2_1 {
    public static final double LARGO = 300.3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el ancho de la piscina 1:");
        double ancho1 = scanner.nextDouble();

        System.out.println("Introduce la profundidad de la piscina 1:");
        double profundidad1 = scanner.nextDouble();

        System.out.println("Introduce el ancho de la piscina 2:");
        double ancho2 = scanner.nextDouble();

        System.out.println("Introduce la profundidad de la piscina 2:");
        double profundidad2 = scanner.nextDouble();

        int area1 = (int) (ancho1 * LARGO);
        int volumen1 = (int) (area1 * profundidad1);

        int area2 = (int) (ancho2 * LARGO);
        int volumen2 = (int) (area2 * profundidad2);

        int areaTotal = area1 + area2;
        int volumenTotal = volumen1 + volumen2;
        int anchoTotal = (int) (ancho1 + ancho2);

        double profundidadTemp = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = profundidadTemp;

        int volumenNuevo1 = (int) (profundidad1 * area1);
        int volumenNuevo2 = (int) (profundidad2 * area2);

        System.out.println("Área de la piscina 1= " + area1);
        System.out.println("Área de la piscina 2= " + area2);
        System.out.println("Volumen de la piscina 1= " + volumen1);
        System.out.println("Volumen de la piscina 2= " + volumen2);
        System.out.println("Espacio ocupado= " + LARGO + " x " + anchoTotal);
        System.out.println("Área de las 2 piscinas= " + areaTotal);
        System.out.println("Volumen de las 2 piscinas juntas= " + volumenTotal);
        System.out.println("Volumen nuevo piscina 1= " + volumenNuevo1);
        System.out.println("Volumen nuevo piscina 2= " + volumenNuevo2);

        scanner.close();
} 
}