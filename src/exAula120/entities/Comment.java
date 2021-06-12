package exAula120.entities;

public class Comment {
    //Variável
    private String text;

    //Construtores, padrão e com argumento
    public Comment(){

    }
    public Comment(String text) {
        this.text = text;
    }

    //Getter e setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
