package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.entity.Category;
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
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Category deleteById(Long id) {
        Category category = findById(id);
        if (category != null)
            categoryRepository.deleteById(id);
        return category;
    }
}
