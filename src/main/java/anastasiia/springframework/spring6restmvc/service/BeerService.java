package anastasiia.springframework.spring6restmvc.service;

import anastasiia.springframework.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}