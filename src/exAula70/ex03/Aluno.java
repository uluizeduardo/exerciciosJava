package exAula70.ex03;

public class Aluno {

    //Variáveis
    public String nome;
    public double n1, n2, n3;


    //Método para verificar a média do aluno
    public double mediaDoAluno(){
        return n1 + n2 + n3;
    }

    //Método para verificar se os pontos é maior que 60
    public double pontosFaltando(){
        if (mediaDoAluno() < 60){
            return 60.0 - mediaDoAluno();
        }else{
            return 0.0;
        }
    }
}
