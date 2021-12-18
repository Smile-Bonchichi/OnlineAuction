package kg.it.academy.OnlineAuction.mappers;

import kg.it.academy.OnlineAuction.dto.refillDto.RefillForUserDto;
import kg.it.academy.OnlineAuction.dto.refillDto.RefillRequestDto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RefillMapper {
    RefillMapper INSTANCE = Mappers.getMapper(RefillMapper.class);

    RefillForUserDto toRefillForUser(RefillRequestDto refillRequestDto);
}
