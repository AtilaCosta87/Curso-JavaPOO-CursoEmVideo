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
public class Celular {
    String modelo;
    String cor;
    String resolucaoTela;
    String resolucaoCamera;
    String memoriaRam;
    String memoriaInterna;
    String processador;
    boolean ligado;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria RAM: " + this.memoriaRam);
        System.out.println("Memoria Interna: " + this.memoriaInterna);
        System.out.println("Está Ligado? " + this.ligado);
    }
    void Funcionando() {
        if (this.ligado == true) {
            System.out.println("Estou ligado e posso fazer ligações!");
        } else {
            System.out.println("ERRO! Não posso fazer ligações porque estou desligado");
        }
    }
    void ligado () {
        this.ligado = true;
    }
    void desligado () {
        this.ligado = false;
    }

}
