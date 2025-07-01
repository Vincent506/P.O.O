package model; //arrumar esse erro usando um construtor na classe Funcionario
public class Departamento {
    
    private String coDep;
    private String nameDep;
    private String fone;
    //private Departamento funcionarios;
    // arrumar a inserção da classe funcionario na classe departamento
    public void setcoDepart(String nomeDep){
        this.coDep = nomeDep;
    }

    public String getcoDepatr(){
        return coDep;
    }

    public void setNameDep(String name){
        this.nameDep = name;

    }
    public String getNameDep(){
        return nameDep;
    }

    public String getFone(){
        return fone;
    }

    public void setFone(String number){
        this.fone = number;
    }
}
