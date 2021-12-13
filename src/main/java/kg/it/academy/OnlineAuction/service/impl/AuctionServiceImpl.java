package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.auctionDto.request.AuctionRequestDto;
import kg.it.academy.OnlineAuction.dto.auctionDto.response.AuctionResponseDto;
import kg.it.academy.OnlineAuction.mappers.AuctionMapper;
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
    public AuctionResponseDto save(AuctionRequestDto auctionRequestDto) {
        return AuctionMapper.INSTANCE.toAuctionDto(
                auctionRepository.save(AuctionMapper.INSTANCE
                        .toAuctionEntity(auctionRequestDto))
        );
    }

    @Override
    public List<AuctionResponseDto> getAll() {
        return AuctionMapper.INSTANCE.toAuctionsDto(auctionRepository.findAll());
    }

    @Override
    public AuctionResponseDto findById(Long id) {
        return AuctionMapper.INSTANCE.toAuctionDto(auctionRepository.getById(id));
    }

    @Override
    public AuctionResponseDto deleteById(Long id) {
        return null;
    }
}
