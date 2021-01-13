/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.SQLException;
import java.util.List;

import model.Todo;

/**
 *
 * @author Hariza Syawal
 */
public interface TodoDao {

 void insertTodo(Todo todo) throws SQLException;

 Todo selectTodo(long todoId);

 List<Todo> selectAllTodos();

 boolean deleteTodo(int id) throws SQLException;

 boolean updateTodo(Todo todo) throws SQLException;

}
