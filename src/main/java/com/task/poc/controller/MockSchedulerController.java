package com.task.poc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // Allows requests from all origins for cross-origin resource sharing
@Log4j2 // Log4j 2 integration using Lombok for logging
@RestController  // Indicates that this class is a REST controller
@RequestMapping("api/mock-api")  // Base URL path for all methods in this controller
public class MockSchedulerController {

    @PostMapping()
    @ResponseBody  // Specifies that the method returns the response body directly
    public ResponseEntity<String> createSchedule(@RequestParam(name = "id") String id) {
        log.info("Received request Mock API: {}", id);

        return ResponseEntity.ok(id);
    }
}
