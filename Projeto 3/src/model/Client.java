package model;

public class Client {
    
    private String nome;
    private double saldo;
    private int actionDep;
    private int actionSaq;
    private int actionTransfer;
    private int actionView;

    public Client(String nome, double saldoInicial){
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposit(double valor){
        if (valor>0) {
            saldo +=valor; // saldo = saldo + valor
            System.out.println("Deposito de R$ "+valor+"Feito com sucesso!!!");
            actionDep++;
        }else{
            System.out.println("Valor Invalido para deposito");
        }
        
    }

    public void retired(double steal){
        if ((steal<=saldo)&&(saldo>0)) {
            saldo-=steal;
            System.out.println("Retirada de R$ "+steal+" realisada com sucesso!!!!");
            actionSaq++;
        }else{
            System.out.println("Saldo insuficiente ou valor invalido");
        }
        
    }

    public void transfer(double valor,Client destiny){
        if ((valor>0)&&(valor<=saldo)) {
            saldo-=valor;
            destiny.deposit(valor);
            System.out.println("Transferencia de R$ "+valor+"efetuada com sucesso!!!");
            actionTransfer++;
        }else{
            System.out.println("Transferencia não realisada. Verifique o saldo ou o valor.");
        }
        
    }
    
    public void showValue(){
        System.out.println(nome+" Saldo R$ "+saldo);
        actionView++;
    }

    public void report(Client person){
        System.out.println("Relatorio do cliente "+person.nome+" pos operação");
        System.out.println("Saldo disponivel R$ "+saldo);
        System.out.println("numero de depositos: "+actionDep);
        System.out.println("numero de retiradas: "+actionSaq);
        System.out.println("Numero de transferencias: "+actionTransfer);
        System.out.println("Numero de pesquisa de saldo: "+actionView);
    }
}
