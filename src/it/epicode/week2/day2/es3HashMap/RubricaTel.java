package it.epicode.week2.day2.es3HashMap;

import java.util.HashMap;
import java.util.Set;

public class RubricaTel {

    HashMap<String, Integer> rubrica;

    public RubricaTel() {
        this.rubrica = new HashMap<>();
    }

    public void addElement(String nome, Integer numero) {
        this.rubrica.put(nome, numero);
    }

    public void cancelByName(String name) {
        if (rubrica.containsKey(name)) {
            this.rubrica.remove(name);
        }else {
            System.out.println("Nome non esistente!!");
        }
    }

    public String getNameOfNumber(Integer numero) {

        Set<String> keys = rubrica.keySet();
        String searchedName = "";

        for (String name : keys) {
            if (rubrica.get(name).equals(numero)) {
                searchedName = name;
                System.out.println(searchedName);
                return searchedName;
            }
        }
        System.out.println("Il numero non è in rubrica");
        return searchedName;
    }

    public void getNumByName(String name) {
        System.out.println(rubrica.get(name));
    }


    @Override
    public String toString() {
        return "RubricaTel{" +
                "rubrica=" + rubrica +
                '}';
    }
}
