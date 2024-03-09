package com.sruthi.FullStackCRUD.exception;     
              
public class UserNotFoundException extends RuntimeException{
      
    public UserNotFoundException(Long id) {
        super("Could not found the user with ID " + id);
    }
}
