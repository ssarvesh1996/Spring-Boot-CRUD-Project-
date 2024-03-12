package BackendProject.moduls;

import BackendProject.entities.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserDto {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Role role;
}
