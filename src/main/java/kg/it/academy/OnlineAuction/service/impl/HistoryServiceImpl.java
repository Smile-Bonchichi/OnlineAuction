package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.entity.History;
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

    @Override
    public History save(History history) {
        return historyRepository.save(history);
    }

    @Override
    public List<History> getAll() {
        return historyRepository.findAll();
    }

    @Override
    public History findById(Long id) {
        return historyRepository.getById(id);
    }

    @Override
    public History deleteById(Long id) {
        History history = findById(id);
        if (history != null)
            historyRepository.deleteById(id);
        return history;
    }
}
