package libroapp;

public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumerosPag;

    public Libro() {

    }

    public Libro(int ISBN, String Titulo, String Autor, int NumerosPag) {
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.NumerosPag = NumerosPag;
        this.Titulo = Titulo;

    }

    public Libro(String Nombre, int NumeroPag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void llenarLibro(int ISBN, String Titulo, String Autor, int NumerosPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumerosPag = NumerosPag;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumerosPag() {
        return NumerosPag;
    }

    public void setNumerosPag(int NumerosPag) {
        this.NumerosPag = NumerosPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumerosPag=" + NumerosPag + '}';
    }

}
