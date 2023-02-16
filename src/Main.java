import java.util.*;

public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        int ejercicio = 0;
        int a,b,c = 0;

        System.out.println("Seleccione el ejecicio a ejecutar: \n 1- Ejercicio 1 \n 2- Ejercicio 2 \n Otro valor para salir. \n Opción seleccionada: ");
        Scanner selectedOption = new Scanner(System.in);
        switch (selectedOption.nextInt()){
            case 1:
                //Se solicita el valor
                System.out.println("Ingrese un numero entero:  ");

                //Se crea el objeto para leer datos
                Scanner lectura = new Scanner(System.in);

                a=lectura.nextInt();

                System.out.println("Ingrese otro numero entero:  ");
                b=lectura.nextInt();

                System.out.println("Ingrese un último numero entero:  ");
                c=lectura.nextInt();

                System.out.println("Valores ingresados: "+ a +"\nEl segundo valor es: "+ b + "\nEl tercer valor es:"+ c);

                resultado = suma(a,b,c);
                System.out.println("La suma de los valores ingreados es: "+resultado);
                break;

            case 2:
                coche miCoche = new coche();
                System.out.println("Ingrese el numero de puertas del coche: ");
                Scanner puertas = new Scanner(System.in);

                miCoche.puertas = puertas.nextInt();

                System.out.println("Desea agregar puertas al coche \n 1- Si \n 2- No");
                if (puertas.nextInt() != 2) {
                    System.out.println("Indique el numero de puertas a agregar: ");

                    miCoche.cantPuerta(puertas.nextInt());
                } else {


                }
                System.out.println("El numero de puertas del coche es: "+ miCoche.puertas);
                break;

            default:
                System.out.println("Gracias. Hasta pronto");
                break;
        }

    }

    public static int suma (int a, int b, int c)
    {
        return a+b+c;
    }
}


class coche{
    int puertas = 0;


    public void cantPuerta(int c_puerta)
    {
        puertas = puertas + c_puerta;
        System.out.println("Dentro de la funcion cantPuertas: "+puertas);
    }



}