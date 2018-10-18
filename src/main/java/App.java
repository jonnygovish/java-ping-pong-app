import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a number:");
    String stringUserNumber = myConsole.readLine();
    int intUserNumber = Integer.parseInt(stringUserNumber);
    PingPong pingPong = new PingPong();
    List<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
    System.out.println(pingPongResult);
  }
}