package com.bosko.microservicesbeerservice.web.mappers;

import com.bosko.microservicesbeerservice.domain.Beer;
import com.bosko.microservicesbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
