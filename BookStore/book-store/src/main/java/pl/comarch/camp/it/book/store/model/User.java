package pl.comarch.camp.it.book.store.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User implements Cloneable {
    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private Role role;

    @Override
    public User clone() {
        User user = new User();
        user.setId(this.id);
        user.setLogin(this.login);
        user.setPassword(this.password);
        user.setName(this.name);
        user.setSurname(this.surname);
        user.setRole(this.role);
        return user;
    }

    public enum Role {
        USER,
        ADMIN
    }
}