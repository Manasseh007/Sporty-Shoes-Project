package Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}
