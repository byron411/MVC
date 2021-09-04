
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
public class DirectorioDAO implements DirectorioInterfaceDAO{
    //lista
    private ArrayList<Estudiante> miLista;
    @Override
    public void crearRepositorio() {
        //System.out.println("creando...");
        miLista=new ArrayList <Estudiante>();
    }

    @Override
    public void adicionarEstudiante(Estudiante e) {
        System.out.println("adicionando...");
        miLista.add(e);
    }

    @Override
    public void eliminarEstudiante(int cod) {
        System.out.println("eliminando...");
    }

    @Override
    public void actualizarEstudiante(int codigo, Estudiante nuevo) {
        System.out.println("actualizando...");
    }

    @Override
    public void buscarEstudiante(int cod) {
        System.out.println("buscando...");
    }

    @Override
    public ArrayList obtenerTodos() {
        System.out.println("obteniendo");
        return miLista;
    }
    
}
