package Ejercicio4;


public class TrianguloRectangulo {

    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (double) base * altura / 2;
    }

    double calcularHipotenusa() {
        return Math.sqrt(
            Math.pow(base, 2) + Math.pow(altura, 2)
        );
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    void determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();

        if (base == altura && base == hipotenusa) {
            System.out.println("Es un triangulo equilatero");
        } else if (base != altura
                && base != hipotenusa
                && altura != hipotenusa) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }
}
