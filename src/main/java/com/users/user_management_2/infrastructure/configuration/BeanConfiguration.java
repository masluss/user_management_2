package com.users.user_management_2.infrastructure.configuration;

import com.users.user_management_2.domain.api.IUserServicePort;
import com.users.user_management_2.domain.spi.IUserPersistencePort;
import com.users.user_management_2.domain.usecase.UserUseCase;
import com.users.user_management_2.infrastructure.out.jpa.adapter.UserJpaAdapter;
import com.users.user_management_2.infrastructure.out.jpa.mapper.IUserEntityMapper;
import com.users.user_management_2.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private  final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort objectServicePort() {
        return new UserUseCase(userPersistencePort());
    }

}
