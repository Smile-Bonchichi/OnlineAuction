package kg.it.academy.OnlineAuction.dto.roleDto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponseDto {
    Long id;

    String name;
}
