package com.jenkins.pivotal.JenkinsPivotalExample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookingService")
public class BookingController {

    @GetMapping
    @RequestMapping("/ticketBooking")
    public String TicketBooking() {
        return "Booking confirmation status  : Confirmed";
    }
}
