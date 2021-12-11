package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.entity.Auction;
import kg.it.academy.OnlineAuction.repository.AuctionRepository;
import kg.it.academy.OnlineAuction.service.AuctionService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuctionServiceImpl implements AuctionService {
    final AuctionRepository auctionRepository;

    @Override
    public Auction save(Auction auction) {
        return auctionRepository.save(auction);
    }

    @Override
    public List<Auction> getAll() {
        return auctionRepository.findAll();
    }

    @Override
    public Auction findById(Long id) {
        return auctionRepository.getById(id);
    }

    @Override
    public Auction deleteById(Long id) {
        Auction auction = findById(id);
        if (auction != null)
            auctionRepository.deleteById(id);
        return auction;
    }
}
