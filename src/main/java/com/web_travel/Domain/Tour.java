package com.web_travel.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tours")
public class Tour {
    @Id
    private Long tourId;

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal price;
    private String description;
    private Integer maxParticipants;
}
