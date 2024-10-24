package anastasiia.springframework.spring6restmvc.mappers;

import anastasiia.springframework.spring6restmvc.entities.Beer;
import anastasiia.springframework.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO beerDTO);

    BeerDTO beerToBeerDto(Beer beer);
}
