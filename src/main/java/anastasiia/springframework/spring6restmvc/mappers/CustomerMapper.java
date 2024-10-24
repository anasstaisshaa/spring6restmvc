package anastasiia.springframework.spring6restmvc.mappers;

import anastasiia.springframework.spring6restmvc.entities.Customer;
import anastasiia.springframework.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer CustomerDtoToCustomer(CustomerDTO customerDTO);

    CustomerDTO CustomerToCustomerDto(Customer customer);
}
