/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Buscar: scafolding, wireframe.
 */
package DAO;

import archivoss.RFileUtilitary;
import java.util.ArrayList;
import java.util.List;

public class HumanDAOImpl implements HumanDAO {

    List<People> personal;

    @Override
    public List<People> getPeople() {
        return this.personal;
    }

    @Override
    public void setPeople() {
        RFileUtilitary archivoPersonas = new RFileUtilitary();
        People newPeople;
        String line;
        do {
            line = archivoPersonas.getLine();
            newPeople = getPeopleFromLine(line);
            if (newPeople != null) {
                this.personal.add(newPeople);
            }
        } while (newPeople != null);
    }

    public People getPeopleFromLine(String line) {
        System.out.println(line);
        String[] data = null;
        if (line != null) {
            data = line.split(",");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].trim();
            }
            return new People(data[0], Integer.parseInt(data[1]));
        }
        return null;
    }

    public HumanDAOImpl() {
        this.personal = new ArrayList<>();
    }

}
