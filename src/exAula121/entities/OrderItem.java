package exAula121.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    //Associaçõa
    private Product product;

    //Construtores, padrão e com argumentos
    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //Getter e setter
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Método para calacular o subTotal
    public Double subTotal(){
        return quantity * price;
    }

    //ToString de saída de dados
    @Override
    public String toString(){
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
