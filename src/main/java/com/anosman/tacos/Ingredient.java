package com.anosman.tacos;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Ingredient {

    private String id;
    private String name;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, CHEESE, SAUCE, VEGGIES
    }
}
