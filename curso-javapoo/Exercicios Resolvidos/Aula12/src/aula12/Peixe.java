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
public class Peixe extends Animal{
    // Atributos
    private String corEscama;
    // Métodos
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    // Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // Métodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
}
