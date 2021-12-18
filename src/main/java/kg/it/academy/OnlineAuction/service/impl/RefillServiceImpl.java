package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.refillDto.RefillForUserDto;
import kg.it.academy.OnlineAuction.service.RefillService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RefillServiceImpl implements RefillService {
    final String url = "";

    @Override
    public BigDecimal payWallet(RefillForUserDto refillForUserDto) {
        return null;
    }
}
