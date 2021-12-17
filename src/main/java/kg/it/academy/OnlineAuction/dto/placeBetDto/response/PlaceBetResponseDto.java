package kg.it.academy.OnlineAuction.dto.placeBetDto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlaceBetResponseDto {
    String auctionName;

    BigDecimal price;
}
