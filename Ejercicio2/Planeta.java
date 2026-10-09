package Ejercicio2;

public class Planeta {

    // Tipo enumerado
    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // Atributos
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    TipoPlaneta tipo;
    boolean esObservable = false;

    // Atributos de los ejercicios propuestos
    double periodoOrbital;
    double periodoRotacion;

    // Constructor
    Planeta(String nombre, int cantidadSatelites,
            double masa, double volumen, int diametro,
            int distanciaSol, TipoPlaneta tipo,
            boolean esObservable, double periodoOrbital,
            double periodoRotacion) {

        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Imprimir los datos del planeta
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satelites = "
                + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diametro del planeta = " + diametro);
        System.out.println("Distancia al Sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo orbital (anios) = "
                + periodoOrbital);
        System.out.println("Periodo de rotacion (dias) = "
                + periodoRotacion);
    }

    // Calcular la densidad
    double calcularDensidad() {
        return masa / volumen;
    }

    // Determinar si el planeta es exterior
    boolean esPlanetaExterior() {
        double limite = 3.4 * 149597870;

        return distanciaSol > limite;
    }

    // Metodo principal
    public static void main(String[] args) {

        Planeta p1 = new Planeta(
                "Tierra",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150000000,
                TipoPlaneta.TERRESTRE,
                true,
                1.0,
                1.0
        );

        Planeta p2 = new Planeta(
                "Jupiter",
                79,
                1.899E27,
                1.4313E15,
                139820,
                750000000,
                TipoPlaneta.GASEOSO,
                true,
                11.86,
                0.41
        );

        System.out.println("===== PLANETA 1 =====");
        p1.imprimir();
        System.out.println("Densidad = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = "
                + p1.esPlanetaExterior());

        System.out.println();

        System.out.println("===== PLANETA 2 =====");
        p2.imprimir();
        System.out.println("Densidad = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = "
                + p2.esPlanetaExterior());
    }
}