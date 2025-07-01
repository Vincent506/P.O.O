package model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    
    public Data(int day, int month, int year){
        this.dia = day;
        this.mes = month;
        this.ano = year;
    }

    public void setDia(int number){
        this.dia = number;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int other){
        this.mes = other;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int someone){
        this.ano = someone;
    }

    public int getAno(){
        return ano;
    }

    public void displayData(){
        String display = getDia()+"/"+getMes()+"/"+getAno();
        System.out.println(display);
    }
}
