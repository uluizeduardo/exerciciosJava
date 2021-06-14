package exAula131.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    //Formatação da data
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Variável
    private Date manufatureDate;

    //Construtores
    public UsedProduct(Date manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    public UsedProduct(String name, Double price, Date manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    //Getter e setter
    public Date getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(Date manufatureDate) {
        this.manufatureDate = manufatureDate;
    }
    //Método toString
    @Override
    public String priceTag(){
        return getName()
                + " (used) $ "
                + String.format("%.2f ", getPrice())
                + "(Manufacture date: "
                + sdf.format(manufatureDate)
                + ")";
    }
}
