package kg.it.academy.OnlineAuction.dto.placeBetDto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlaceBetRequestDto {
    BigDecimal price;

    Long auctionId;
}
