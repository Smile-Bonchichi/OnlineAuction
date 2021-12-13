package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.ItemDto.request.ItemRequestDto;
import kg.it.academy.OnlineAuction.dto.ItemDto.response.ItemResponseDto;
import kg.it.academy.OnlineAuction.mappers.ItemMapper;
import kg.it.academy.OnlineAuction.repository.ItemRepository;
import kg.it.academy.OnlineAuction.service.ItemService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemServiceImpl implements ItemService {
    final ItemRepository itemRepository;

    @Override
    public ItemResponseDto save(ItemRequestDto itemRequestDto) {
        return ItemMapper.INSTANCE.toItemResponseDto(
                itemRepository.save(ItemMapper.INSTANCE
                        .toItemEntity(itemRequestDto))
        );
    }

    @Override
    public List<ItemResponseDto> getAll() {
        return ItemMapper.INSTANCE.toItemsResponseDto(itemRepository.findAll());
    }

    @Override
    public ItemResponseDto findById(Long id) {
        return ItemMapper.INSTANCE.toItemResponseDto(itemRepository.getById(id));
    }

    @Override
    public ItemResponseDto deleteById(Long id) {
        return null;
    }
}
