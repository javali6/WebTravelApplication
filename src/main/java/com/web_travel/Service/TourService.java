package com.web_travel.Service;

import com.web_travel.Repository.TourRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;
}
