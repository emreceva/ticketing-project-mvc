package com.ceva.service;

import com.ceva.dto.ProjectDTO;
import com.ceva.dto.UserDTO;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO,String> {
    void complete(ProjectDTO project);

    List<ProjectDTO> findAllNonCompletedProjects();

    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);
}
