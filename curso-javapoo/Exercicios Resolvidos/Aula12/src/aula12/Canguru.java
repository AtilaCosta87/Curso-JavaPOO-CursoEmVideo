/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author atila
 */
public class Canguru extends Mamifero {
    // Método
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    // Método Abstrato
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
  
}
