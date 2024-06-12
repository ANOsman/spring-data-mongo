package com.anosman.tacos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.List;
import java.util.UUID;

@Data
@UserDefinedType
@NoArgsConstructor
@AllArgsConstructor
public class TacoUDT {

    private String name;
    private List<IngredientUDT> ingredients;
}
