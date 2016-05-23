/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Undine
 */
public class tipoCuenta {
    int idCuenta;
    String descripcion;
    
    tipoCuenta(){
        idCuenta = 0;
        descripcion = "";
    }
    
    tipoCuenta(int nuevoId, String nuevaDescripcion){
        idCuenta = 0;
        descripcion = "";
    }
    
    int getId(){
        return idCuenta;
    }
    
    String getDescripcion(){
        return descripcion;
    }
    
    void setId(int nuevoId){
        idCuenta = nuevoId;
    }
    
    void setDescripcion(String nuevaDescripcion){
        descripcion = nuevaDescripcion;
    }
}
