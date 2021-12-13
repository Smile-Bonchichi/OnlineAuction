package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.UserDto.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.UserDto.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.UserDto.response.UserResponseDto;

public interface UserService extends BaseService<UserResponseDto, UserRequestDto> {
    String getToken(UserAuthDto userAuthDto);
}
