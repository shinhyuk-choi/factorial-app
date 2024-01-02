package com.example.factorialapp.healthcheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/probe")
public class HealthCheckController {

    private final Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @GetMapping("/startup")
    public String startupCheck() {
        logger.info("Startup probe");
        return "Startup OK";
    }

    @GetMapping("/ready")
    public String readinessCheck() {
        logger.info("Readiness probe");
        return "Readiness OK";
    }

    @GetMapping("/live")
    public String livenessCheck() {
        logger.info("Liveness probe");
        return "Liveness OK";
    }

}
