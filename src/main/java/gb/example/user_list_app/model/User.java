package gb.example.user_list_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user") // Переименуйте таблицу
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Генерация уникального ID
    private Long id;

    private String name;
    private String email;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}