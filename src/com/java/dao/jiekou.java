package com.java.dao;

import java.util.List;

public interface jiekou {

	//增删改查等操作
	//增加
void insserttb_memo(setgetdao tb_memo);
	//删除
void deletetb_memo(setgetdao tb_memo);
void updatetb_memo(setgetdao tb_memo);	
	
List<setgetdao> selecttb_memo();
	
	
	
}
