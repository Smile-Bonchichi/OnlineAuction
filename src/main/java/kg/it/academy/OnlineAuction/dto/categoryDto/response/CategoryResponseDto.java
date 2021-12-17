package kg.it.academy.OnlineAuction.dto.categoryDto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryResponseDto {
    Long id;

    String name;
}
