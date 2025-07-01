package model;

public class EmpregadoComissionado extends Empregado {
    private int vendas;
    private double porcentagem;
    public void setVendas(int numero){this.vendas = numero;}
    public int getVendas(){return vendas;}
    public void setPercentual(double porcento){this.porcentagem = porcento;}
    public double getPercentual(){return porcentagem;}
    public EmpregadoComissionado(String comissaonome, String comissaocpf, double comissaosalario){
        super(comissaonome, comissaocpf, comissaosalario);
    }
    
    @Override
    public double calcularSalario() {
        return (getPercentual()*getVendas());
    }
}
