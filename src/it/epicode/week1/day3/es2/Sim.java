package it.epicode.week1.day3.es2;

public class Sim {

    private int number;
    private double credit;
    private String[] callsList = new String[5];

    public Sim(int number, double credit, String[] callsList) {
        this.number = number;
        this.credit = credit;
        this.callsList = callsList;
    }

    public void recharge(int num) {
        credit += num;
    }

    public void call(double duration, int number) {
        double priceForMin = 0.15;
        double priceCall = priceForMin * duration;
        if (credit > priceCall) {

            credit = credit - priceCall;
            addCallToCallsList(number, duration);
        }else {
            System.out.println("You don't have credit fot call");
        }
    }

    private void addCallToCallsList(int number, double duration) {
        String callInfo = "Chiamata a " + number + " per " + duration + "minuti";

        for (int i = callsList.length - 1; i > 0; i--) {
            callsList[i] = callsList[i - 1];
        }
        callsList[0] = callInfo;
    }

    public void printData() {
        System.out.println(number);
        System.out.println(String.format("Credit: %.2f", credit));
        for (String call : callsList){
            System.out.println(call);
        }
    }
}
