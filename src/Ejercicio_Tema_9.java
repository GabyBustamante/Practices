public class Ejercicio_Tema_9 {
    public static void main(String[] args) {
       Auto coche = new Auto();
       coche.setSonido("Brr");

       Moto moto = new Moto();
       moto.setSonido("brum rum");

       System.out.println(coche.getSonido());
       System.out.println(moto.getSonido());
       //System.out.println("Coche: "+coche.getSonido());

       //CocheElectrico nuevoCe = new CocheElectrico(256,"asd","sdf");
       //System.out.println("El coche electrico tiene la patente: "+nuevoCe.getMatricula());

       //System.out.println(coche.compruebaMatricula("xxx"));
    }
}


abstract class Vehiculo {
    int velMaxima;
    String matricula;
   String sonido;
    public Vehiculo() {
        System.out.println("Constructor de Vehiculo");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);
/*
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSonido() {
        return sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
*/


}

class Auto extends Vehiculo {

    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    public String getSonido(){
        return "Soy sonido de auto " + this.sonido;
    }
}

class Moto extends Vehiculo{
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    public String getSonido(){
        return "Soy sonido de moto " + this.sonido;
    }
}