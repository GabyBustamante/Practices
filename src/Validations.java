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
     * @param cadena
     * @return boolean
     */
    public static boolean isString (String cadena){
        return cadena.matches("[a-zA-Z]*");
    }
/*
    public static boolean isMail (String cadena){
        return cadena.matches("");
    }
    */
}


