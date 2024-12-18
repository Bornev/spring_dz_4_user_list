package gb.example.user_list_app.repository;

import gb.example.user_list_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}