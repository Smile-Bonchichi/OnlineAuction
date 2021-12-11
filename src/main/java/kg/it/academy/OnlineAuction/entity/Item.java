package kg.it.academy.OnlineAuction.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Item extends BaseEntity {
    @Column(name = "name", nullable = false, unique = true)
    String name;

    @Column(name = "description")
    String description;

    @ManyToOne
    @JoinColumn(name = "image_id", nullable = false)
    Image image;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    Category category;
}
