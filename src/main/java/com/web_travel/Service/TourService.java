package com.web_travel.Service;

import com.web_travel.Domain.Tour;
import com.web_travel.Repository.TourRepository;
import io.micrometer.observation.ObservationFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    public Tour save(Object tour) {
        return tourRepository.save((Tour) tour);
    }

    public ObservationFilter findById(Long id) {
        return null;
    }

    public void delete(Object tour) {
        tourRepository.delete((Tour) tour);
    }

}
