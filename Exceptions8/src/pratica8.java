class SaldoInsuficiente extends Exception {

        public void mensagemPersonalizada()
        {
            System.out.println("Saldo insuficiente para realizar a operação");

        }
        
    }
class ContaBancaria {
        private double saldo ; 

        public ContaBancaria(double saldo){
            this.saldo = saldo ; 
        }

        public void sacar(double valor){
            if(valor > saldo){
                SaldoInsuficiente erro =  new SaldoInsuficiente();
                erro.mensagemPersonalizada();
            }else {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso !!!");
                System.out.println("Saldo atual: "+ saldo );
            }
        }


        public double getSaldo(){
            return saldo ; 
        }
        
    }

public class pratica8{
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(1000);
        
        conta.sacar(1500);
    }

}
  