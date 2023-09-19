package com.paging_and_sorting.webApi.mapper;

import com.paging_and_sorting.domain.User;
import com.paging_and_sorting.webApi.domain.UserDTO;

public class UserMapper {

  public static UserDTO of(User user) {
    return new UserDTO(user.getUsername(), user.getName(), user.getLastname());
  }

}
