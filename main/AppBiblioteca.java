package co.Quiz3.main;

import co.dominio.app.Biblioteca;
import co.dominio.app.Libro;
import co.dominio.app.Revista;
import co.dominio.app.Tesis;

public class AppBiblioteca {
    public static void main(String[] args) {
        Libro libro=new Libro("Libro");
        Revista revista=new Revista("Revista");
        Tesis tesis=new Tesis("tesis");

        Biblioteca biblio=new Biblioteca();
        biblio.addRecurso(revista);
        biblio.addRecurso(libro);
        biblio.addRecurso(tesis);

        biblio.prestar(libro);

        biblio.listar();
    }
}
