package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
}
