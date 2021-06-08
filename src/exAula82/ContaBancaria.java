package exAula82;

public class ContaBancaria {

    //Atributos/variáveis
    private int numeroConta;
    private double saldo;
    private String nome;


    //Construtores
    public ContaBancaria(){

    }
    public ContaBancaria(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public ContaBancaria(int numeroConta, String nome, double valorInicial){
        this.numeroConta = numeroConta;
        this.nome = nome;
        addSaldo(valorInicial);
    }

    //Método para adicionar saldo a conta
    public void addSaldo(double valor){
        this.saldo += valor;
    }
    //Método para remover saldo da conta
    public void rmvSaldo(double valor){
        this.saldo -= valor + 5.0;
    }

    //Getter e setter
    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return  "Conta: " + numeroConta
                + ", Titular: " + nome
                + String.format(", Saldo: %.2f",saldo);
    }

}
