package nl.saxofoonleren.demo_spring_jpa.repository;

import nl.saxofoonleren.demo_spring_jpa.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}