package com.example.tasklist.web.dto.user;

import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {
    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name length must be smaller that 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @NotNull(message = "UserName must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "UserName length must be smaller that 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String userName;

    @NotNull(message = "Password must be not null", groups = {OnUpdate.class, OnCreate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "Password confirmation must be not null", groups = {OnCreate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String passwordConfirmation;
}
