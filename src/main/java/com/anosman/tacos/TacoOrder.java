package com.anosman.tacos;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Table("orders")
public class TacoOrder implements Serializable {

    @PrimaryKey
    private UUID id = Uuids.timeBased();

    private LocalDateTime placedAt = LocalDateTime.now();

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @NotBlank(message = "City is required")
    private String deliveryCity;

    @NotBlank(message = "Province is required")
    private String deliveryRegion;

    @NotBlank(message = "Zip is required")
    private String deliveryZip;

    @CreditCardNumber(message = "Invalid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message = "must match MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
    @Column("tacos")
    private List<TacoUDT> tacos = new ArrayList<>();
    public void addTaco(TacoUDT taco) {
        tacos.add(taco);
    }
}
