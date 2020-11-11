package co.Quiz3.domain;

public abstract class Recurso {
    protected boolean prestado;
    protected String nombre;

    public Recurso (String nombre){
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
