package com.crescentd.repository.impl;

import com.crescentd.entity.Student;
import com.crescentd.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"ysity",24));
        studentMap.put(2L,new Student(2L,"wwy",24));
        studentMap.put(3L,new Student(3L,"ytisy",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void delete(long id) {
        studentMap.remove(id);
    }
}
