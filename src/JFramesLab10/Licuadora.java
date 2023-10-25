/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFramesLab10;

/**
 *
 * @author Leonardo
 */
public class Licuadora {
    private String nombre;
    private int velocidades;
    private String voltaje;
    private String modelo;

    public Licuadora(String nombre, int velocidades, String voltaje, String modelo) {
        this.nombre = nombre;
        this.velocidades = velocidades;
        this.voltaje = voltaje;
        this.modelo = modelo;
    }
    
    public Licuadora(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    String GetTexto(){
        return "LICUADORA: Nombre: "+this.nombre+"Modelo: " + this.modelo +"Voltaje: "+ this.voltaje;
    }
    
    
            
            
}
