package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.refill.RefillRequestDto;
import kg.it.academy.OnlineAuction.dto.user.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.user.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.user.response.UserResponseDto;

import java.math.BigDecimal;

public interface UserService extends BaseService<UserResponseDto, UserRequestDto> {
    String getToken(UserAuthDto userAuthDto);

    BigDecimal payWallet(RefillRequestDto refillRequestDto);
}
