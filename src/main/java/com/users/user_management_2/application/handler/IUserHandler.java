package com.users.user_management_2.application.handler;

import com.users.user_management_2.application.dto.request.UserRequestDto;

public interface IUserHandler{
    void saveUser(UserRequestDto userRequestDto);
}
