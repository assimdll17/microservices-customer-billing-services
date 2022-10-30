package org.openlab.opennlabcustomersevice.repositories;

import org.openlab.opennlabcustomersevice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
