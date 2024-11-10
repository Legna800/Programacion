public class Ejercicio2 { 
    public static void main(String[] args) { 
        int temperatura = 39; 
        int edad = 10; 
        int dosisParacetamol;

        if (temperatura < 38) {
            System.out.println("El nino esta bien");
        } else if (temperatura < 39) {
            System.out.println("Es recomendable darle un bano para bajar la temperatura");
        } else if (edad < 3) {
            System.out.println("Debes consultar al medico");
        } else if (edad < 12) {
            int peso = 10; // valor para probar diferentes casos
            dosisParacetamol = 15 * peso;
            System.out.println("Aviso: debes darle: " + dosisParacetamol + " mg cada 8h");
        } else {
            dosisParacetamol = 500;
            System.out.println("Aviso: debes darle: " + dosisParacetamol + " mg cada 8h");
        }

        if (temperatura >= 40) {
            System.out.println("Aviso: por mas de 40 debes llevarlo al hospital");
        }
    }
}