package com.example.orm.sqlSession;


import com.example.orm.pojo.Configuration;
import com.example.orm.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
