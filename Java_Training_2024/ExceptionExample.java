import java.io.*;
import java.sql.SQLException;

public class ExceptionExample {

  public static void main(String[] args) {
    try {
      System.out.println("In try block");
      throw new Error("Error in try");
  } finally {
      System.out.println("In finally block");
      throw new Error("Error in finally");
  }

  }
}
