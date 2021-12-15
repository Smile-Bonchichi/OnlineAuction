package kg.it.academy.OnlineAuction.dto.UserDto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {
    Long id;

    String login;

    Long imageId;
}
