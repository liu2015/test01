package com.java.dao.zhixing;

import java.util.ArrayList;
import java.util.List;

import com.java.dao.bao;
import com.java.dao.jiekou;
import com.java.dao.setgetdao;

public class zhixing extends bao implements jiekou {

	@Override
	public void insserttb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO tb_memo(id,username,title,content,memotype,memotime) VALUES (?,?,?,?,?,?)";
		
		Object[] wanneng={tb_memo.getId(),tb_memo.getUsername(),tb_memo.getTitle(),tb_memo.getContent(),tb_memo.getMemotype(),tb_memo.getMemotime()};
	//	Object[] wanneng={tb_memo.getUsername(),tb_memo.getId()};
		super.update(sql, wanneng);

	}

	@Override
	public void deletetb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		String sql="DELETE  FROM tb_memo WHERE id=?";
		Object[] wanneng={tb_memo.getId()};
		super.update(sql, wanneng);
	}

	@Override
	public void updatetb_memo(setgetdao tb_memo) {
		// TODO Auto-generated method stub
		String sql="UPDATE tb_memo SET username=? WHERE id=?";
		Object[] wanneng={tb_memo.getUsername(),tb_memo.getId()};

		//String sql="INSERT INTO tb_memo(id,username,title,content,memotype,memotime) VALUES (?,?,?,?,?,?)";
	//	Object[] wanneng={};
		super.update(sql, wanneng);
	}

	@Override
	public List<setgetdao> selecttb_memo() {
		List<setgetdao> list =new ArrayList<setgetdao>();
		String sql="SELECT * FROM tb_memo";
		
		Object[] wanneng=null;
		
		super.rs=super.getresultset(sql, wanneng);
		try{
			while (rs.next()){
				setgetdao sgt=new setgetdao();
				
				sgt.setId(rs.getInt(1));
				sgt.setUsername(rs.getString(2));
				sgt.setTitle(rs.getString(3));
				sgt.setContent(rs.getString(4));
				sgt.setMemotype(rs.getString(5));
				sgt.setMemotime(rs.getDate(6));
				list.add(sgt);
				
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			super.clone(conn, ps, rs);
		}
		
		
		
		
		// TODO Auto-generated method stub
		return list;
	}

}
