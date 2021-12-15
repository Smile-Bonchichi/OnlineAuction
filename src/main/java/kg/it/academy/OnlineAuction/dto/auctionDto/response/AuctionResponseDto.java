package kg.it.academy.OnlineAuction.dto.auctionDto.response;

import kg.it.academy.OnlineAuction.dto.ItemDto.response.ItemResponseForAuctionDto;
import kg.it.academy.OnlineAuction.entity.Item;
import kg.it.academy.OnlineAuction.enums.Status;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuctionResponseDto {
    LocalDateTime addTime;

    LocalDateTime startTime;

    LocalDateTime endTime;

    ItemResponseForAuctionDto item;

    Status status;
}
