package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.entity.Item;
import kg.it.academy.OnlineAuction.service.ItemService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemController {
    final ItemService itemService;

    @PostMapping
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Item deleteById(@PathVariable Long id) {
        return itemService.deleteById(id);
    }
}
