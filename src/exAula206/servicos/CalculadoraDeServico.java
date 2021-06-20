package exAula206.servicos;

import java.util.List;

public class CalculadoraDeServico {

    public static Integer max(List<Integer> list){
        if (list.isEmpty()){
            throw new IllegalStateException("Lista não pode está vazia");
        }
        Integer max = list.get(0);
        for (Integer item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
