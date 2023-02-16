public class Validations {
    String numero;

    /**
     * Metodo para validacion de caracteres numerícos.
     * @param numero
     * @return boolean
     */
    public static boolean isNumber (String numero){
        return numero.matches("[0-9]*");
    }

    /**
     * Metodo para validación de cadena de caracteres alfabéticos solamente
     * @param string
     * @return boolean
     */
    public static boolean isString (String string){
        return string.matches("[a-zA-Z]*");
    }
}
