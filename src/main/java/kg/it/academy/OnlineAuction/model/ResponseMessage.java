package kg.it.academy.OnlineAuction.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponseMessage<T> {
    T value;
    String message;

    public ResponseMessage<T> prepareSuccessMessage(T value) {
        return ResponseMessage.<T>builder()
                .value(value)
                .message(null)
                .build();
    }

    public ResponseMessage<T> prepareFailMessage(String message) {
        return ResponseMessage.<T>builder()
                .value(null)
                .message(message)
                .build();
    }
}
