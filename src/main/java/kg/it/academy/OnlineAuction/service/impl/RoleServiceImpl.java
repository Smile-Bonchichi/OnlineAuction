package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.entity.Role;
import kg.it.academy.OnlineAuction.repository.RoleRepository;
import kg.it.academy.OnlineAuction.service.RoleService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleServiceImpl implements RoleService {
    final RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.getById(id);
    }

    @Override
    public Role deleteById(Long id) {
        Role role = findById(id);
        if (role != null)
            roleRepository.deleteById(id);
        return role;
    }
}
