package com.users.user_management_2.domain.usecase;

import com.users.user_management_2.domain.api.IUserServicePort;
import com.users.user_management_2.domain.model.Role;
import com.users.user_management_2.domain.model.UserModel;
import com.users.user_management_2.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;
    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }
    @Override
    public void saveUser(UserModel userModel) {
        userPersistencePort.saveUser(userModel);
    }
}
