package kg.it.academy.OnlineAuction.dto.ItemDto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemRequestDto {
    String name;

    String description;

    List<Long> categoryId;
}
