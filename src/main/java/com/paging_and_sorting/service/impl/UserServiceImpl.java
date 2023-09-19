package com.paging_and_sorting.service.impl;

import com.paging_and_sorting.domain.User;
import com.paging_and_sorting.repository.UserRepository;
import com.paging_and_sorting.service.UserService;
import com.paging_and_sorting.webApi.domain.UserDTO;
import com.paging_and_sorting.webApi.mapper.UserMapper;
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
  public Page<UserDTO> geAllUsersPaginated(Integer page, Integer size, String sortBy) {
    PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
    Page<User> userPage = userRepository.findAll(pageRequest);
    return userPage.map(UserMapper::of);
  }

}
