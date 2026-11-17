package pl.szlify.meetingroombookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szlify.meetingroombookingapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
