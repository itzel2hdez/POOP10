/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu21
 */
public class Cuenta {
    private double saldo;
   
    public Cuenta (){
        saldo= 0;
    }
    /**
     * Metodo depositar que suma el monto a saldo
     * @param monto 
     */
    public void depositar ( double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    /**
     * Metodo retirar que retira el monto a saldo
     * @param monto
     * @throws SaldoInsuficienteException 
     */
    public void retirar (double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if (saldo < monto)
            throw new SaldoInsuficienteException ();
        else
            saldo -= monto;
    }
    /**
     * Metodo getSaldo
     * @return saldo
     */
    public double getSaldo(){
        return saldo;
    }
    
}
