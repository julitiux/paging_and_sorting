package com.paging_and_sorting.webApi;

import com.paging_and_sorting.domain.User;
import com.paging_and_sorting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResponseEntity<Page<User>> getPageUser(@RequestParam Integer page,
                                                @RequestParam Integer size,
                                                @RequestParam String sortBy) {
    Page<User> userPage = userService.geAllUsersPaginated(page, size, sortBy);
    return !Objects.isNull(userPage) ? new ResponseEntity<>(userPage, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

}
