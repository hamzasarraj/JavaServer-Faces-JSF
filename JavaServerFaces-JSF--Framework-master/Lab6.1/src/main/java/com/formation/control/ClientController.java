package com.formation.control;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.formation.business.ClientFacade;
import com.formation.entity.Client;

@RequestScoped
@Named("clientController")
public class ClientController {
	@Inject
	private ClientFacade clientFacade;
	private Client client = new Client();
	public String deleteAction(Client cli) {
		clientFacade.findClients().remove(cli);
		return null;
	}
	public String saveAction() {
		for(Client cli:clientFacade.findClients()) {
			cli.setEditable(false);
		}
		return null;
	}
	public String editClient(Client client) {
		client.setEditable(true);
		return null;
	}
	
	public String createClient() {
		clientFacade.createClient(client);
		return null;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
public List<Client> getClientList(){
	return clientFacade.findClients();
}
	public void setClientFacade(ClientFacade clientFacade) {
		this.clientFacade = clientFacade;
	}

}
