/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.devexps.lista;

/**
 *
 * @author Alumno
 * @param <T>
 */
public class GenericExample<T extends Saludar> {

    T myTipe;

    public void holaDesde() {
        System.out.println("te saludo desde");
        System.out.println(this.myTipe + " \n");
        System.out.println("Desde");
        this.myTipe.decirHola();

    }
}

interface Saludar {

    public void decirHola();
}

class HolaEspaniol implements Saludar {

    @Override
    public void decirHola() {
        System.out.println("hola");
    }
}

class HolaIngles implements Saludar {

    @Override
    public void decirHola() {
        System.out.println("hi");
    }

}
