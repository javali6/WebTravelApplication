package com.web_travel.Controller;

import com.web_travel.Service.TourService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TourController {

    @Autowired
    private TourService tourService;
}
