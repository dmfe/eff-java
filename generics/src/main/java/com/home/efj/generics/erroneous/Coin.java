package com.home.efj.generics.erroneous;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Coin {

    @Getter
    private final int value;

    public Coin(int val) {
       value = val;
    }
}
