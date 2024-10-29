package com.example.dao;


import com.example.common.Result;
import com.example.entity.Admin;
import com.example.entity.Params;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;


@Repository
public interface AdminDao extends Mapper<Admin> {

    List<Admin> findBySearch(@Param("params") Params params);

}

