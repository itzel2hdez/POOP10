/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu21
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        String mensajes [] = {"primero", "segundo", "tercero"};
        try{
        for (int i = 0; i<=3; i++){
            System.out.println(mensajes [i]);
        }
        
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: apuntador fuera del rango de arreglo");
        } 
        
        System.out.println("Hola mundo 2");
        
        try{
        double x = 0/ 0;
        System.out.println(x);
        
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        
        try{
        double x = 0/ 0;
        System.out.println(x);
        
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());

        }     
        
        try{
        double x = 0/ 0;
        System.out.println(x);
        
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("hola mundo 3");
        
        try{
        double division = division(4f,6.0);
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        
        
    }

    private static double division(float f, double d) throws UnsupportedOperationException { 
        throw new UnsupportedOperationException("Operacion no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    
    
}
