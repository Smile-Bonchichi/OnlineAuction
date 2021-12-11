package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.entity.Auction;
import kg.it.academy.OnlineAuction.service.AuctionService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auction")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuctionController {
    final AuctionService auctionService;

    @PostMapping
    public Auction save(@RequestBody Auction auction) {
        return auctionService.save(auction);
    }

    @GetMapping
    public List<Auction> getAll() {
        return auctionService.getAll();
    }

    @GetMapping("/{id}")
    public Auction findById(@PathVariable Long id) {
        return auctionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Auction deleteById(@PathVariable Long id) {
        return auctionService.deleteById(id);
    }
}
