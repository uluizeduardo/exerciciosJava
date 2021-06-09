package exAula96;

public class Funcionario {

    //Variáveis
    private Integer id;
    private String nome;
    private Double salario;

    //Construtor com parâmetro
    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    //Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Método para aumentar o salário
    public void aumentoSalario(Double porcentagem){
        salario += salario * porcentagem / 100;
    }

    //Método toString para a saída de dados coforme o exercício
    @Override
    public String toString(){
        return id
                + ", "
                + nome
                + ", "
                + String.format(" %.2f", salario);
    }
}
