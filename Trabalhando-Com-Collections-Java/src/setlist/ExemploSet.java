package setlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args)
    {
        // Dada uma lista com 7 noras de um aluno[ 7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        System.out.println("Crie um conjunto e adivione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //  System.out.println("Exiba a posição da nota 5.0: ");
        //  não é possivel a achar a posição utilizando um SET.

        //  System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        //  Não consigo trabalhar com "POSIÇÕES" em um set.

        //  System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //  não é possivel fazer substituição com SET.

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //  System.out.println("Exiba a terceira nota adicionada: ");
        //  Não é possivel adicionar somente no GET.
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext())
        {
            Double next = iterator.next();
            soma += next; 
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média da notas: " + (soma/ notas.size()));

        notas.remove(0d);
        System.out.println("Remova a nota 0: " + notas);

        // System.out.println("Remova a nota da posição 0: ");
        //  Nao é possivel pois não da para fazer nada com posição.

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext())
        {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("Exiba todas as notas na ordem em que foram informada: " + notas2);

        //  Set<Double> notas3 = new TreeSet<>(notas2);
        //  System.out.println("Exiba todas as notas na ordem crescente: " + notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

    }
}
