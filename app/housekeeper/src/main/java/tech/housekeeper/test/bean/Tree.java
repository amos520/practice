package tech.housekeeper.test.bean;

import java.util.ArrayList;

import lombok.Data;

/**
 * Created by Administrator on 2018/3/28.
 */
@Data
public class Tree {
    private String id;
    private String text;
    private String [] tags;
    private ArrayList<Tree> nodes;
    
	public void init(String id, String text, String[] tags, ArrayList<Tree> nodes) {	
		this.id = id;
		this.text = text;
		this.tags = tags;
		this.nodes = nodes;
	}
    
    
}
