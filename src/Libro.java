public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDisponible;
    private boolean prestado; // true = prestado, false = disponible

    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
        this.prestado = (cantidadDisponible == 0); //cero = está prestado
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo +
                " | Autor: " + autor +
                " | Disponibles: " + cantidadDisponible +
                " | Prestado?: " + (prestado ? "Si" : "No"));
    }

    public void agregarCopias(int cantidad) {
        this.cantidadDisponible += cantidad;
        if (this.cantidadDisponible > 0) this.prestado = false;
        System.out.println("Se agregaron " + cantidad + " copias de " + titulo);
    }

    public boolean consultarDisponibilidad() {
        return cantidadDisponible > 0;
    }

    public boolean prestarLibro(int cantidadSolicitada) {
        if (cantidadDisponible >= cantidadSolicitada) {
            cantidadDisponible -= cantidadSolicitada;
            if (cantidadDisponible == 0) {
                prestado = true;
            }
            return true; //hay libros y se prestó
        }
        return false; //no alcanza la cantidad
    }
}