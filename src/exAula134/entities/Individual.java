package exAula134.entities;

public class Individual extends TaxPayer{

    //Variável
    private Double healthExpenditures;

    //Construtores
    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //Getter e setter
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //Sobrescrição do método abstrato tax
    @Override
    public double tax() {
        if (getAnualIncome() < 2000.00){
            return  (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
        }
        else{
            return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
        }
    }

    //ToString de saída de dados
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append( " $ ");
        sb.append(String.format("%.2f ", tax()));
        return sb.toString();
    }
}
