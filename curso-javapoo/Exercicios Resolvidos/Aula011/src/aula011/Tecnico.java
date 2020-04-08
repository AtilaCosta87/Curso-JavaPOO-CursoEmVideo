/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author atila
 */
public class Tecnico extends Aluno{
    // Atributos
    private float registroProfissional;
    // Métodos
    public void praticar() {
        System.out.println("Estou Praticando!");
    }
    // Métodos Especiais
    public float getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(float registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
