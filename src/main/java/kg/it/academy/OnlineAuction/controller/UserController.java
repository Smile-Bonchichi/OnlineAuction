package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.dto.UserDto.request.UserAuthDto;
import kg.it.academy.OnlineAuction.dto.UserDto.request.UserRequestDto;
import kg.it.academy.OnlineAuction.dto.UserDto.response.UserResponseDto;
import kg.it.academy.OnlineAuction.service.UserService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserController {
    final UserService userService;

    @PostMapping("/sign-in")
    public String getAuthToken(@RequestBody UserAuthDto userAuthDto) {
        return userService.getToken(userAuthDto);
    }

    @PostMapping("/save")
    public UserResponseDto save(@RequestBody UserRequestDto userRequestDto) {
        return userService.save(userRequestDto);
    }

    @GetMapping("/get-all-user")
    public List<UserResponseDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserResponseDto findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public UserResponseDto deleteById(@PathVariable Long id) {
        return userService.deleteById(id);
    }
}
