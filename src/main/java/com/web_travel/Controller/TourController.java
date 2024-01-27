package com.web_travel.Controller;

import com.web_travel.Domain.Tour;
import com.web_travel.Service.TourService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/tours")
public class TourController {

    @Autowired
    private TourService tourService;

    @GetMapping
    public List<Tour> getAllTours() {
        return tourService.findAll();
    }
    @PostMapping
    public ResponseEntity<Tour> createTour(@RequestBody Tour tour) {
        return new ResponseEntity<>(tourService.save(tour), HttpStatus.CREATED);
    }

}
