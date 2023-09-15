package com.paging_and_sorting.service.impl;

import com.paging_and_sorting.domain.User;
import com.paging_and_sorting.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Override
    public Page<User> geAllUsersPaginated(Integer page, Integer size, String sortBy) {
    return null;
  }

}
