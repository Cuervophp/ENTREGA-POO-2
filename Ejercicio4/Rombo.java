package Ejercicio4;


public class Rombo {

    double diagonalMayor;
    double diagonalMenor;
    double lado;

    public Rombo(double diagonalMayor,
                 double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    double calcularArea() {
        return diagonalMayor * diagonalMenor / 2;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}