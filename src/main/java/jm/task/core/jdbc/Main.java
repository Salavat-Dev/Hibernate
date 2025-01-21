package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov",(byte) 25);
        userService.saveUser("Petr", "Petrov",(byte) 21);
        userService.saveUser("Nikolay", "Nikolayev",(byte) 33);
        userService.saveUser("Lena", "Poleno",(byte) 27);
        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
