package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.dto.auctionDto.request.AuctionRequestDto;
import kg.it.academy.OnlineAuction.dto.auctionDto.response.AuctionResponseDto;
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
    public AuctionResponseDto save(@RequestBody AuctionRequestDto auctionRequestDto) {
        return auctionService.save(auctionRequestDto);
    }

    @GetMapping
    public List<AuctionResponseDto> getAll() {
        return auctionService.getAll();
    }

    @GetMapping("/{id}")
    public AuctionResponseDto findById(@PathVariable Long id) {
        return auctionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public AuctionResponseDto deleteById(@PathVariable Long id) {
        return auctionService.deleteById(id);
    }
}
