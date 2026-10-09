package Ejercicio5;


public class CuentaBancaria {

    enum TipoCuenta {
        AHORROS,
        CORRIENTE
    }

    private String nombresTitular;
    private String apellidosTitular;
    private int numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private double porcentajeInteresMensual;

    public CuentaBancaria(
            String nombresTitular,
            String apellidosTitular,
            int numeroCuenta,
            TipoCuenta tipoCuenta,
            double porcentajeInteresMensual) {

        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
        this.saldo = 0;
    }

    public void imprimir() {
        System.out.println("Nombres del titular: " + nombresTitular);
        System.out.println("Apellidos del titular: " + apellidosTitular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println(
                "Interes mensual: " + porcentajeInteresMensual + "%");
    }

    public void consultarSaldo() {
        System.out.printf("Saldo actual: $%.2f%n", saldo);
    }

    public boolean consignar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf(
                    "Consignacion exitosa: $%d. Nuevo saldo: $%.2f%n",
                    valor, saldo);
            return true;
        } else {
            System.out.println(
                    "El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    public boolean retirar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf(
                    "Retiro exitoso: $%d. Nuevo saldo: $%.2f%n",
                    valor, saldo);
            return true;
        } else {
            System.out.println(
                    "Retiro no valido: verifica el valor y el saldo.");
            return false;
        }
    }

    public void aplicarInteresMensual() {
        if (porcentajeInteresMensual >= 0) {
            double interes = saldo * porcentajeInteresMensual / 100;
            saldo += interes;

            System.out.printf(
                    "Interes aplicado: $%.2f. Nuevo saldo: $%.2f%n",
                    interes, saldo);
        } else {
            System.out.println(
                    "El porcentaje de interes no puede ser negativo.");
        }
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(
                "Pedro",
                "Perez",
                123456789,
                TipoCuenta.AHORROS,
                2.0
        );

        System.out.println("=== DATOS DE LA CUENTA ===");
        cuenta.imprimir();

        System.out.println("\n=== OPERACIONES BANCARIAS ===");
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);

        System.out.println("\n=== APLICAR INTERES MENSUAL ===");
        cuenta.aplicarInteresMensual();

        System.out.println("\n=== SALDO FINAL ===");
        cuenta.consultarSaldo();
    }
}
