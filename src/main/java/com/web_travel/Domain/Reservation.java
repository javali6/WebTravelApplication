package com.web_travel.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservations")
public class Reservation {

    @Id
    private Long reservationId;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Tour tour;

    private LocalDate reservationDate;
    private Integer numberOfParticipants;

}
