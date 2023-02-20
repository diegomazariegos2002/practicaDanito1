/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonKey;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.FileNotFoundException;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Melissa
 */
public class Json_Funciones implements Jsonable{
    enum Keys implements JsonKey{
    
        KEY_ONE("input1"),
        KEY_TWO("input2");

        private final String key;

        Keys(String key) {
            this.key = key;
        }
        
        @Override
        public String getKey() {
            return this.key;
        }
        @Override
        public Object getValue() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
   
    public void leerJson() throws FileNotFoundException, IOException{
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Melissa\\Dropbox\\Mi PC (LAPTOP-VVMFAU3C)\\Desktop\\DIEGO\\proyectos_oficial\\java\\practica1Danito\\archivos pruebas\\input_example (1).jsonl"));
            String texto = br.readLine();
            // Repetir mientras no se llegue al final del fichero
            while(texto != null) {
                // Hacer lo que sea con la línea leída
                // En este ejemplo sólo se muestra por consola
                System.out.println(texto);
                JsonObject jsonObject = (JsonObject) Jsoner.deserialize(texto);
                JsonArray input1Array = (JsonArray)jsonObject.getCollection(Keys.KEY_ONE);
                JsonArray input2Array = (JsonArray)jsonObject.getCollection(Keys.KEY_TWO);
                
                //Extrayendo input1
                
                
                // Extrayendo input2
                int tamanio = input2Array.size();
                String[] input2 = new String[tamanio]; 
                for (int i = 0; i < tamanio; i++) {
                    input2[i] = input2Array.getString(i);
                }
                
                // Leer la siguiente línea
                texto = br.readLine();
            }
            System.out.println("hola");
        } catch (JsonException ex) {
            System.out.println("errorsito: "+ex);
        }
    }

    @Override
    public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
        }
        return writable.toString();
    }

    @Override
    public void toJson(Writer writer) throws IOException {
        final JsonObject json = new JsonObject();
        
    }
}
