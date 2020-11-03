package me.circlehotarux.eghibli.mapper;

import me.circlehotarux.eghibli.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    Role getRole(Integer roleId);
    List<Role> getRoles();
    List<Role> searchRoles(String filter);
}
