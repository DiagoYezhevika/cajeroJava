/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Undine
 */
public class cuenta {
    int idCuenta;
    int idTipoCuenta;
    int idTarjeta;
    int saldo;
    
    cuenta(){
        
        idCuenta = 0;
        idTipoCuenta = 0;
        idTarjeta = 0;
        saldo = 0;
    }
    
    cuenta(int nuevoIdCuenta, int nuevoIdTipoCuenta, int nuevoIdtarjeta, int nuevoSaldo){
        
        idCuenta = nuevoIdCuenta;
        idTipoCuenta = nuevoIdTipoCuenta;
        idTarjeta = nuevoIdtarjeta;
        saldo = nuevoSaldo;
    }
    
    int getIdCuenta(){        
        return idCuenta;
    }
    
    int getIdTipoCuenta(){
        return idTipoCuenta;
    }
    
    int getIdTarjeta(){
        return idTarjeta;
    }
    
    int getSaldo(){
        return saldo;
    }
    
    void setIdCuenta(int nuevoIdCuenta){
        idCuenta = nuevoIdCuenta;
    }
    
    void setIdTipoCuenta(int nuevoIdTipoCuenta){
        idTipoCuenta = nuevoIdTipoCuenta;
    }
    
    void setIdTarjeta(int nuevoIdTarjeta){
        idTarjeta = nuevoIdTarjeta;
    }
    
    void setSaldo(int nuevoSaldo){
        saldo = nuevoSaldo;
    }
}
