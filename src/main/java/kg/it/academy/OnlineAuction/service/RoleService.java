package kg.it.academy.OnlineAuction.service;

import kg.it.academy.OnlineAuction.entity.Role;

import java.util.List;

public interface RoleService {
    Role save(Role role);

    List<Role> getAll();

    Role findById(Long id);

    Role deleteById(Long id);
}
