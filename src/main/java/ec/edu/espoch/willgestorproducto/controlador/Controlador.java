
package ec.edu.espoch.willgestorproducto.controlador;

import ec.edu.espoch.willgestorproducto.modelo.GestorProducto;
import ec.edu.espoch.willgestorproducto.modelo.Producto;
import ec.edu.espoch.willgestorproducto.vista.Listar;
import ec.edu.espoch.willgestorproducto.vista.Principal;


public class Controlador {
    
    private Principal principal;
    private GestorProducto gestorProducto;
    private Listar listar;
    
    public Controlador(Principal principal, Listar listar) {
        this.principal = principal;
        this.listar = listar;
        this.gestorProducto = new GestorProducto();
    }
      public void agregarTarea() {

        try {
            if (this.principal != null) {
                Producto objProducto = new Producto();
                objProducto.setTitulo(this.principal.getTitulo());
                objProducto.setDescripcion(this.principal.getDescripcion());
                objProducto.setEstado(this.principal.getEstado());
                String msm = gestorProducto.agregarTarea(objProducto);
                principal.error(msm);

            } else {
                principal.error("COMPLETA TODOS LOS DATOS");
            }
        } catch (Exception e) {
            principal.error("ERROR:" + e);
        }
    }

    public void listarTarea() {

        try {
            String msm = "";
            Producto[] tareas = new Producto[3];
            tareas = gestorProducto.listarTareas();
            if (tareas != null) {
                String lista = "";
                for (int i = 0; i < tareas.length; i++) {
                    if (tareas[i] != null) {
                        lista = lista + "id:" + tareas[i].getId() + "\n"
                                + "PRODUCTO:" + tareas[i].getTitulo() + "\n"
                                + "PRECIO:" + tareas[i].getDescripcion() + "\n"
                                + "PERECEDERO:" + tareas[i].getEstado() + "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "NO HAY PRODUCTOS ";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("ERRO EN LA LISTA DE PRODUCTOS: " + e);
        }
    }
}
    
    
   


    

  