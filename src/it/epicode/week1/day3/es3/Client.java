package it.epicode.week1.day3.es3;

import java.util.Date;

public class Client {

    private int clientCode;
    private String name;
    private String email;
    private int inscriptionDate;

    public Client (int clientCode,String name, String email, int inscriptionDate){
        this.clientCode = clientCode;
        this.name = name;
        this.email = email;
        this.inscriptionDate = inscriptionDate;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInscriptionDate(int inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public int getInscriptionDate() {
        return inscriptionDate;
    }
}
