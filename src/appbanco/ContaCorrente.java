package appbanco;
import regras.eventos;
import regras.Tarifas;
/**
 *
 * @author 00250205
 */
public class ContaCorrente implements eventos {
    
    private float saldo;
    
    public ContaCorrente(float saldo){
        this.saldo = saldo;
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
        this.saldo -=  valor+Tarifas.CPMF 
                + Tarifas.TAXA;
        
    }
    
    
}