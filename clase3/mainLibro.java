package clase3;

import jdk.jfr.Label;

public class mainLibro {
    public static void main(String[] args) {
        Libro[] libros = new Libro[5];
        libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 19.99);
        libros[1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 15.50);
        libros[2] = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 12.75);
        libros[3] = new Libro("Rayuela", "Julio Cortázar", 18.00);
        libros[4] = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 17.25);

        // Mostrar la información de cada libro
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Precio: " + libro.getPrecio());
            System.out.println("-----------------------------");
        }

        double precioTotal = calcularPrecioTotal(libros);
        System.out.println("Precio total de todos los libros: " + precioTotal);
    }

    public static double calcularPrecioTotal(Libro[] libros) {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecio();
        }
        return total;
    }
    
    }