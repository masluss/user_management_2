package com.users.user_management_2.application.mapper;

import com.users.user_management_2.application.dto.request.UserRequestDto;
import com.users.user_management_2.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    UserModel toUser (UserRequestDto userRequestDto);
}
