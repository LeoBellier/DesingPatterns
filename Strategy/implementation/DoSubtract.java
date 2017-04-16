/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfase.*;

/**
 *
 * @author Alumno
 */
public class DoSubtract implements interfaceStrategy {

    int a;
    int b;

    public DoSubtract(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int doOperation() {
        return this.a - this.b;
    }

}
