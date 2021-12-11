package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.Auction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
