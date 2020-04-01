package com.example.practice.design.strategy.service;

import com.example.practice.design.strategy.Strategy;
import com.example.practice.design.strategy.impl.NormalStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 2020/4/1 23:06
 *
 * @author: amos
 * Description:
 */
@Service
public class TypeService {

    @Autowired
    List<Strategy> list;


    public String get(String type) {
        return list.stream()
                .filter(e -> e.templateType()
                        .equals(type))
                .findFirst()
                .orElse(new NormalStrategy())
                .invoke();
    }
}
