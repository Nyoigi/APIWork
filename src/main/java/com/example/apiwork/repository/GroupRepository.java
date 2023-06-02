package com.example.MPTSait.repository;

import com.example.MPTSait.model.newBd.Course;
import com.example.MPTSait.model.newBd.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Long> {

    Group findGroupByCourse(Course course);
    Group findGroupByNameGroup(String groupName);

    List<Group> findByCourse(Long course);
}
