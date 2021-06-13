package exAula121.entities;

import exAula121.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //Variável
    private Date moment;

    //Associação
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    //Contrutores, padão e com argumentos
    public Order(){
    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    //Getter e setter
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    //Métodos para add e remover item na OrderItem
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    //Método para calcular o total através do subTotal
    public Double total(){
        Double sum = 0.0;
        for (OrderItem item: items){
            sum += item.subTotal();
        }
        return sum;
    }

    //ToString de saída de dados
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+ "\n");
        sb.append("Order status: " +status + "\n");
        sb.append("Client: " + client +"\n");
        sb.append("Order items: \n");
        for (OrderItem item: items){
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f ", total()));
        return sb.toString();
    }
}
