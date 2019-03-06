package tech.housekeeper.trian.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;

import tech.housekeeper.test.bean.Tree;

/**
 * Created by yiLiu on 2018-01-25.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String gethello() {
        return "hello";
    }

    @RequestMapping("/hh")
    public String getno() {
        return "no";
    }

    @RequestMapping("/tree")
    @ResponseBody
    public Tree gettree() {
    	 String [] tags = {"bug"};
    	 ArrayList<Tree> nodes = new ArrayList<Tree>(); 
        Tree t = new Tree();
        Tree t1 = new Tree();
        Tree t2 = new Tree();
        nodes.add(t1);
        nodes.add(t2);
        t.init("1", "1", tags, nodes);
        t1.init("1", "1", tags, null);
        t2.init("2", "2", null, null);
       
        return t;
    }
}
