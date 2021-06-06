package exAula73;

public class ConversorDeMoedas {

    //Variáveis
    public static double dolar, qtd;

    //Método para calcular a cotação em reais
    public static double cotacao(){
        double iof = ((6 / 100.0) * dolar);
        dolar = dolar + iof;
        return dolar * qtd;
    }
}
