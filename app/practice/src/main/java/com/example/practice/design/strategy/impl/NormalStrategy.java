package com.example.practice.design.strategy.impl;

import com.example.practice.design.strategy.Strategy;
import org.springframework.stereotype.Component;

/**
 * Date: 2020/4/1 23:03
 *
 * @author: amos
 * Description:
 */
@Component
public class NormalStrategy implements Strategy {
    @Override
    public String templateType() {
        return "normal";
    }

    @Override
    public String invoke() {
        return "this is " + templateType();
    }
}
