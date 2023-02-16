import java.util.*;


public class Ejercicio_Tema_4 {

    public static void main(String[] args) {

        int opcion = 0;

        System.out.println("Seleccione el ejecicio a ejecutar: \n1- Tipo de número\n2- Bucle While\n3- Bucle Do While\n4- Bucle For\n5- Switch\n0- Salir\nOpción seleccionada:");
        Scanner selectedOption = new Scanner(System.in);

        opcion = selectedOption.nextInt();

        funciones miOpcion = new funciones();

        switch (opcion) {
            case 1 -> miOpcion.opcion_1();
            case 2 -> miOpcion.opcion_2();//System.out.println("Opción seleccionada: " + selectedOption.nextInt());
            case 3 -> miOpcion.opcion_3();//System.out.println("Opción seleccionada: " + selectedOption.nextInt());
            case 4 -> miOpcion.opcion_4();//System.out.println("Opción seleccionada: " + selectedOption.nextInt());
            case 5 -> miOpcion.opcion_5();//System.out.println("Opción seleccionada: " + selectedOption.nextInt());
            default -> System.out.println("Opción seleccionada: " + selectedOption.nextInt());
        }

    }

}

class funciones {
    public void opcion_1 (){

        /*
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:
            - Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
              Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */
        System.out.println("Ingrese un valor: ");
        Scanner numeroIf = new Scanner(System.in);

        if (numeroIf.nextInt() == 0){
            System.out.println("El valor ingresado es igual a 0 -> Valor ingresado: " + numeroIf.nextInt());
        } else if (numeroIf.nextInt() >0) {
            System.out.println("El valor ingresado es mayor a 0 -> Valor ingresado: " + numeroIf.nextInt());
        } else {
            System.out.println("El valor ingresado es menor a 0 -> Valor ingresado: " + numeroIf.nextInt());
        }

    }

    public void opcion_2 (){
    /*
    - Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        -- Incrementar el valor de la variable en uno cada vez que se ejecute.
        -- Mostrarlo por pantalla cada vez que se ejecute.
     */
        int nro = 0;
        System.out.println("Ingrese un valor: ");
        Scanner numeroIf = new Scanner(System.in);
        while (numeroIf.nextInt() < 3){
            nro = numeroIf.nextInt();
            nro = nro+1;
            System.out.println("El valor ingresado es: "+numeroIf.nextInt()+ "\nSe incrementa en uno: "+ nro);
        }

    }
    public void opcion_3() {
    /*
     - Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
     */
        int nro,cont = 0;
        System.out.println("Ingrese un valor: ");
        Scanner numeroIf = new Scanner(System.in);
        if (numeroIf.nextInt() < 3){
            do {
                nro = numeroIf.nextInt();
                nro = nro+1;
                cont++;
                System.out.println("El valor ingresado es: "+numeroIf.nextInt()+ "\nSe incrementa en uno: "+ nro);
            }
            while (cont == 0);
        }
        else {
            System.out.println("Salio del Do While");
        }

    }
    public void opcion_4(){
    /*
    - Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor.
        --cada vez que se ejecute y deberá mostrarse por pantalla.
     */
        for(int numeroFor= 0; numeroFor<4; numeroFor++){
            System.out.println("El valor de numeroFor es: "+ numeroFor);
        }
    }

    public void opcion_5(){
    /*
    - Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
     -- Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
     -- También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
        String aux_season = "";
        System.out.println("Ingrese una estación: ");
        Scanner season = new Scanner(System.in);
        aux_season = season.nextLine();
        switch (aux_season.toLowerCase()) {
            case "invierno":
                System.out.println("La estáción seleccionada es: "+aux_season.toUpperCase());
                break;
            case "verano":
                System.out.println("La estáción seleccionada es: "+aux_season.toUpperCase());
                break;
            case "primavera":
                System.out.println("La estáción seleccionada es: "+aux_season.toUpperCase());
                break;
            case "otonio":
                System.out.println("La estáción seleccionada es: "+aux_season.toUpperCase());
                break;
            default:
                System.out.println("Valor no válido: "+aux_season);
                break;
                }
        }
    }

