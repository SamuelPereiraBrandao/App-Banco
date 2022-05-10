/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

import regras.Tarifas;
import regras.eventos;

/**
 *
 * @author 00250205
 */
public class Aplicacao implements eventos, Tarifas {
    private float saldo;
    private float rendimento;
    
    public Aplicacao(float saldo, float rendimento){
        this.saldo = saldo;
        this.rendimento = rendimento;
        
        
    }

    @Override
    public float getSaldo() {
       return this.saldo;
       
    }

    @Override
    public void depositar(float valor) {
        this.saldo += valor - valor*Tarifas.CPMF;
    }

    @Override
    public void sacar(float valor) {
        this.saldo -= valor + valor*Tarifas.CPMF
                + Tarifas.TAXA + valor*Tarifas.IOF
                - valor*rendimento;
    }
    
}
