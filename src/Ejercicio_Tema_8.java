import java.util.*;
public class Ejercicio_Tema_8 {
    public static void main(String[] args) {
       // Persona persona = new Persona();
        //Validations validar = new Validations();
        Persona persona = null;
        String nombre;
        String telefono;
        String edad;

        //Solicito el nombre de la persona
        System.out.println("Ingrese el nombre de la persona:");
        Scanner info = new Scanner(System.in);
        nombre = info.nextLine();
        System.out.println("Se ingresa el siguiente Nombre: "+nombre);

        //Solicito la edad de la persona
        System.out.println("Ingrese la edad :");
        edad = info.nextLine();
        System.out.println("Se ingresa el siguiente Edad: "+edad);

        //Solicito el telefono de la persona
        System.out.println("Ingrese el numero de telefono :");
        telefono = info.nextLine();
        System.out.println("Se ingresa el siguiente telefono: "+telefono);

        if(Validations.isNumber(telefono) && Validations.isNumber(edad)){
            persona = new Persona(nombre,Long.valueOf(telefono),Integer.valueOf(edad));
        }
        System.out.println("El nombre de la persona es: "+persona.getNombre().toUpperCase()+"\nSu edad es: "+persona.getEdad()+"\nEl numero de telefono es: "+persona.getTelefono());


    }
}

class Persona {
    private String nombre = "";
    private long telefono = 0;
    private int edad = 0;

    public Persona(String nombre, long telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }


    /*

    METODOS SET
     - Creo el método de seteo.
     - Es de tipo privado, con lo cual solo la clase persona podrá invocarlo.
     - El set no retorna ningun valor, con lo cual es de tipo void.
    */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setTelefono (long telefono){
        this.telefono = telefono;
    }

    /*
    METODOS GET
    - Se crea el método de get.
    - Este método permite retornar el valor correspondiente al tipo.
     */
    public String getNombre (){
        return this.nombre;
    }
    public int getEdad (){
        return this.edad;
    }
    public long getTelefono (){
        return this.telefono;
    }


}

