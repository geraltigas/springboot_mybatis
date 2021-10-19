package com.geraltigas.mapper;


import com.geraltigas.pojo.Scinews;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Mapper
@Repository
public interface ScinewsMapper {

    @Delete("delete from learning.sci_news where title = #{title}")
    int deleteScinewsByTitle(String title);

    @Delete("delete from learning.sci_news where user_id = #{user_id}")
    int deleteScinewsByUserId(String user_id);

    @Insert("insert into learning.sci_news (id,title,type,user_id,link,cover,downloads,create_by,update_by) value (#{id} , #{title} , #{type},#{user_id},#{link},#{cover},#{downloads},#{create_by},#{update_by})")
    int insertScinews(
            String id,
            String title,
            String type,
            String user_id,
            String link,
            String cover,
            Integer downloads,
            Timestamp gmt_created,
            String create_by,
            Timestamp gmt_updated,
            String update_by
    );

    @Update("update learning.sci_news set id = #{id},title=#{title},type=#{type},user_id=#{user_id},link=#{link},cover=#{cover},downloads=#{downloads},create_by=#{create_by},update_by=#{update_by} where id=#{id}")
    int updateScinews(
            String id,
            String title,
            String type,
            String user_id,
            String link,
            String cover,
            Integer downloads,
            Timestamp gmt_created,
            String create_by,
            Timestamp gmt_updated,
            String update_by
    );

    @Select("select * from learning.sci_news where id = #{user_id}")
    List<Scinews> findByUserId(String user_id);

    @Select("select * from learning.sci_news")
    List<Scinews> getAll();

}
