/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import json.Json_Funciones;

/**
 *
 * @author Melissa
 */
public class Main {
    
    public static void main(String[] args) {
        Json_Funciones jsonFunciones = new Json_Funciones();
        try {
            jsonFunciones.leerJson();
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
}
