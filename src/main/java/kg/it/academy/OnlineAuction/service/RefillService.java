package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.refillDto.RefillForUserDto;

import java.math.BigDecimal;

public interface RefillService {
    BigDecimal payWallet(RefillForUserDto refillForUserDto);
}
