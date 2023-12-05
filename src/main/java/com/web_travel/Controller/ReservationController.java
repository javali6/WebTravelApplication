package com.web_travel.Controller;

import com.web_travel.Domain.Reservation;
import com.web_travel.Service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/reservation")
    public Reservation saveReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }
}
