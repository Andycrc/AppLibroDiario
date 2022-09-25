/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class Dcatalogo {
    String arch = "src\\Fichero\\Catalogo.txt";
    BufferedReader leer;
 
 
    public ArrayList leerDato(){ 
        ArrayList<String> datos = new ArrayList<>();
        
        try {        
            String line = "";
            leer = new BufferedReader(new FileReader(this.arch));
            
            while ((line = leer.readLine()) != null) {
             datos.add(line);
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            if(leer != null){
                try{
                    leer.close();
                }catch(IOException error){
                    System.out.println(error.getMessage());
                }
            }
        }
        return datos;
    }
    
}
