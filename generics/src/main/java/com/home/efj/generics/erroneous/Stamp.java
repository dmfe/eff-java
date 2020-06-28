package com.home.efj.generics.erroneous;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Stamp {

    @Getter
    private final String name;

    public Stamp(String name) {
        this.name = name;
    }
}
