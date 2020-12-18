package nl.saxofoonleren.demo_spring_jpa.Service;

import nl.saxofoonleren.demo_spring_jpa.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();
    Client getClientById(long id);
    void deleteClient(long id);
    long saveClient(Client client);

}
