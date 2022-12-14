/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * <p>Esto es un ejemplo de un programa bancario</p>
 * @author Ana
 * @author Adri
 * 
 * @version 1.0
 * 
 */
public class CCuenta {

  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta () {}
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Número de cuenta
    * @param sal Saldo de la cuenta
    * @param tipo Tipo de interés
    */
    public CCuenta (String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

  /**
   * 
   * @param nom 
   */
    public void asignarNombre(String nom) {
        nombre=nom;
    }
   
    public String obtenerNombre() {
        return nombre;
    }

    
     public double estado () {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    public void retirar (double cantidad) throws Exception {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    public String obtenerCuenta () {
        return cuenta;
    }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getTipoInterés() {
    return tipoInterés;
  }

  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
