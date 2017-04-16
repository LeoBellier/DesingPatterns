/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
crear cuenta en bitbucket para repos privados
 */
package TestDesingPatterns;

import DAO.*;

/**
 *
 * @author leo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HumanDAO personas;
        personas = new HumanDAOImpl();
        //People per;
        //per = new People("leo", 19);
        //System.out.println(per.toString());
        personas.setPeople();

        personas.getPeople().stream().forEach((People p) -> {
            System.out.println(p.toString());
        });

    }

}
