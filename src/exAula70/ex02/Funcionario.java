package exAula70.ex02;

public class Funcionario {

    //Variáveis
    public String nome;
    public double salarioBruto;
    public double imposto = 1000.00;

    //Método para calcular o salário líquido
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    //Método para aumentar o salário
    public void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    //Método para formatar o texto de saída
    public String toString(){
        return nome + ",  R$" + String.format("%.2f%n ", salarioLiquido());
    }
}
