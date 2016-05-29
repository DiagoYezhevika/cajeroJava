/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author undine
 */
public class cuentaTransaccion {
    int idTipoTransaccion;
    int idCuenta;
    int idTransaccion;
    int valorTransaccion;
    
    cuentaTransaccion(){
        idTipoTransaccion = 0;
        idCuenta = 0;
        idTransaccion = 0;
        valorTransaccion = 0;
    }
    
    cuentaTransaccion(int nuevoIdTipoTransaccion, int nuevoIdCuenta, int nuevoIdTransaccion, int nuevoValor){
        idTipoTransaccion = nuevoIdTipoTransaccion;
        idCuenta = nuevoIdCuenta;
        idTipoTransaccion = nuevoIdTransaccion;
        valorTransaccion = nuevoValor;
    }
    
    int getIdTipoTransaccion(){
        return idTipoTransaccion;
    }
    
    int getIdCuenta(){
        return idCuenta;
    }
    
    int getIdTransaccion(){
        return idTransaccion;
    }
    
    int getValor(){
        return valorTransaccion;
    }
    
    void setIdTipoTransaccion(int nuevoIdTipoTransaccion){
        idTipoTransaccion = nuevoIdTipoTransaccion;
    }
    
    void setIdCuenta(int nuevoIdCuenta){
        idCuenta = nuevoIdCuenta;
    }
    
    void setIdTransaccion(int nuevoIdTransaccion){
        idTransaccion = nuevoIdTransaccion;
    }
    
    void setValor(int nuevoValor){
        valorTransaccion = nuevoValor;
    }
}
