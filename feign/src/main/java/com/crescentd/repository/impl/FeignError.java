package com.crescentd.repository.impl;

import com.crescentd.entity.Student;
import com.crescentd.repository.FeignClients;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignClients {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中，敬请期待！";
    }
}
