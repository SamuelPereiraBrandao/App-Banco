/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

import regras.eventos;

/**
 *
 * @author 00250205
 */
public class Informacao {
    
    public void mostrarSaldo(eventos ev){
        System.out.printf("Saldo Disponivel: R$ %.2f \n",ev.getSaldo());
        
        
    }
}
