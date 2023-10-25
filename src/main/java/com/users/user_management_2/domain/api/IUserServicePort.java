package com.users.user_management_2.domain.api;

import com.users.user_management_2.domain.model.UserModel;

public interface IUserServicePort {
    void saveUser(UserModel userModel);
}
