package com.paging_and_sorting.service.impl;

import com.paging_and_sorting.domain.User;
import com.paging_and_sorting.repository.UserRepository;
import com.paging_and_sorting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Page<User> geAllUsersPaginated(Integer page, Integer size, String sortBy) {
    PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
    return userRepository.findAll(pageRequest);
  }

}
