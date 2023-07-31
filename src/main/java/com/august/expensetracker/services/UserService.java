package com.august.expensetracker.services;

import com.august.expensetracker.domain.User;
import com.august.expensetracker.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
