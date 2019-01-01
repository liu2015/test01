package test01;

import java.util.List;


import com.java.dao.bao;
import com.java.dao.setgetdao;
import com.java.dao.zhixing.zhixing;

public class test01 {
	
	
	public static void main(String[] args){
		
	
	System.out.println("git中文支持");
	System.out.println("项目测试");
	System.out.println("更改日期2019-01-01");
	zhixing g=new zhixing();
	List<setgetdao> list=g.selecttb_memo();
	
	for (int i = 0; i < list.size(); i++) {
		setgetdao tb_memo = list.get(i);
		System.out.println(tb_memo.getId()+ "\t"+tb_memo.getUsername()+ "\t"+tb_memo.getTitle()+ "\t"+tb_memo.getContent()+ "\t"+tb_memo.getMemotype()+ "\t"+tb_memo.getMemotime());
		
	}
	
	
	}
}
