package org.openlab.opennlabcustomersevice.mappers;

import org.mapstruct.Mapper;
import org.openlab.opennlabcustomersevice.dtos.CustomerRequestDTO;
import org.openlab.opennlabcustomersevice.dtos.CustomerResponseDTO;
import org.openlab.opennlabcustomersevice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);
}
