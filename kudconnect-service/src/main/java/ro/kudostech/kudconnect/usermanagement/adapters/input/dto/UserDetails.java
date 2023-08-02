package ro.kudostech.kudconnect.usermanagement.adapters.input.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {
    private String id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;
}
