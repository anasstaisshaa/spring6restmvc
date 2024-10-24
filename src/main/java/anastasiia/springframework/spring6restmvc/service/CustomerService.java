package anastasiia.springframework.spring6restmvc.service;

import anastasiia.springframework.spring6restmvc.model.CustomerDTO;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<CustomerDTO> listCustomers();
    CustomerDTO getCustomerById(UUID uuid);

    CustomerDTO saveNewCustomer(CustomerDTO customer);

    void updateCustomerById(UUID id, CustomerDTO customer);

    void deleteById(UUID id);

    void patchCustomerById(UUID id, CustomerDTO customer);
}

