package week.preparation.day.one;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinusResolve(List<Integer> arr) {
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        int qtdZeros = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                qtdPositivos++;
            }
            if (arr.get(i) < 0) {
                qtdNegativos++;
            }
            if (arr.get(i) == 0) {
                qtdZeros++;
            }
        }
        System.out.printf( "%.6f %n", (double) qtdPositivos / arr.size());
        System.out.printf( "%.6f %n", (double) qtdNegativos / arr.size());
        System.out.printf( "%.6f %n", (double) qtdZeros / arr.size());
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(-4);
            add(3);
            add(3);
            add(-9);
            add(0);
            add(4);
            add(1);
        }};
        PlusMinus.plusMinusResolve(list);
    }
}
