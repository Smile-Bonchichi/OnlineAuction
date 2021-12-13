package kg.it.academy.OnlineAuction.dto.auctionDto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuctionRequestDto {
    LocalDateTime addTime;

    LocalDateTime startTime;

    LocalDateTime endTime;

    Long itemId;
}
