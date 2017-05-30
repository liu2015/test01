package com.java.dao.zhixing;

import java.util.List;

import com.java.dao.bao;
import com.java.dao.jiekou;
import com.java.dao.setgetdao;

public class zhixing extends bao implements jiekou {

	@Override
	public void insserttb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		
		String sql="";
		Object[] wanneng={};
		super.update(sql, wanneng);

	}

	@Override
	public void deletetb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] wanneng={};
		super.update(sql, wanneng);
	}

	@Override
	public void updatetb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		String sql="";
		Object[] wanneng={};
		super.update(sql, wanneng);
	}

	@Override
	public List<setgetdao> selecttb_memo() {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
