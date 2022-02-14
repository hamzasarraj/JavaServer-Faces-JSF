package com.formation.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.formation.entity.Client;
@ManagedBean("facade")
@ApplicationScoped
public class ClientFacadeBean implements ClientFacade {
	private static List<Client> clients;
	private static int i = 1;

	@Override
	public Client createClient(Client client) {
		client.setId(i++);
		clients.add(client);
		return client;
	}

	@Override
	public List<Client> findClients() {
		return clients;
	}

	@Override
	public void delete(Client client) {
		clients.remove(client);
	}
	@PostConstruct
	private void init() {
		clients = new ArrayList<Client>();
		clients.add(new Client(i++, "Didier","Pelat"));
		clients.add(new Client(i++, "Léna","Mbengue"));
		clients.add(new Client(i++, "Jean","Henry"));
		clients.add(new Client(i++, "Jim","Alec"));
	}

}
