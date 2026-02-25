import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();

        listaLibros.add(new Libro("El Señor de los Anillos 1", "Tolkien", 5));
        listaLibros.add(new Libro("El Señor de los Anillos 2", "Tolkien", 2));
        listaLibros.add(new Libro("El Señor de los Anillos 3", "Tolkien", 1));

        System.out.println("\n=== ESTADO INICIAL ===");
        for (Libro l : listaLibros) {
            l.mostrarInformacion();
        }

        System.out.println("\n=== PROCESO DE PRÉSTAMO ===");

        Libro libroSeleccionado = listaLibros.get(2);
        boolean exito = libroSeleccionado.prestarLibro(1);

        System.out.println("¿Préstamo de: " + libroSeleccionado.getTitulo() + " -> exitoso?: " + exito);

        System.out.println("\n=== ESTADO FINAL DEL LIBRO ===");
        libroSeleccionado.mostrarInformacion();
    }
}