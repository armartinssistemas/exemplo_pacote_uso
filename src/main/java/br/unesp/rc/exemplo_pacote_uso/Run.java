/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.exemplo_pacote_uso;

import br.unesp.rc.exemplo_pacote.Calc;
import br.unesp.rc.exemplo_pacote.Mult;

/**
 *
 * @author Prof. Ronaldo
 */
public class Run {
    public static void main(String args[]){
        Calc c = new Calc();
        c.soma(5, 6);
        
        Mult m = new Mult();
        m.fim();
        
        System.out.println("TESTE");
    }
}
