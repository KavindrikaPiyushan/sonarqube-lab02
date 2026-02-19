package main.java.com.example;

public class App {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        System.out.println(calc.calculate(10, 5, "add"));

        UserService service = new UserService();
        service.findUser("admin");
        service.deleteUser("admin"); // NEW dangerous call
    }
}

