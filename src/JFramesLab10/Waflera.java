/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFramesLab10;

/**
 *
 * @author Leonardo
 */
public class Waflera {
    private String nombre;
    private String marca;

     private int Tipo;
    public final static int INDUSTRIAL = 0;
    public final static int HOGAR = 1;
    public final static int LUJO = 2;
    
    
    public Waflera(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    
    public Waflera(){
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    String GetTexto(){
       String tipoTexto;
        switch (Tipo) {
               case INDUSTRIAL:
                        tipoTexto = "INDUSTRIAL";
                break;
                case HOGAR:
                        tipoTexto = "HOGAR";
                break;
                 case LUJO:
                         tipoTexto = "LUJO";
                  break;
                default:
                        tipoTexto = "Desconocido";
    }
    return "WAFLERA:     Nombre: " + this.nombre + "Marca: " + this.marca + "Tipo: " + tipoTexto;
    }
}
