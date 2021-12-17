package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.placeBetDto.request.PlaceBetRequestDto;
import kg.it.academy.OnlineAuction.dto.placeBetDto.response.PlaceBetResponseDto;
import kg.it.academy.OnlineAuction.entity.History;
import kg.it.academy.OnlineAuction.exceptions.LowPriceException;
import kg.it.academy.OnlineAuction.repository.AuctionRepository;
import kg.it.academy.OnlineAuction.repository.UserRepository;
import kg.it.academy.OnlineAuction.service.HistoryService;
import kg.it.academy.OnlineAuction.service.PlaceBetService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlaceBetServiceImpl implements PlaceBetService {
    final AuctionRepository auctionRepository;
    final HistoryService historyService;
    final UserRepository userRepository;

    @Override
    public PlaceBetResponseDto placeBet(PlaceBetRequestDto placeBetRequestDto) {
        if (placeBetRequestDto.getPrice()
                .compareTo(historyService.getMaxPrice(placeBetRequestDto.getAuctionId())) > 0) {

            History history = historyService.saveHistory(History.builder()
                    .auction(auctionRepository
                            .getAuctionById(placeBetRequestDto.getAuctionId()))
                    .user(userRepository
                            .findByLogin(SecurityContextHolder
                                    .getContext()
                                    .getAuthentication()
                                    .getName()))
                    .price(placeBetRequestDto.getPrice())
                    .build());

            return PlaceBetResponseDto.builder()
                    .auctionName(history.getAuction().getName())
                    .price(history.getPrice())
                    .build();
        } else {
            throw new LowPriceException("Маленькая цена", HttpStatus.PAYMENT_REQUIRED);
        }
    }
}
