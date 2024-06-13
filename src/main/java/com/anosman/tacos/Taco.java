package com.anosman.tacos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Taco {

    private Long id;

    @NotNull
    @Size(min = 1, message = "Name must be at least 5 characters long")
    private String name;

    private LocalDateTime createdAt = LocalDateTime.now();

    @NotNull
    @Size(min = 1, message = "You must choose at least one ingredient")
    private List<Ingredient> ingredients;

}
