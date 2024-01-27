package com.web_travel.Service;

import com.web_travel.Domain.Customer;
import com.web_travel.Domain.Reservation;
import com.web_travel.Domain.Tour;
import com.web_travel.Repository.CustomerRepository;
import com.web_travel.Repository.ReservationRepository;
import com.web_travel.Repository.TourRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TourRepository tourRepository;

    public Reservation findOne(Long id) {
        return reservationRepository.getReferenceById(id);
    }

    @Transactional
    public Reservation createReservation(Reservation reservation) {
        log.info("Creating reservation with data: {}", reservation);

        Optional<Customer> customer = customerRepository.findById(reservation.getReservationid());
        Optional<Tour> tour = tourRepository.findById(reservation.getReservationid());

        if(customer.isEmpty() || tour.isEmpty()) {
            throw new RuntimeException("Customer or Tour not found");
        }

        Reservation newReservation = Reservation.builder()
                .customer(customer.get())
                .tour(tour.get())
                .reservationDate(reservation.getReservationDate())
                .numberOfParticipants(reservation.getNumberOfParticipants()).build();


        return reservationRepository.save(newReservation);
    }
}
