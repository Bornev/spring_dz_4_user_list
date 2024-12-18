package gb.example.user_list_app;

import gb.example.user_list_app.model.User;
import gb.example.user_list_app.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserListAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserListAppApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            User user1 = new User();
            user1.setName("Иван Иванов");
            user1.setEmail("ivan@example.com");
            userRepository.save(user1);

            User user2 = new User();
            user2.setName("Петр Петров");
            user2.setEmail("petr@example.com");
            userRepository.save(user2);
        };
    }
}