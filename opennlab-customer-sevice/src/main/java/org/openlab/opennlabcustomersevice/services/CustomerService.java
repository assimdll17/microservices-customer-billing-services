package org.openlab.opennlabcustomersevice.services;

import org.openlab.opennlabcustomersevice.dtos.CustomerRequestDTO;
import org.openlab.opennlabcustomersevice.dtos.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> getCustomers();
}
