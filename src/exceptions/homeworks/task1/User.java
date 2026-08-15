package exceptions.homeworks.task1;

public class User {
    private String user;
    private String login;
    private String password;
    private String email;
    private int age;

    public User(String user, String login, String password, String email, int age) {
        this.user = user;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
