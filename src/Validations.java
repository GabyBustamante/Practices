public class Validations {
    String numero;

    public static boolean isNumber (String numero){
        return numero.matches("[0-9]*");
    }

    public static boolean isString (String string){
        return string.matches("[a-zA-Z]*");
    }
}
