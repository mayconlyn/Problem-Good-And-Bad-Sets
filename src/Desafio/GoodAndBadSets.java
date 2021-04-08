package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodAndBadSets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> sets = new ArrayList<>();
        int num = sc.nextInt();
        while (num != 0) {

            for (int i = 0; i < num; i++) {
                list.add(sc.next());
            }
            goodAndBadSets(list, sets);
            list.clear();
            num = sc.nextInt();

        }
        for (String str : sets)
            System.out.println(str);
    }

    private static void goodAndBadSets(List<String> list, List<String> sets) {

        int contPreFix = 0;
        for (String word : list) {
            for (String wordCompare : list) {
                if (word.length() > wordCompare.length())
                    break;

                int contChar = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == wordCompare.charAt(i))
                        contChar++;
                    else
                        break;
                }
                if (word.length() == contChar)
                    contPreFix++;
            }
            if (contPreFix > 1) {
                sets.add("Conjunto Ruim");
                break;
            }
            contPreFix = 0;
        }
        if (contPreFix < 2)
            sets.add("Conjunto Bom");
    }

}


