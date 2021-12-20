package kg.it.academy.OnlineAuction.boot;

import kg.it.academy.OnlineAuction.dto.categoryDto.request.CategoryRequestDto;
import kg.it.academy.OnlineAuction.entity.Role;
import kg.it.academy.OnlineAuction.repository.RoleRepository;
import kg.it.academy.OnlineAuction.service.CategoryService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApplicationStartRunner implements CommandLineRunner {
    final RoleRepository roleRepository;
    final CategoryService categoryService;

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(Role.builder()
                .nameRole("ROLE_ADMIN")
                .build());
        roleRepository.save(Role.builder()
                .nameRole("ROLE_USER")
                .build());

        categoryService.save(CategoryRequestDto.builder()
                .name("Одежда")
                .build());
        categoryService.save(CategoryRequestDto.builder()
                .name("Посуда")
                .build());
        categoryService.save(CategoryRequestDto.builder()
                .name("Электроника")
                .build());
        categoryService.save(CategoryRequestDto.builder()
                .name("Барахло")
                .build());
    }
}
