package com.users.user_management_2.domain.spi;

import com.users.user_management_2.domain.model.UserModel;

public interface IUserPersistencePort {
    UserModel saveUser(UserModel userModel);
}
