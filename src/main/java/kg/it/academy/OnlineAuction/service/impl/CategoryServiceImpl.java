package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.categoryDto.request.CategoryRequestDto;
import kg.it.academy.OnlineAuction.dto.categoryDto.response.CategoryResponseDto;
import kg.it.academy.OnlineAuction.mappers.CategoryMapper;
import kg.it.academy.OnlineAuction.repository.CategoryRepository;
import kg.it.academy.OnlineAuction.service.CategoryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryServiceImpl implements CategoryService {
    final CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDto save(CategoryRequestDto categoryRequestDto) {
        return CategoryMapper.INSTANCE
                .toResponseDto(categoryRepository.save(
                        CategoryMapper.INSTANCE.toCategoryEntity(categoryRequestDto)));
    }

    @Override
    public List<CategoryResponseDto> getAll() {
        return CategoryMapper.INSTANCE.toCategoriesDto(categoryRepository.findAll());
    }

    @Override
    public CategoryResponseDto findById(Long id) {
        return CategoryMapper.INSTANCE.toResponseDto(categoryRepository.getById(id));
    }

    @Override
    public CategoryResponseDto deleteById(Long id) {
        return null;
    }
}
