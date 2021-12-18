package kg.it.academy.OnlineAuction.job;

import kg.it.academy.OnlineAuction.entity.Auction;
import kg.it.academy.OnlineAuction.enums.Status;
import kg.it.academy.OnlineAuction.repository.AuctionRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuctionJob {
    final AuctionRepository auctionRepository;

    @Scheduled(fixedDelay = 5000)
    @Transactional
    public void checkAuctionForClose() {
        List<Auction> auctions = auctionRepository.findAll();

        auctions.stream()
                .filter(x -> LocalDateTime.now().compareTo(x.getEndTime()) >= 0)
                .forEach(x -> auctionRepository.updateStatus(Status.NOT_ACTIVE.toString(), x.getId()));
    }

    @Scheduled(fixedDelay = 5000)
    @Transactional
    public void checkAuctionForOpen() {
        List<Auction> auctions = auctionRepository.findAll();

        auctions.stream()
                .filter(x -> LocalDateTime.now().compareTo(x.getStartTime()) <= 0)
                .forEach(x -> auctionRepository.updateStatus(Status.ACTIVE.toString(), x.getId()));
    }
}
