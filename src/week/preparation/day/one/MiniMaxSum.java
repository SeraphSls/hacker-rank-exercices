package week.preparation.day.one;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {

        Integer swap;
        Long sumMin = 0L;
        Long sumMax = 0L;
         //primeiro eu ordeno a lista com um for aninhado
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
          //se o primeiro indice é maior que o segundo, eu troco eles de posicao, dessa forma o menor sempre vai ficar no indice 0 e o maior no 3
                if (arr.get(i) > arr.get(j)) {
                    //pego o maior
                    swap = arr.get(i);
                    //seto o menor pro indice anterior
                    arr.set(i, arr.get(j));
                    //troco o maior pra proxima posição
                    arr.set(j, swap);
                }
            }
        }


        //faço a soma minima tirando o maior que é o ultimo da lista (exemplo : array de 1,2,3,4,5  tira o 5 e soma o resto).
        for (int i = 0; i < arr.size() - 1; i++) {
            sumMin = sumMin + arr.get(i);
        }
        // faço a soma maior tirando o menor da lista ( exemplo : array de 1,2,3,4,5  tira o 1 e soma o resto).
        for (int i = 1; i < arr.size(); i++) {
            sumMax = sumMax + arr.get(i);
        }
        System.out.println(sumMin + " " + sumMax);
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(256741038);
            add(623958417);
            add(467905213);
            add(714532089);
            add(938071625);

        }};
        MiniMaxSum.miniMaxSum(list);

    }
}

