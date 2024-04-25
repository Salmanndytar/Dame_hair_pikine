package com.Dame_hair_pikine.Dame_hair_pikine.Services.interfaces;

import com.Dame_hair_pikine.Dame_hair_pikine.dto.RoleDto;
import com.Dame_hair_pikine.Dame_hair_pikine.model.Role;

public interface IRole {
    RoleDto addRol(RoleDto role);
    RoleDto editeRole(RoleDto role);
    void deleteRole(Integer id);
}
