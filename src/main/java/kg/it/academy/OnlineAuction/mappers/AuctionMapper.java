package kg.it.academy.OnlineAuction.mappers;

import kg.it.academy.OnlineAuction.dto.auctionDto.request.AuctionRequestDto;
import kg.it.academy.OnlineAuction.dto.auctionDto.response.AuctionResponseDto;
import kg.it.academy.OnlineAuction.entity.Auction;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuctionMapper {
    AuctionMapper INSTANCE = Mappers.getMapper(AuctionMapper.class);

    Auction toAuctionEntity(AuctionRequestDto auctionRequestDto);

    AuctionResponseDto toAuctionDto(Auction auction);

    List<AuctionResponseDto> toAuctionsDto(List<Auction> auctions);
}
