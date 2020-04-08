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
public class Cachorro extends Mamifero {
    // Métodos
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    public void abanarRabo() {
        System.out.println("Abanando Rabo");
    }
    // Método Abstrato
    @Override
    public void emitirSom() {
        System.out.println("Som de latido(Au!Au!Au!)");
    }
}
