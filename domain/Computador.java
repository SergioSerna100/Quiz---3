package co.Quiz3.domain;

public class Computador extends Recurso implements Prestable{
    public Computador (String nombre){
        super (nombre);
    }
    @Override
    public void prestar() {
        prestado=true;
    }

    @Override
    public void devolver() {
        prestado=false;
    }
}
