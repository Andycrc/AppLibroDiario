/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Andy
 */
public class AsientoTB {
    
    private int nAsiento;
    private int codigo;
    private String nombrec;
    private int debe;
    private int haber;
    private String fecha;

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public int getDebe() {
        return debe;
    }

    public void setDebe(int debe) {
        this.debe = debe;
    }

    public int getHaber() {
        return haber;
    }

    public void setHaber(int haber) {
        this.haber = haber;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
