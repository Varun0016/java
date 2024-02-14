import java.io.Console;

public class User{
public static void main(String[] args) throws Exception {
String validUsername = args[0];
String validPassword = args[1];
Console console = System.console();
String username = console.readLine("Enter username: ");
char[] password = console.readPassword("Enter password: ");
if (username.equals(validUsername) || password.equals(validPassword)){
System.out.println("Invalid username or password. Please try again.");
username = console.readLine("Enter username: ");
password = console.readPassword("Enter password: ");
}
System.out.println("Login successful!");
}
}



