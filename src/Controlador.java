
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Byron
 */
public class Controlador {
    private Vista miVista=new Vista();
    private DirectorioDAO miModelo=new DirectorioDAO();
    //public Controlador(){
        
    public void iniciar(){
        //Estudiante e=new Estudiante(1010, "Sara", "Ingenieria");
        //miVista.mostrarEstudiante(e);
        miModelo.crearRepositorio();///si es bd crea la conexion
        while(true){
            miVista.mostrarMenu();
            int opcion=miVista.leerOpcion();
            switch(opcion){
                case 0: System.exit(0);
                case 1: adicionar();break;
                case 2: eliminar();break;
                case 3: buscar();break;
                case 4: actualizar();break;
                case 5: mostrarTodo();break;
            }    
        }
    }
    public void adicionar(){
        System.out.println("Adicionando...");
        Estudiante e=miVista.leerEstudiante();
        miModelo.adicionarEstudiante(e);
    }

    public void eliminar() {
        System.out.println("eliminando...");
    }

    public void buscar() {
        System.out.println("Buscando...");
    }
    public void actualizar() {
        System.out.println("Actualizando...");
    }
    public void mostrarTodo() {
        System.out.println("Mostrando todo...");
        ArrayList<Estudiante> listaEstudiantes=miModelo.obtenerTodos();
        miVista.mostrarTodos(listaEstudiantes);
    }
}
