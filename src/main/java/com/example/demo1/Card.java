package com.example.demo1;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Card {
    public static final char[] types = {'\u2663', '\u2662', '\u2661', '\u2660'};
    int point;
    int type;
    public Card(int index) {
        point = index % 13 + 1;
        type = index / 13;
    }

    public Card(int point, int type) {
        this.point = point;
        this.type = type;
    }

    @Override
    public String toString() {

        return ((point < 10) ? " " : "") + point + "" + types[type];
        /*return "Card{" +
                "point=" + point +
                ", type=" + type +
                '}';*/
    }

}
