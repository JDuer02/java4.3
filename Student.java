import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String Address;

  public Student(String name, String surname, int age, String address) {
    Name = name;
    Surname = surname;
    Age = age;
    Address = address;
  }
  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  public String GetAddress() {return Address;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age)+ " " + Address;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error", -1, "Parse Error");
    return new Student(data[0],data[1], Integer.parseInt(data[2]), data[3]);
  }
}
