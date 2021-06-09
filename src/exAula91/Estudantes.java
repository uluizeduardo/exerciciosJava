package exAula91;

public class Estudantes {

    //Viaveis
    String nome, email;
    int quarto;

    //Construtor
    public Estudantes(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto(){
        return quarto;
    }

    public void setQuarto(int quarto){
        this.quarto = quarto;
    }

    //Sobrescriçao do toString
    @Override
    public String toString(){
        return  quarto
                + ": "
                + nome
                + ", "
                + email;
    }
}
