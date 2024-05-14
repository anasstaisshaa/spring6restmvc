package anastasiia.springframework.spring6restmvc.service;

import anastasiia.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> listCustomers();
    Customer getCustomerById(UUID uuid);

    Customer saveNewCustomer(Customer customer);
}
