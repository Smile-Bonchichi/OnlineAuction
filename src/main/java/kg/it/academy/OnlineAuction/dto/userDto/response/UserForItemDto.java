package kg.it.academy.OnlineAuction.dto.userDto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserForItemDto {
    Long id;

    String login;
}
