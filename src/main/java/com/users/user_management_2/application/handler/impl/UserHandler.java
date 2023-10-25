package com.users.user_management_2.application.handler.impl;

import com.users.user_management_2.application.dto.request.UserRequestDto;
import com.users.user_management_2.application.handler.IUserHandler;
import com.users.user_management_2.application.mapper.IUserRequestMapper;
import com.users.user_management_2.domain.api.IUserServicePort;
import com.users.user_management_2.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(userModel);
    }
}
