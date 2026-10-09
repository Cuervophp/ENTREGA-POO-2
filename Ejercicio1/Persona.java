
public class Persona {

    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String paisNacimiento;
    char genero;

    Persona(String nombre, String apellidos,
            String numeroDocumentoIdentidad, int anioNacimiento,
            String paisNacimiento, char genero) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Numero de documento = "
                + numeroDocumentoIdentidad);
        System.out.println("Anio de nacimiento = " + anioNacimiento);
        System.out.println("Pais de nacimiento = " + paisNacimiento);
        System.out.println("Genero = " + genero);
        System.out.println();
    }

    public static void main(String[] args) {

        Persona p1 = new Persona(
                "Pedro", "Perez", "1053121010",
                1998, "Colombia", 'H');

        Persona p2 = new Persona(
                "Luis", "Leon", "1053223344",
                2001, "Colombia", 'H');

        p1.imprimir();
        p2.imprimir();
    }
}