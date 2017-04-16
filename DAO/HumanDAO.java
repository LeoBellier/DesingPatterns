/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author leo
 *
 */
public interface HumanDAO {

    /**
     *
     * @return a list of type People
     */
    public List<People> getPeople();

    public void setPeople();
}
