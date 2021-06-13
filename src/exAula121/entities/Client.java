package exAula121.entities;

import javafx.beans.property.SimpleLongProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Variáveis
    private String name;
    private String email;
    private Date birthDate;

    //Construtores, padrão e com argumentos
    public Client(){

    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    //Getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    //ToString de saída de dados
    @Override
    public String toString(){
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
