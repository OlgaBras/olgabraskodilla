public class Application {
    public static void main(String[] args) {
        User user = new User( name:"Adam", age: 40.5, height 178);
        userValidator userValidator = new userValidator();
        userValidator.validateName(user);
        userValidator.validateAge(user);
        userValidator.validateHeight(user);

    }
}