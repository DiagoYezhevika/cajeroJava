/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Undine
 */
public class transaccion {
    int idTipo;
    String descripcion;
    
    transaccion(){
        idTipo = 0;
        descripcion = "";
    }
    
    transaccion(int nuevoIdTipo, String nuevaDescripcion){
        idTipo = nuevoIdTipo;
        descripcion = nuevaDescripcion;
    }
    
    int getIdTipo(){
        return idTipo;
    }
    
    String getDescripcion(){
        return descripcion;
    }
    
    void setIdTipo(int nuevoIdTipo){
        idTipo = nuevoIdTipo;
    }
    
    void setDescripcion(String nuevaDescripcion){
        descripcion = nuevaDescripcion;
    }
}
