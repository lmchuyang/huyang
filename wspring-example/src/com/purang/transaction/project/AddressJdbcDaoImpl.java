package com.purang.transaction.project;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class AddressJdbcDaoImpl extends NamedParameterJdbcDaoSupport implements IAddressDao {
    private final String INSERT_SQL = " insert into address(province, city, street, user_id) values('province', 'city', 'street', 12) ";  
    private final String COUNT_ALL_SQL = " select count(*) from address ";  
    //insert into address(province, city, street, user_id) values(:province, :city, :street, :user_Id)
	@Override
	public void save(AddressModel address) {
		   KeyHolder generatedKeyHolder = new GeneratedKeyHolder();  
	        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(address);  
	        getNamedParameterJdbcTemplate().update(INSERT_SQL, paramSource, generatedKeyHolder);
	        address.setId(generatedKeyHolder.getKey().intValue());  
	}
	@Override
	public int countAll() {
		 return getJdbcTemplate().queryForInt(COUNT_ALL_SQL);  
	}  
}
