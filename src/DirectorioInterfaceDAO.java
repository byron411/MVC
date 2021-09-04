
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
public interface DirectorioInterfaceDAO {
    public void crearRepositorio();
    public void adicionarEstudiante(Estudiante e);
    public void eliminarEstudiante(int cod);
    public void actualizarEstudiante(int codigo, Estudiante nuevo);
    public void buscarEstudiante(int cod);
    public ArrayList obtenerTodos();
    
    
}
