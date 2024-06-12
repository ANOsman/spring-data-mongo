package com.anosman.tacos;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
@UserDefinedType
public class IngredientUDT {

    private String name;
    private Ingredient.Type type;
}
