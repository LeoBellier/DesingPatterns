/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoss;

import java.io.*;
import java.util.logging.*;
import java.util.*;

/**
 *
 * @author leo
 */
public class WFileUtilitary implements FileUtilitary {

    File f;
    FileWriter fW;

    public WFileUtilitary() {
        this.f = setFile();
        try {
            this.fW = new FileWriter(this.f);
        } catch (IOException ex) {
            Logger.getLogger(WFileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fW.close();
            } catch (IOException ex) {
                Logger.getLogger(WFileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public final File setFile() {
        String asd = cargaPath();
        File fil = new File(asd);
        return fil;
    }

    @Override
    public String cargaPath() {
        Scanner scan;
        scan = new Scanner(System.in);
        String as = scan.nextLine();
        scan.close();
        return as;
    }
}
