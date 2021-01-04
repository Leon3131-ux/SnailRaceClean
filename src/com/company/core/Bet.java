package com.company.core;

public class Bet {

    public Bet(Gambler owner, Snail target, Long amount, int rank){
        this.owner = owner;
        this.target = target;
        this.amount = amount;
        this.rank = rank;
    }

    private final Gambler owner;

    private final Snail target;

    private final Long amount;

    private final int rank;

    public Gambler getOwner() {
        return owner;
    }

    public Snail getTarget() {
        return target;
    }

    public Long getAmount() {
        return amount;
    }

    public int getRank() {
        return rank;
    }
}
