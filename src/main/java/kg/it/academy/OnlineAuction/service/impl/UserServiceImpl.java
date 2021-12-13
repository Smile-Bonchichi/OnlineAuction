package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.UserDto.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.UserDto.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.UserDto.response.UserResponseDto;
import kg.it.academy.OnlineAuction.entity.User;
import kg.it.academy.OnlineAuction.entity.UserRole;
import kg.it.academy.OnlineAuction.exceptions.UserNotFoundException;
import kg.it.academy.OnlineAuction.exceptions.UserSignInException;
import kg.it.academy.OnlineAuction.mappers.UserMapper;
import kg.it.academy.OnlineAuction.repository.UserRepository;
import kg.it.academy.OnlineAuction.repository.UserRoleRepository;
import kg.it.academy.OnlineAuction.service.RoleService;
import kg.it.academy.OnlineAuction.service.UserService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;
    final RoleService roleService;
    final UserRoleRepository userRoleRepository;

    final PasswordEncoder passwordEncoder;

    @Override
    public String getToken(UserAuthDto userAuthDto) {
        try {
            User user = userRepository
                    .findByLogin(userAuthDto.getLogin())
                    .orElseThrow(() -> new UserNotFoundException("Пользователь не найден!"));
            boolean isMatches = passwordEncoder.matches(userAuthDto.getPassword(), user.getPassword());
            if (isMatches) {
                return "Basic " + new String(Base64
                        .getEncoder().encode((
                                userAuthDto.getLogin() + ":" + userAuthDto.getPassword()
                        ).getBytes()));
            } else {
                throw new UserSignInException("Неправильный логин или пароль!");
            }
        } catch (Exception e) {
            //log
            return null;
        }
    }

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        User user = UserMapper.INSTANCE.toUserEntity(userRequestDto);
        user.setIsActive(1L);
        user.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));
        userRepository.save(user);

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(roleService.findById(2L));
        userRoleRepository.save(userRole);

        return UserMapper.INSTANCE.toUserResponseDto(user);
    }

    @Override
    public List<UserResponseDto> getAll() {
        return UserMapper.INSTANCE.toUsersResponseDto(userRepository.findAll());
    }

    @Override
    public UserResponseDto findById(Long id) {
        return UserMapper.INSTANCE.toUserResponseDto(userRepository.getById(id));
    }

    @Override
    public UserResponseDto deleteById(Long id) {
        return null;
    }
}
