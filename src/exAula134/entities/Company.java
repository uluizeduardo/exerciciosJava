package exAula134.entities;

public class Company extends TaxPayer{

    //Variável
    private int numberOfEmployees;

    //Construtores
    public Company(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    //Getter e setter
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //Sobrescrição do método abstrato tax
    @Override
    public double tax(){
        if (numberOfEmployees < 10){
            return getAnualIncome() * 0.16;
        }else {
            return getAnualIncome() * 0.14;
        }
    }

    //ToString de saída de dados
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" $ ");
        sb.append(String.format("%.2f ", tax()));
        return sb.toString();
    }
}
