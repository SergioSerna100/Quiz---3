package co.Quiz3.domain;

public class Libro extends Recurso implements Prestable {

    public Libro (String nombre){
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
