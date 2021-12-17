package kg.it.academy.OnlineAuction.dto.ItemDto.response;

import kg.it.academy.OnlineAuction.dto.userDto.response.UserForItemDto;
import kg.it.academy.OnlineAuction.entity.Category;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemResponseForAuctionDto {
    String name;

    String description;

    List<Category> category;

    UserForItemDto user;
}
