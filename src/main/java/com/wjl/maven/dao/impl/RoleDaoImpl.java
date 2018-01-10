package com.wjl.maven.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wjl.maven.dao.IRoleDao;
import com.wjl.maven.pojo.po.Role;

public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao {

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub ��������
		String sql = "INSERT INTO role(rname,alias) value(?,?)";
		getJdbcTemplate().update(sql,role.getRname(),role.getAlias());

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub ����idɾ��
		String sql = "delete from role where rid = ?";
		getJdbcTemplate().update(sql,id);

	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub �޸�role��Ϣ
		String sql = "update role set rname = ?,alias = ? where rid = ?";
		getJdbcTemplate().update(sql,role.getRname(),role.getAlias(),role.getRid());

	}

	/*@Override*/
	/*public Role getById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from role where rid = ?";
		
		//ֱ�Ӳ�ѯ
		Role role = (Role) getJdbcTemplate().queryForObject(sql, new Object[]{id},new RowMapper<Object>(){
			
			public Object mapRow(ResultSet resultSet,int index) throws SQLException{
				
				return mapRowHandler(resultSet);
			}
		});
		return role;

	}*/
	 public int getTotalCount() {

	        String sql = "select count(*) from role ;";

	        Integer count = getJdbcTemplate().queryForObject(sql,Integer.class);

	        return count;
	    }

	    //��ѯ����
	    public List<Role> getAll() {

	        String  sql = "select * from role";

	        List<Role> list =  getJdbcTemplate().query(sql, new RowMapper<Role>() {
	            public Role mapRow(ResultSet resultSet, int i) throws SQLException {

	                return mapRowHandler(resultSet);
	            }
	        });

	        return list;
	    }

	    private Role mapRowHandler(ResultSet resultSet) throws  SQLException{
	           Role role = new Role();
	           role.setRid(resultSet.getInt("rid"));
	           role.setRname(resultSet.getString("rname"));
	           role.setAlias(resultSet.getString("alias"));
	           return  role;
	    }

		@Override
		public void getById(Integer id) {
			// TODO Auto-generated method stub
			
		}

}
