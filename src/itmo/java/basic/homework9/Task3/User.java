package itmo.java.basic.homework9.Task3;

import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        this.name = normalize(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = normalize(name);
    }

    private String normalize(String name) {
        return name == null ? null : name.trim().toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}