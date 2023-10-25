package com.users.user_management_2.infrastructure.out.jpa.adapter;

import com.users.user_management_2.domain.model.UserModel;
import com.users.user_management_2.domain.spi.IUserPersistencePort;
import com.users.user_management_2.infrastructure.out.jpa.entity.UserEntity;
import com.users.user_management_2.infrastructure.out.jpa.mapper.IUserEntityMapper;
import com.users.user_management_2.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;

    private final IUserEntityMapper userEntityMapper;
    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity userEntity = userRepository.save(userEntityMapper.toEntity(userModel));
        return userEntityMapper.toUserModel(userEntity);
    }
}
