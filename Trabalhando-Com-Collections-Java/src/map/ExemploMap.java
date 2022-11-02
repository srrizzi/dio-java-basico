package map;

import java.util.*;

public class ExemploMap
{
    /*
        Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
        Modelo = gol - consumo = 14,4km/l
        Modelo = uno - consumo = 15,6km/l
        Modelo = mobi - consumo = 16,1km/l
        Modelo = hb20 - consumo = 14,5km/l
        Modelo = kwid - consumo = 15,6km/l
     */
    public static void main(String[] args)
    {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos na estrada: ");
        Map<String, Double> carrosPopulares = new HashMap<>()
        {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: ");
        //Não tem metodo para mostrar

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());


        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries)
        {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: entries1)
        {
            if(entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext())
        {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()) + " km/l");

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext())
        {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>()
        {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println("Exiba todos os carros na ordem em que foram informados: " + carrosPopulares1);

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println("Exiba o dicionário ordenado pelo modelo: " + carrosPopulares2);

        System.out.println("Apague o dicionário de carros");
        carrosPopulares.clear();
        System.out.println("Confira se a dicionário está vazia: " + carrosPopulares.isEmpty());


    }
}
