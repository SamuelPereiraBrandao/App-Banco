/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

/**
 *
 * @author 00250205
 */
public class AppBanco {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente cc = new ContaCorrente(1000.00f);
        System.out.printf("Saldo Inicial R$ %.2f \n",cc.getSaldo());
        cc.depositar(200.00f);
        System.out.printf("Saldo Atual R$ %.2f \n",cc.getSaldo());
        cc.sacar(100.00f);
        System.out.printf("Saldo Atual R$ %.2f \n",cc.getSaldo());
        System.out.println("\n");
        
        Aplicacao apl = new Aplicacao(1000.00f, 0.10f); // 10%
        System.out.printf("Saldo Inicial R$ %.2f \n",apl.getSaldo());
        apl.depositar(200.00f);
        System.out.printf("Saldo Atual R$ %.2f \n",apl.getSaldo());
        apl.sacar(100.00f);
        System.out.printf("Saldo Atual R$ %.2f \n",apl.getSaldo());
        System.out.println("\n");
        
        Informacao info = new Informacao();
        info.mostrarSaldo(cc);
        info.mostrarSaldo(apl);
    }
    
}
