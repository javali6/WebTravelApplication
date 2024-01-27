package com.web_travel.Controller;

import com.web_travel.Domain.Customer;
import com.web_travel.Domain.Reservation;
import com.web_travel.Service.ReservationService;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservation/{id}")
    public Reservation getReservation(@PathVariable String id) {
        return reservationService.findOne(Long.parseLong(id));
    }

    @PostMapping("/reservations")
    public ResponseEntity<Reservation> saveReservation(@RequestBody Reservation reservation) {
        Reservation newReservation = reservationService.createReservation(reservation);
        return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
    }
}
