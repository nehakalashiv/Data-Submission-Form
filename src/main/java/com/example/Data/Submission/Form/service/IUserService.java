package com.example.Data.Submission.Form.service;

import com.example.Data.Submission.Form.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User addUser(User user);
}
