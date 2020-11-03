package me.circlehotarux.eghibli.service;

import me.circlehotarux.eghibli.entity.Role;

import java.util.List;

public interface RoleService {
    // 获取所有角色
    List<Role> getRoles();

    // 搜索角色
    List<Role> searchRoles(String text);

    // 查找角色
    Role getRole(Integer roleId);
}
