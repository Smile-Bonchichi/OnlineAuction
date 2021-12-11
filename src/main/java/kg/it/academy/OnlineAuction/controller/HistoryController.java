package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.entity.History;
import kg.it.academy.OnlineAuction.service.HistoryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryController {
    final HistoryService historyService;

    @PostMapping
    public History save(@RequestBody History history) {
        return historyService.save(history);
    }

    @GetMapping
    public List<History> getAll() {
        return historyService.getAll();
    }

    @GetMapping("/{id}")
    public History findById(@PathVariable Long id) {
        return historyService.findById(id);
    }

    @DeleteMapping("/{id}")
    public History deleteById(@PathVariable Long id) {
        return historyService.deleteById(id);
    }
}
