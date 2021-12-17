package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.historyDto.HistoryDto;
import kg.it.academy.OnlineAuction.entity.History;
import kg.it.academy.OnlineAuction.mappers.HistoryMapper;
import kg.it.academy.OnlineAuction.repository.HistoryRepository;
import kg.it.academy.OnlineAuction.service.HistoryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryServiceImpl implements HistoryService {
    final HistoryRepository historyRepository;

    public HistoryDto save(History history) {
        return null;
    }

    public History saveHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public List<HistoryDto> getAll() {
        return HistoryMapper.INSTANCE.toHistoriesResponseDto(historyRepository.findAll());
    }

    @Override
    public HistoryDto findById(Long id) {
        return HistoryMapper.INSTANCE.toHistoryDto(historyRepository.getById(id));
    }

    @Override
    public HistoryDto deleteById(Long id) {
        return null;
    }
}
