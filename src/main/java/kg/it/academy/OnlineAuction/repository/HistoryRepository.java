package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.History;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    @Query(nativeQuery = true, value = "SELECT MAX(t.price) FROM histories t WHERE t.auction_id = :id")
    BigDecimal getMaxAuctionPrice(Long id);
}
