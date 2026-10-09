package Ejercicio4;


public class PruebaFiguras {

    public static void main(String[] args) {

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 =
                new TrianguloRectangulo(3, 5);

        Rombo figura5 = new Rombo(8, 6, 5);
        Trapecio figura6 =
                new Trapecio(8, 4, 3, 5, 5);

        System.out.println("===== CIRCULO =====");
        System.out.println("Area = " + figura1.calcularArea());
        System.out.println("Perimetro = "
                + figura1.calcularPerimetro());

        System.out.println("\n===== RECTANGULO =====");
        System.out.println("Area = " + figura2.calcularArea());
        System.out.println("Perimetro = "
                + figura2.calcularPerimetro());

        System.out.println("\n===== CUADRADO =====");
        System.out.println("Area = " + figura3.calcularArea());
        System.out.println("Perimetro = "
                + figura3.calcularPerimetro());

        System.out.println("\n===== TRIANGULO RECTANGULO =====");
        System.out.println("Area = " + figura4.calcularArea());
        System.out.println("Hipotenusa = "
                + figura4.calcularHipotenusa());
        System.out.println("Perimetro = "
                + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        System.out.println("\n===== ROMBO =====");
        System.out.println("Area = " + figura5.calcularArea());
        System.out.println("Perimetro = "
                + figura5.calcularPerimetro());

        System.out.println("\n===== TRAPECIO =====");
        System.out.println("Area = " + figura6.calcularArea());
        System.out.println("Perimetro = "
                + figura6.calcularPerimetro());
    }
}
