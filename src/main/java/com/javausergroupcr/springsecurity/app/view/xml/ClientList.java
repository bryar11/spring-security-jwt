package com.javausergroupcr.springsecurity.app.view.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.javausergroupcr.springsecurity.app.models.entity.Client;

@XmlRootElement(name = "clients")
public class ClientList {

	@XmlElement(name = "client")
	public List<Client> clients;

	public ClientList() {
	}

	public ClientList(List<Client> clients) {
		this.clients = clients;
	}

	public List<Client> getClients() {
		return clients;
	}
}