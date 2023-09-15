package com.paging_and_sorting.service;

import com.paging_and_sorting.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {

  Page<User> geAllUsersPaginated(Integer page, Integer size, String sortBy);

}
