package com;

import java.sql.ResultSet;

/**
 * Created by sc on 2018/11/3.
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet resultSet,int rowNum)throws Exception;
}
