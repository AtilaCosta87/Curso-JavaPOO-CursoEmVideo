/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author atila
 */
public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;
    // Método Abstrato
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
}
