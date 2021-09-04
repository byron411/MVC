/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Byron
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private String programa;
    
    public Estudiante (int cod, String nom,String prog){
        codigo=cod;
        nombre=nom;
        programa=prog;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPrograma(){
        return programa;
    }
    //setters
    public void setCodigo(int cod){
        codigo=cod;
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public void getPrograma(String prog){
        programa=prog;
    }
}
