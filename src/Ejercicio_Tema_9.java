import java.util.*;
public class Ejercicio_Tema_9 {
    public static void main(String[] args) {
        Persona2 persona = new Persona2();
        //Cliente cliente = new Cliente();
        int opcion;

        String nombre;
        int edad;
        Long numeroTelefono;
        double credito;
        float salario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la opción a ingresar:\n1-Cliente\n2-Trabajador\n0-Salir\nOpción seleccionada:");
        Scanner selectedOption = new Scanner(System.in);
        opcion = selectedOption.nextInt();
        selectedOption.nextLine(); // Limpia el búfer de entrada

        switch (opcion) {
            case 1://-> System.out.println("Opción seleccionada: " + selectedOption.nextInt());
                System.out.println("Ingrese el nombre:");
                nombre = scanner.nextLine();

                System.out.println("Ingrese la edad:");
                edad = scanner.nextInt();

                System.out.println("Ingrese el número de teléfono:");
                numeroTelefono = scanner.nextLong();
                //scanner.nextLine(); // Limpiamos el buffer

                // Pedimos los datos del cliente
                System.out.println("Ingrese el crédito:");
                credito = scanner.nextDouble();
                scanner.nextLine(); // Limpiamos el buffer

                Cliente cliente = new Cliente(nombre, edad, numeroTelefono, credito);

                // Mostramos los datos del cliente
                System.out.println("Datos del cliente:");
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Número de teléfono: " + cliente.getTelefono());
                System.out.println("Edad: " + cliente.getEdad());
                System.out.println("Crédito: " + cliente.getCredito());

                break;

            case 2:// -> System.out.println("Opción seleccionada: " + selectedOption.nextInt());
                System.out.println("Ingrese el nombre:");
                nombre = scanner.nextLine();

                System.out.println("Ingrese la edad:");
                edad = scanner.nextInt();

                System.out.println("Ingrese el número de teléfono:");
                numeroTelefono = scanner.nextLong();
                //scanner.nextLine(); // Limpiamos el buffer

                // Pedimos los datos del cliente
                System.out.println("Ingrese el salario:");
                salario = scanner.nextFloat();
                scanner.nextLine(); // Limpiamos el buffer

                Trabajador trabajador = new Trabajador(nombre,edad,numeroTelefono,salario);

                // Mostramos los datos del cliente
                System.out.println("Datos del trabajador:");
                System.out.println("Nombre: " + trabajador.getNombre());
                System.out.println("Número de teléfono: " + trabajador.getTelefono());
                System.out.println("Edad: " + trabajador.getEdad());
                System.out.println("Salario: " + trabajador.getSalario());
                break;

            default:// -> System.out.println("Opción seleccionada: " + selectedOption.nextInt());
                System.out.println("Gracias; vuelvas prontos");
                break;
        }


    }
}


class Persona2{
    int edad;
    Long telefono;
    String nombre;

    public Persona2(String nombre, int edad, Long telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona2() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Cliente extends Persona2{
    Double credito;

    public Cliente(String nombre, int edad, Long telefono, Double credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }
    public Cliente(){}

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona2{
    float salario;

    public Trabajador(String nombre, int edad, Long telefono, float salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }
    public Trabajador(){
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}