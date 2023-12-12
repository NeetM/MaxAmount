
package com.mycompany.marlonmedina4dpv;

import javax.swing.JOptionPane;


public class Afiliado {

    String rut;
    double monto;

    public Afiliado(String rut, double monto) {
        this.rut = rut;
        this.monto = monto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "RUT: "+rut+"\nMONTO: "+monto);
    }
    
    
}

