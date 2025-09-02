public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Libro[Título: " + titulo + ", Autor: " + autor + ", Precio: " + precio + "]";
    }
        public static double calcularPrecioTotal(Libro[] libros) {
            double total = 0;
            
        for (Libro libro : libros) {
            if (libro != null) {
                total += libro.getPrecio();
            }
        }
    
    return total;
}

}