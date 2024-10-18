package en_proceso;

/**
 * @author AngelMarin
 */
public class piscinas {
    public static void main(String[] args) {
        
        int largo1 = 300;
        int ancho1 = 150;
        int profundo1 = 20;
        int area1 = ancho1 * largo1;
        int volumen1 = area1 * profundo1;

        int largo2 = 300;
        int ancho2 = 80;
        int profundo2 = 35;
        int area2 = ancho2 * largo2;
        int volumen2 = area2 * profundo2;

        int areaTotal = area1+area2;
        int volumenTotal = volumen1+volumen2;
        int anchoTotal = ancho1+ancho2;

        int profundidadTemp = profundo1;
        profundo1 = profundo2;
        profundo2 = profundidadTemp;

        int VolumenNuevo1 = profundo1 * area1;
        int VolumenNuevo2 = profundo2 * area2;

        // Mostrar el mensaje en pantalla
        System.out.println("Área de la piscina 1= " + area1);
        System.out.println("Área de la piscina 2= " + area2);
        System.out.println("Volumen de la piscina 1= " + volumen1);
        System.out.println("Volumen de la piscina 2= " + volumen2);
        System.out.println("Espacio ocupado= " + largo1 + " x " + anchoTotal);
        System.out.println("Area de las 2 piscinas= " + areaTotal);
        System.out.println("Volumen de las 2 piscinas juntas= " + volumenTotal);
        System.out.println("Volumen nuevo piscina 1= " + VolumenNuevo1);
        System.out.println("Volumen nuevo piscina 2= " + VolumenNuevo2);
    }
}