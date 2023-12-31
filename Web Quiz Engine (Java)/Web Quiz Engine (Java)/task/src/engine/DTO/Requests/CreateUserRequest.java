package engine.DTO.Requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequest {
    @Pattern(regexp = ".+@.+\\..+")
    private String email;

    @Size(min = 5)
    @NotBlank
    private String password;
}
