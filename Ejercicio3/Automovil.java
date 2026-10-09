package Ejercicio3;


public class Automovil {

    enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    enum TipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    enum TipoColor {
        BLANCO, NEGRO, ROJO, NARANJA,
        AMARILLO, VERDE, AZUL, VIOLETA
    }

    static final int MULTA_POR_EXCESO = 100000;

    String marca;
    int modelo;
    double motor;
    TipoCombustible tipoCombustible;
    TipoAutomovil tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    TipoColor color;
    int velocidadActual = 0;

    boolean automatico;
    int cantidadMultas = 0;
    int valorTotalMultas = 0;

    Automovil(String marca, int modelo, double motor,
              TipoCombustible tipoCombustible,
              TipoAutomovil tipoAutomovil,
              int numeroPuertas, int cantidadAsientos,
              int velocidadMaxima, TipoColor color,
              boolean automatico) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.automatico = automatico;
    }

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    double getMotor() {
        return motor;
    }

    TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNumeroPuertas() {
        return numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    TipoColor getColor() {
        return color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    boolean getAutomatico() {
        return automatico;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(double motor) {
        this.motor = motor;
    }

    void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    void setColor(TipoColor color) {
        this.color = color;
    }

    void setVelocidadActual(int velocidadActual) {
        if (velocidadActual >= 0
                && velocidadActual <= velocidadMaxima) {
            this.velocidadActual = velocidadActual;
        } else {
            System.out.println("Velocidad no permitida.");
        }
    }

    void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }


    void acelerar(int incrementoVelocidad) {
        if (incrementoVelocidad <= 0) {
            System.out.println("El incremento debe ser positivo.");
        } else if (velocidadActual + incrementoVelocidad
                > velocidadMaxima) {

            cantidadMultas++;
            valorTotalMultas += MULTA_POR_EXCESO;

            System.out.println(
                "No se puede superar la velocidad maxima."
            );
            System.out.println("Se ha registrado una multa.");
        } else {
            velocidadActual += incrementoVelocidad;
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if (decrementoVelocidad <= 0) {
            System.out.println(
                "El decremento debe ser positivo."
            );
        } else if (velocidadActual - decrementoVelocidad < 0) {
            System.out.println(
                "No se puede alcanzar una velocidad negativa."
            );
        } else {
            velocidadActual -= decrementoVelocidad;
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(double distancia) {
        if (distancia < 0) {
            System.out.println("La distancia no puede ser negativa.");
            return -1;
        }

        if (velocidadActual == 0) {
            System.out.println(
                "No se puede calcular el tiempo con velocidad cero."
            );
            return -1;
        }

        return distancia / velocidadActual;
    }

    boolean tieneMultas() {
        return cantidadMultas > 0;
    }

    int calcularValorTotalMultas() {
        return valorTotalMultas;
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor (litros) = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automovil = " + tipoAutomovil);
        System.out.println("Numero de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad maxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Es automatico = " + automatico);
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("Cantidad de multas = " + cantidadMultas);
        System.out.println("Valor total de multas = $"
                + valorTotalMultas);
    }

    public static void main(String[] args) {

        Automovil auto1 = new Automovil(
                "Ford",
                2018,
                3.0,
                TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO,
                5,
                5,
                250,
                TipoColor.NEGRO,
                true
        );

        System.out.println("===== DATOS DEL AUTOMOVIL =====");
        auto1.imprimir();


        System.out.println("\n===== CAMBIOS DE VELOCIDAD =====");

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual() + " km/h");

        auto1.acelerar(20);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual() + " km/h");

        auto1.desacelerar(50);
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual() + " km/h");

        auto1.frenar();
        System.out.println("Velocidad actual = "
                + auto1.getVelocidadActual() + " km/h");


        auto1.setVelocidadActual(100);
        System.out.println("\nTiempo para recorrer 200 km = "
                + auto1.calcularTiempoLlegada(200) + " horas");


        System.out.println("\n===== PRUEBA DE MULTAS =====");

        auto1.setVelocidadActual(240);
        auto1.acelerar(20);

        System.out.println("¿Tiene multas? " + auto1.tieneMultas());
        System.out.println("Valor total de multas = $"
                + auto1.calcularValorTotalMultas());
    }
}
