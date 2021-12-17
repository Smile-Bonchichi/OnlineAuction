package kg.it.academy.OnlineAuction.service.impl;

import kg.it.academy.OnlineAuction.dto.roleDto.request.RoleRequestDto;
import kg.it.academy.OnlineAuction.dto.roleDto.response.RoleResponseDto;
import kg.it.academy.OnlineAuction.mappers.RoleMapper;
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
    public RoleResponseDto save(RoleRequestDto roleRequestDto) {
        return RoleMapper.INSTANCE
                .toResponseDto(roleRepository.save(RoleMapper.INSTANCE.toRoleEntity(roleRequestDto)));
    }

    @Override
    public List<RoleResponseDto> getAll() {
        return RoleMapper.INSTANCE.toRolesDto(roleRepository.findAll());
    }

    @Override
    public RoleResponseDto findById(Long id) {
        return RoleMapper.INSTANCE.toResponseDto(roleRepository.getById(id));
    }

    @Override
    public RoleResponseDto deleteById(Long id) {
        return null;
    }
}
