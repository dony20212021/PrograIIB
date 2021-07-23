/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2b;

/**
 *
 * @author RHINO VS OJITOS
 */
public class Principal {
    public static void main(String[] args){
        String mensaje = "eres el mejor";
        char array[] = mensaje.toCharArray();
        for(int i = 0; i< array.length;i++)
        {
            array[i] =(char)(array[i] +(char)5);
        }
        String encriptado = String.valueOf(array);
        System.out.println(encriptado); 
        
        char arrayD[] = encriptado.toCharArray();
        for(int i =0; i< arrayD.length ; i++)
        {
            arrayD[i] =(char)(arrayD[i]-(char)5);        
        }
        String desencriptado = String.valueOf(arrayD);
        System.out.println(desencriptado);
    
    }
    
}
