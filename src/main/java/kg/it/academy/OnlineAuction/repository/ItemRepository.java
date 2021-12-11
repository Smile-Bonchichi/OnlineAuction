package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
