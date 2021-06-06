package exAula70.ex01;

public class Rectangle {
     //Variáveis
     public double width;
     public double height;

    //Método para cálcular a área do retângulo
    public double area(){
         return width * height;
    }

    //Método para cálcular a perímetro do retângulo
    public double perimeter(){
        return 2 * (width + height);
    }

    //Método para cálcular a diagonal do retângulo
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
