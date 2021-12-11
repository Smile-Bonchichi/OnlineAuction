package kg.it.academy.OnlineAuction.dto.UserDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    Long id;

    String login;

    String password;

    Long imageId;

    Long isActive;
}
