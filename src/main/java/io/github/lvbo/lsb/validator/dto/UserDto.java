package io.github.lvbo.lsb.validator.dto;


import io.github.lvbo.lsb.validator.validation.PhoneNumber;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.util.List;

/**
 * @author lvbo
 */
@NoArgsConstructor
@Data
public class UserDto {

    @NotBlank(message = "{user.name.empty}")
    @Pattern(regexp = "^\\d.+", message = "{user.name.regexp}")
    private String name;

    @Length(min = 6, max = 20, message = "{user.password.length}")
    private String password;

    @Min(value = 18, message = "{user.age.min}")
    @Max(value = 100, message = "{user.age.max}")
    private int age;

    @Range(min = 4, max = 50, message = "{user.workingYears.range}")
    private int workingYears;

    @Email
    @NotNull(message = "{user.email.notNull}")
    private String email;

    @Size(min = 1, max =10, message = "{user.interests.size}")
    private List<String> interests;

    @PhoneNumber(message = "{user.phoneNumber.phoneNumber}")
    private String phoneNumber;
}
