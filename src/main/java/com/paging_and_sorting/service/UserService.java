package com.paging_and_sorting.service;

import com.paging_and_sorting.webApi.domain.UserDTO;
import org.springframework.data.domain.Page;

public interface UserService {

  Page<UserDTO> geAllUsersPaginated(Integer page, Integer size, String sortBy);

}
