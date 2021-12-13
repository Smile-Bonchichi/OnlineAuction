package kg.it.academy.OnlineAuction.dto.historyDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryDto {
    Long auctionId;

    Long userId;

    BigDecimal price;
}
