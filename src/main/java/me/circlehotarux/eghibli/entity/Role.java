package me.circlehotarux.eghibli.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

// Role实体定义
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Role {
    private Integer roleId;
    private String name;
    private String description;
    private String portrait;
}
