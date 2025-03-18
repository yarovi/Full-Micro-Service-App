package com.yasmani.net.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/booking")
public class BookingController {

	@GetMapping
	public ResponseEntity<String> getBooking() {
		return ResponseEntity.ok("Booking is working fine");
	}
}
