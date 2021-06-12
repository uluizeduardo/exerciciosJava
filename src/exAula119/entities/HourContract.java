package exAula119.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    //Construtor, padrão e com argumentos
    public HourContract(){
    }
    public HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    //Getter e setter
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Double getValuePerHour(){
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    public Integer getHours(){
        return hours;
    }
    public void setHours(Integer hours){
        this.hours = hours;
    }

    //Método para calcular o valor total
    public Double totalValue(){
         return valuePerHour * hours;
    }
}
