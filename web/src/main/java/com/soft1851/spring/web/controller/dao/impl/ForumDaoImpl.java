package com.soft1851.spring.web.controller.dao.impl;


import com.soft1851.spring.web.controller.dao.ForumDao;
import com.soft1851.spring.web.controller.entity.Forum;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/17 15:47
 * @Description
 */
@Component
public class ForumDaoImpl implements ForumDao {


    private JdbcTemplate jdbcTemplate;


    public ForumDaoImpl(JdbcTemplate jdbcTemplate){
        this.setJdbcTemplate(jdbcTemplate);
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    /**
     * 增加
     * @param forum
     * @return
     */
    @Override
    public int insert(Forum forum) {
       String sql = "INSERT INTO t_forum VALUES (NULL,?)";
       Object[] args = {forum.getForumName()};
       return jdbcTemplate.update(sql,args);
    }

    /**
     * 批量增加
     * @param forums
     * @return
     */
    @Override
    public int[] batchInsert(List<Forum> forums) {
        final List<Forum> forumList = forums;
        String sql = "INSERT INTO t_forum VALUES(NULL,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1,forumList.get(i).getForumName());
            }

            @Override
            public int getBatchSize() {
                return forumList.size();
            }
        });
    }

    /**
     * 删除
     * @param forumId
     * @return
     */
    @Override
    public int delete(int forumId) {
        String sql = "DELETE FROM t_forum WHERE forum_id = ?";
        Object[] args = {forumId};
        return jdbcTemplate.update(sql,args);

    }



    /**
     * 根据Id查询Forum
     * @param forumId
     * @return
     */
    @Override
    public Forum get(int forumId) {
        String sql = "SELECT * FROM t_forum WHERE forum_id=?";
        Object[] args = {forumId};
        return jdbcTemplate.queryForObject(sql,args,new BeanPropertyRowMapper<>(Forum.class));

    }

    /**
     * 查询所有论坛的信息
     * @return
     */
    @Override
    public List<Forum> selectAll() {
      String sql = "SELECT * FROM t_forum";
      return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Forum.class));

    }


}
