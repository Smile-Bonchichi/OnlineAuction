package kg.it.academy.OnlineAuction.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "history")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class History extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "auction_id")
    Auction auction;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "price")
    BigDecimal price;
}
