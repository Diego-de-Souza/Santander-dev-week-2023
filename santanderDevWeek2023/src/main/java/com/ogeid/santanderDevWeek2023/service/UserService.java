package com.ogeid.santanderDevWeek2023.service;

import com.ogeid.santanderDevWeek2023.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);


}
