package exAula134.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        if (numberOfEmployees < 10){
            return getAnualIncome() * 0.16;
        }else {
            return getAnualIncome() * 0.14;
        }
    }
}
