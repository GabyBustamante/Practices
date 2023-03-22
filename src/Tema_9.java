public class Tema_9 {
    public static void main(String[] args) {
       Auto coche = new Auto();
       //coche.setSonido("Brr");
        coche.diHola();
       //Moto moto = new Moto();
       //moto.setSonido("brum rum");

       System.out.println(coche.getSonido());
       //System.out.println(moto.getSonido());
       //System.out.println("Coche: "+coche.getSonido());

       //CocheElectrico nuevoCe = new CocheElectrico(256,"asd","sdf");
       //System.out.println("El coche electrico tiene la patente: "+nuevoCe.getMatricula());

       //System.out.println(coche.compruebaMatricula("xxx"));
    }
}


class Vehiculo {
    int velMaxima;
    String matricula;
   String sonido;
    public Vehiculo() {
        System.out.println("Constructor de Vehiculo");
    }

    public void diHola(){
        System.out.println("Hola del padre");
    }

/*
        public String getSonido();
        public void setSonido(String sonido);

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

class Motor extends Vehiculo{
    String tipoMotor;
    public Motor() {System.out.println("Constructor de la clase motor.");}

    public void diHola(){
        System.out.println("Soy Hola de la clase hija");
    }
}

class Auto extends Motor {

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

// Se crea la interface que contiene los métodos que deben ser implmentados por la clase.
interface Prueba {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Prueba{
    public void Acelerar (int cuantaVelocidad){

    }
    public void Frenar (int cuantaVelodidad){

    }
}