package anastasiia.springframework.spring6restmvc.controller;

import anastasiia.springframework.spring6restmvc.model.Beer;
import anastasiia.springframework.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerId(UUID id){

        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(id);
    }
}