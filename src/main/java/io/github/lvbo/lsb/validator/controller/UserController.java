package io.github.lvbo.lsb.validator.controller;

import io.github.lvbo.lsb.validator.dto.UserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvbo
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @RequestMapping
    public void createUser(@RequestBody @Validated UserDto userDto) {
    }
}