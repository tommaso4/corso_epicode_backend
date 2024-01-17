package it.epicode.week2.day3StreamLambda;

public class Costumer {
    Long id;
    String name;
    Integer tier;

    public Costumer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                '}';
    }
}
