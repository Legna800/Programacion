public class Ejercicio1 {
    public static void main(String[] args) {
        int edad = 5; // valor para probar diferentes casos
        int ciclo = 0;
        int curso = 0;

        if (edad < 3) {
            System.out.println("Es demasiado pequeno");
        } else if (edad < 6) {
            ciclo = 0;
        } else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        } else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        } else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        } else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        } else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        } else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        } else {
            System.out.println("Es demasiado grande");
        }

        switch (ciclo) {
            case 0:
                System.out.println("Es de educacion infantil");
                break;
            case 1:
                System.out.println("Es de educacion primaria. Ciclo inicial.");
                break;
            case 2:
                System.out.println("Es de educacion primaria. Ciclo medio.");
                break;
            case 3:
                System.out.println("Es de educacion primaria. Ciclo superior.");
                break;
        }
        System.out.println("Curso: " + curso);
    }
}