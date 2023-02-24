public class Ejercicio_Tema_9 {
    public static void main(String[] args) {
       Auto coche = new Auto(200,"SAS","rum run");
       System.out.println("Coche: "+coche.getSonido());

       CocheElectrico nuevoCe = new CocheElectrico(256,"asd","sdf");
       System.out.println("El coche electrico tiene la patente: "+nuevoCe.getMatricula());

    }
}

class Vehiculo {
    int velMaxima;
    String matricula;
   String sonido;
    public Vehiculo(int velMaxima, String matricula, String sonido) {
        this.velMaxima = velMaxima;
        this.matricula = matricula;
        this.sonido = sonido;
    }

    public boolean compruebaMatricula (String matricula){
        if (matricula.toUpperCase() == "XXX"){
            return true;
        }
            return false;
    }
    //System.out.println("Dentro del consturctor del vehiculo");

    public int getVelMaxima() {
        return velMaxima;
    }
    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

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



}

class Auto extends Vehiculo {
    public Auto(int velMaxima, String matricula, String sonido) {
        super(velMaxima, matricula, sonido);
    }
}

class CocheElectrico extends Vehiculo{
    public CocheElectrico(int velMaxima, String matricula, String sonido) {
        super(velMaxima, matricula, sonido);
    }
}