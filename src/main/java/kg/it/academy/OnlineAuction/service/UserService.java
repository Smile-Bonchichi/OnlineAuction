package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.refillDto.RefillRequestDto;
import kg.it.academy.OnlineAuction.dto.userDto.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.userDto.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.userDto.response.UserResponseDto;

import java.math.BigDecimal;

public interface UserService extends BaseService<UserResponseDto, UserRequestDto> {
    String getToken(UserAuthDto userAuthDto);

    BigDecimal payWallet(RefillRequestDto refillRequestDto);
}
