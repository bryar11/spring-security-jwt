package com.javausergroupcr.springsecurity.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javausergroupcr.springsecurity.app.models.service.IClientService;
import com.javausergroupcr.springsecurity.app.view.xml.ClientList;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@Secured("ROLE_ADMIN")
	@GetMapping(value = "/list")
	public ClientList list() {
		return new ClientList(clientService.findAll());
	}
}
