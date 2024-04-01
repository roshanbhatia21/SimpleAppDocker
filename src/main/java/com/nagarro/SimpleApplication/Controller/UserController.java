package com.nagarro.SimpleApplication.Controller;

//UserController.java

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {

 private List<String> users = new ArrayList<>();

 @GetMapping
 public List<String> getUsers() {
     return users;
 }

 @PostMapping
 public String addUser(@RequestBody String user) {
     users.add(user);
     return "User added successfully";
 }
}
