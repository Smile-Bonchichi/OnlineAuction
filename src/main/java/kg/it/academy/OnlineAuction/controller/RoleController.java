package kg.it.academy.OnlineAuction.controller;

import kg.it.academy.OnlineAuction.entity.Role;
import kg.it.academy.OnlineAuction.service.RoleService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleController {
    final RoleService roleService;

    @PostMapping
    public Role save(@RequestBody Role role) {
        return roleService.save(role);
    }

    @GetMapping
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable Long id) {
        return roleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Role deleteById(@PathVariable Long id) {
        return roleService.deleteById(id);
    }
}
