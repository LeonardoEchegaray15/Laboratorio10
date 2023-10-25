/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFramesLab10;

/**
 *
 * @author Leonardo
 */
public class Plancha {
    private String nombre;
    private String temperatura;

    
    private int aVapor;
    public final static int SI = 0;
    public final static int NO = 1;
    
    
    public Plancha(String nombre, String temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }
    
    public Plancha(){
    }

    public int getaVapor() {
        return aVapor;
    }

    public void setaVapor(int aVapor) {
        this.aVapor = aVapor;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    String GetTexto(){
        String vaporText = (this.aVapor == Plancha.SI) ? "SI" : "NO";
        return "PLANCHA:     Nombre: " + this.nombre + " Temperatura: " + this.temperatura + " Vapor: " + vaporText;
    }
    
    
}
