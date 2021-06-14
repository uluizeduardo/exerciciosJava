package exAula131.entities;

public class Product {
    //Variáveis
    private String name;
    private Double price;

    //Construtores, padão e com argumentos
    public Product(){

    }
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    //Getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Método toString
    public String priceTag(){
        return name
                + " $ "
                + String.format("%.2f", price);
    }
}
