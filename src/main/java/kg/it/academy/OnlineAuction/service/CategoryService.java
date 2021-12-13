package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.entity.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    List<Category> getAll();

    Category findById(Long id);

    Category deleteById(Long id);
}
