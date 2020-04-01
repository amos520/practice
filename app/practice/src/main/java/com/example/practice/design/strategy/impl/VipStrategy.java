package com.example.practice.design.strategy.impl;

import com.example.practice.design.strategy.Strategy;
import org.springframework.stereotype.Component;

/**
 * Date: 2020/4/1 23:04
 *
 * @author: amos
 * Description:
 */
@Component
public class VipStrategy implements Strategy {
    @Override
    public String templateType() {
        return "vip";
    }

    @Override
    public String invoke() {
        return "this is " + templateType();
    }
}
