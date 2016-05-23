/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Undine
 */
public class tarjeta {
    int idTarjeta;
    String descripcion;
    
    tarjeta(){
        idTarjeta = 0;
        descripcion = "";
    }
    
    tarjeta(int nuevoId, String nuevaDescripcion){
        idTarjeta = 0;
        descripcion = "";
    }
    
    int getId(){
        return idTarjeta;
    }
    
    String getDescripcion(){
        return descripcion;
    }
    
    void setId(int nuevoId){
        idTarjeta = nuevoId;
    }
    
    void setDescripcion(String nuevaDescripcion){
        descripcion = nuevaDescripcion;
    }
}
