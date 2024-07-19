package com.rishi.todo.dao;

import com.rishi.todo.helper.Helper;
import com.rishi.todo.models.Todo;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;

public class TodoRowMapper implements RowMapper<Todo> {
    @Override
    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Todo todo = new Todo();
        todo.setId((rs.getInt("id")));
        todo.setTitle((rs.getString("title")));
        todo.setContent((rs.getString("content")));
        todo.setStatus((rs.getString("status")));

        //Data format9
        try {
            todo.setAddedDate(Helper.parseDate((LocalDateTime) rs.getObject("addedDate")));
            todo.setToDoDate(Helper.parseDate((LocalDateTime) rs.getObject("todoDate")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return todo;
    }
}
