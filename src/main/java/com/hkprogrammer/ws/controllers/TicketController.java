package com.hkprogrammer.ws.controllers;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.ws.TicketService;

@RestController
@RequestMapping("v1/ticket")
@CrossOrigin
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping
	public Map<String, String> buildTicket(@RequestHeader(name = "Authorization") String authorization) {
		String token = Optional.ofNullable(authorization).map(it -> it.replace("Bearer ", "")).orElse("");
		String ticket = ticketService.buildAndSaveTicket(token);
		return Map.of("ticket", ticket);
	}

}
