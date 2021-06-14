package exAula131.entities;

public class ImportedProduct extends Product{

    //Variável
    private Double customsFree;

    //Construtores
    public ImportedProduct(Double customsFree) {
        this.customsFree = customsFree;
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    //Getter e setter
    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }
    //Método para calaular o preço total
    public Double totalPrice(){
        return getPrice() + customsFree;
    }
    //Método toString
    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + String.format("%.2f", getPrice())
                + " (Customs fee: $ "
                + String.format("%.2f ", customsFree )
                + ")";
    }
}
