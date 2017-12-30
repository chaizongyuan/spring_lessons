package cn.et.lesson02.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	@Autowired
	private JdbcTemplate template;
	public List<Map<String, Object>> queryMyResult(String sql){
		return template.queryForList(sql);
	}
}
