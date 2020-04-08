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
public class AulaCursoEmVideo {
    String data;
    String assunto;
    String horaInicio;
    String Duracao;
    boolean comeco;
    
    void status () {
        System.out.println("Data da aula: " + this.data);
        System.out.println("Assunto da aula: " + this.assunto);
        System.out.println("Horario de inicio da aula: " + this.horaInicio);
        System.out.println("Duração da aula: " + this.Duracao);
    }
    void comeco () {
        if (this.comeco == true) {
            System.out.println("Preparece, Terá aula!");
        } else {
            System.out.println("Desculpe, aula Cancelada!");
        }
    }
    void comecaAula (){
        this.comeco = true;
    }
    void cancelarAula () {
        this.comeco = false;
    }
    
}
