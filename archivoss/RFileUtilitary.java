/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeoBellier
 */
public class RFileUtilitary implements FileUtilitary {

    File f;
    BufferedReader b;

     public RFileUtilitary() {
        FileReader fils;
        try {
            this.f = setFile();
            fils = new FileReader(f);
            this.b = new BufferedReader(fils);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RFileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getLine() {
        String as = null;
        try {
            as = b.readLine();
        } catch (IOException ex) {
        } finally {
            try {
                if (b == null) {
                    b.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(RFileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return as;
    }

    @Override
    public File setFile() {
        String asd = cargaPath();
        File fil = new File(asd);
        return fil;
    }

    public String cargaPath() {
        Scanner scan;
        scan = new Scanner(System.in);
        String as = scan.nextLine();
        scan.close();
        return as;
    }

}
