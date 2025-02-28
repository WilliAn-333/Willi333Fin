
package ec.edu.espoch.willgestorproducto.modelo;


public class Producto {
    
    private int id;
    private String nombre;
    private String precio;
    private boolean perecedero;

    public Producto(int id, String titulo, String descripcion, boolean estado) {
        this.id = id;
        this.nombre = titulo;
        this.precio = descripcion;
        this.perecedero = estado;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public String getDescripcion() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.precio = descripcion;
    }

    public boolean getEstado() {
        return perecedero;
    }

    public void setEstado(boolean estado) {
        this.perecedero = estado;
    }

}
