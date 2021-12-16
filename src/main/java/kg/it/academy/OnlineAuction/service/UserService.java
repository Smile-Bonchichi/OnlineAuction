package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.userDto.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.userDto.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.userDto.response.UserResponseDto;

public interface UserService extends BaseService<UserResponseDto, UserRequestDto> {
    String getToken(UserAuthDto userAuthDto);
}
