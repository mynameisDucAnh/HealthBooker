package com.example.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String fullName;
    @JsonProperty("phone_number")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;
    private String address;
    @NotBlank(message = "password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    @NotBlank(message = "retypePassword is required")
    private String retypePassword;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("facebook_account_id")
    private Integer facebookAccountId;
    @JsonProperty("google_account_id")
    private Integer googleAccountId;
    @JsonProperty("role_id")
    private Integer roleId;
}
