package kg.it.academy.OnlineAuction.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum Status {
    ACTIVE(0L, "Активен"),
    IN_ADVERTISING(1L, "В рекламе"),
    SALES(2L, "Продано");

    final Long id;
    final String message;
}
