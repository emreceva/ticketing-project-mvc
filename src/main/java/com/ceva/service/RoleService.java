package com.ceva.service;

import com.ceva.dto.RoleDTO;
import com.ceva.dto.UserDTO;
import com.ceva.entity.Role;

import java.util.List;

public interface RoleService extends CrudService<RoleDTO, Long> {

        UserDTO myLogic(UserDTO user,String str);

}
