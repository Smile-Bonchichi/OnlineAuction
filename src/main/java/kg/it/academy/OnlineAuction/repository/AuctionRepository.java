package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.Auction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {
    @Query(nativeQuery = true, value = "SELECT t.* FROM auctions t WHERE t.id = :id")
    Auction getAuctionById(Long id);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE auctions SET status = :newStatus WHERE id = :auctionId")
    void updateStatus(String newStatus, Long auctionId);
}
