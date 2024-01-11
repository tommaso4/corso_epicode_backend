package it.epicode.week1.day3.es2;

public class UseSim {

    public static void main(String[] args) {

        Sim sim = new Sim(334, 0, new String[5]);

        sim.recharge(25);

        sim.call(2.2, 334);
        sim.call(2.2, 32234);
        sim.call(2.2, 00);
        sim.call(2.2, 00);

        sim.printData();
    }
}
