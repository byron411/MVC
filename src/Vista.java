
//import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Byron
 */
public class Vista {
    private Scanner lector=new Scanner(System.in);
    //Mostrar estudiante
    public void mostrarEstudiante(Estudiante e){
        int codigo=e.getCodigo();
        String nombre=e.getNombre();
        String programa=e.getPrograma();
        System.out.println("Codigo: "+codigo+" Nombre: "+nombre+" Programa:"+programa);
    }
    //metodo para mostrar las opciones de un menú
    public void mostrarMenu(){
        System.out.println("0. Salir");
        System.out.println("1. Adicionar un estudiante");
        System.out.println("2. Eliminar un estudiante");
        System.out.println("3. Busacar un estudiante");
        System.out.println("4. Actualizar un estudiante");
        System.out.println("5. Mostrar todos");
        
    }
    public int leerOpcion(){
        System.out.println("Cúal opción:");
        int opcion =lector.nextInt();
        return opcion;
    }
    public Estudiante leerEstudiante(){
        System.out.println("codigo: ");
        int codigo=lector.nextInt();
        lector.nextLine();
        System.out.println("Nombre: ");
        String nombre=lector.nextLine();
        System.out.println("Programa: ");
        String programa=lector.nextLine();
        Estudiante e=new Estudiante(codigo, nombre, programa);
        return e;
    }
    public void mostrarTodos(ArrayList<Estudiante> listaEstudiantes){
        for(Estudiante e:listaEstudiantes){
            mostrarEstudiante(e);
        }
    }
}
