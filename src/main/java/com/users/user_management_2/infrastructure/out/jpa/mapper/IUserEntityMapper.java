package com.users.user_management_2.infrastructure.out.jpa.mapper;

import com.users.user_management_2.domain.model.UserModel;
import com.users.user_management_2.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserEntityMapper {
    UserEntity toEntity(UserModel userModel);
    UserModel toUserModel(UserEntity userEntity);
}
