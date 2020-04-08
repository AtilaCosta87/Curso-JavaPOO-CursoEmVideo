/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula02;

/**
 *
 * @author atila
 */
public class ExercicioAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Celular c1 = new Celular();
        c1.modelo = "Samsung";
        c1.processador = "Snapdragon01";
        c1.memoriaRam = "6GB";
        c1.memoriaInterna = "128GB";
        c1.ligado();
        c1.status();
        c1.Funcionando();
        
        Celular c2 = new Celular();
        c2.modelo = "Motorola";
        c2.processador = "DualCore";
        c2.memoriaRam = "4GB";
        c2.memoriaInterna = "64GB";
        c2.desligado();
        c2.status();
        c2.Funcionando();
   
    }
    
}
