package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.dto.categoryDto.request.CategoryRequestDto;
import kg.it.academy.OnlineAuction.dto.categoryDto.response.CategoryResponseDto;
import kg.it.academy.OnlineAuction.entity.Category;
import kg.it.academy.OnlineAuction.service.CategoryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryController {
    final CategoryService categoryService;

    @PostMapping
    public CategoryResponseDto save(@RequestBody CategoryRequestDto categoryRequestDto) {
        return categoryService.save(categoryRequestDto);
    }

    @GetMapping
    public List<CategoryResponseDto> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryResponseDto findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public CategoryResponseDto deleteById(@PathVariable Long id) {
        return categoryService.deleteById(id);
    }
}
