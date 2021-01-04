package com.company.core;

public class Gambler {

    public Gambler(String name){
        this.name = name;
        this.balance = 0L;
    }

    private final String name;

    private Long balance;

    public String getName(){
        return this.name;
    }

    public void addToBalance(Long amount){
        this.balance += amount;
    }

    public void subtractFromBalance(Long amount){
        this.balance -= amount;
    }

    public Long getBalance(){
        return this.balance;
    }

}
