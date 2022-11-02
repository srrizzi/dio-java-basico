package stream;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI
{
    public static void main(String[] args)
    {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.forEach(System.out::println);


//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        System.out.println("Transfome esta lista de String em uma lista de números inteiros.");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt).toList()
//                .forEach(System.out::println);

//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2)).toList();
//        System.out.println(listParesMaioresQue2);

//        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt).toList()
                .removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatorios);

    }
}
