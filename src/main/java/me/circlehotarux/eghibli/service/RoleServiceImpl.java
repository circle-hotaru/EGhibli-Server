package me.circlehotarux.eghibli.service;


import me.circlehotarux.eghibli.entity.Role;
import me.circlehotarux.eghibli.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    // 获取所有角色
    @Override
    public List<Role> getRoles() {
        List<Role> roles = roleMapper.getRoles();
        return  roles;
    }

    // 搜索角色
    @Override
    public List<Role> searchRoles(String text){
        String filter = "%"+text+"%";
        List<Role> roles = roleMapper.searchRoles(filter);
        return roles;
    }

    // 查找角色
    @Override
    public Role getRole(Integer roleId){
        Role role = roleMapper.getRole(roleId);
        return role;
    }
}
