package exAula119.entities;

public class Department {

    //Variável
    private String name;

    //Construtores, padrão e com argumento;
    public Department(){
    }
    public Department(String name){
        this.name = name;
    }

    //Getter e Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
