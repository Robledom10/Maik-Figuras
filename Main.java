import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Calculadora de Áreas ===");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Elige una figura: ");
        Integer opcion = scan.nextInt();
        scan.nextLine();

        Figura figura = null;

        switch (opcion) {
            case 1:
                System.out.print("Escribe el nombre del círculo: ");
                String nombreCirculo = scan.nextLine();
                System.out.print("Escribe el radio: ");
                Double radio = scan.nextDouble();
                figura = new Circulo(nombreCirculo, radio);
                break;

            case 2:
                System.out.print("Escribe el nombre del cuadrado: ");
                String nombreCuadrado = scan.nextLine();
                System.out.print("Escribe el lado: ");
                Double lado = scan.nextDouble();
                figura = new Cuadrado(nombreCuadrado, lado);
                break;

            case 3:
                System.out.print("Escribe el nombre del triángulo: ");
                String nombreTriangulo = scan.nextLine();
                System.out.print("Escribe la base: ");
                Double base = scan.nextDouble();
                System.out.print("Escribe la altura: ");
                Double altura = scan.nextDouble();

                figura = new Triangulo(nombreTriangulo, base, altura);
                break;

            default:
                System.out.println("Opción no válida");
        }

        if (figura != null) {
            System.out.println("\nFigura: " + figura.getNombre());
            System.out.println("Área: " + figura.calcularArea());
        }

        scan.close();
    }
}
