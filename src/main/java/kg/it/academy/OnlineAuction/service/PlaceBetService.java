package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.dto.placeBetDto.request.PlaceBetRequestDto;
import kg.it.academy.OnlineAuction.dto.placeBetDto.response.PlaceBetResponseDto;

public interface PlaceBetService {
    PlaceBetResponseDto placeBet(PlaceBetRequestDto placeBetRequestDto);
}
