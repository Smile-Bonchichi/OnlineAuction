package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.History;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    @Query(nativeQuery = true, value =
            "        select case " +
                    "   when tab.price is null then 0 " +
                    "   else tab.price " +
                    "end " +
                    "from ( " +
                    "   select " +
                    "       max(t.price) price " +
                    "   from histories t " +
                    "   where t.id = :id) tab ")
    BigDecimal getMaxAuctionPrice(Long id);
}
