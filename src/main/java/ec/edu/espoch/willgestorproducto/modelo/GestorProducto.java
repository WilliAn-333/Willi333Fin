package ec.edu.espoch.willgestorproducto.modelo;


public class GestorProducto {
    
    int tamanoVector = 5;
    Producto[] producto = new Producto[tamanoVector];
    int cont = 0;

    public String agregarTarea(Producto tarea) {
        String msg = "PRODUCTO GUARDADO";
        if (producto.length != cont) {
            for (int i = 0; i < producto.length; i++) {
                if (producto[i] == null) {
                    producto[i] = new Producto();
                    producto[i].setId(i);
                    producto[i].setTitulo(tarea.getTitulo());
                    producto[i].setDescripcion(tarea.getDescripcion());
                    producto[i].setEstado(tarea.getEstado());
                    cont++;
                     
                    return msg;
                }
            }
        } else {
                msg = "NO HAY ESPACIO EN LA MEMORIA";
        }
        return msg;
    }

    public Producto[] listarTareas() {

        Producto[] auxTareas = new Producto[tamanoVector];
        for (int i = 0; i < cont; i++) {
            auxTareas[i] = new Producto();
            auxTareas[i].setId(producto[i].getId());
            auxTareas[i].setTitulo(producto[i].getTitulo());
            auxTareas[i].setDescripcion(producto[i].getDescripcion());
            auxTareas[i].setEstado(producto[i].getEstado());
            System.out.println("MODELO LISTAR PRODUCTO" + auxTareas[i].getEstado());
        }
        return auxTareas;
    }
    
}
