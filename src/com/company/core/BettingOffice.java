package com.company.core;

import java.util.ArrayList;
import java.util.List;

public class BettingOffice {

    public BettingOffice(){
        bets = new ArrayList<>();
    }

    private final List<Bet> bets;

    public void addBet(Bet bet) {
        this.bets.add(bet);
    }

}
