/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author Alumno
 */
abstract class TemplatePattern {
    public final void makeIt(){
        start();
        end();
    }
    abstract void start();
    abstract void end();
}
