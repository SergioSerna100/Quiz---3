package co.Quiz3.domain;

public class Revista extends Recurso implements Prestable {

    public Revista(String nombre) {
        super(nombre);
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
