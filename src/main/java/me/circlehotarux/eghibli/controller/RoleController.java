package me.circlehotarux.eghibli.controller;

import me.circlehotarux.eghibli.entity.Role;
import me.circlehotarux.eghibli.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    // 创建连接数据库的接口实例
    @Autowired
    private RoleService roleService;

    // 监听'/role/get' 返回所有角色数据
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> getRoles() {
        List<Role> roles = roleService.getRoles();
        return  roles;
    }

    // 监听'/role/search' 接收一个参数 返回过滤后的角色数据
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> searchRoles(@RequestParam("filter") String filter){
        List<Role> roles = roleService.searchRoles(filter);
        return roles;
    }
}
