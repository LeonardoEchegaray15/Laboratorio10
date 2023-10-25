/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JFramesLab10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Laboratorio10 {

    /**
     * @param args the command line arguments
     */
    public static List<Plancha> ListaPacientes;
    public static List<Waflera> ListaMedicos;
    
    
    public static List<String> vapor = new ArrayList<>();
    public static List<String> tipo = new ArrayList<>();
    
    public static void main(String[] args) {
        
        vapor.add("Si");
        vapor.add("No");

        
        //FECHAS
        tipo. add("INDUSTRIAL");
        tipo. add("HOGAR");
        tipo. add("LUJO");

        // TODO code application logic here
        JFrameRegistroElect Principal = new JFrameRegistroElect();
        Principal.setVisible(true);
    }
    
}
