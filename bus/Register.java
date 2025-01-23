package bus;
public class Register {
    String FullName;
    int Age;
    String Gender;
    String Telephone;
    String Address;

    Register()
    {
        FullName = "unknown";
        Age = 0;
        Gender = "unknown";
        Telephone = "unknown";
        Address = "unknown";
    }
    Register(String Full_Name, int age, String gender, String telephone, String address)
    {
        FullName = Full_Name;
        Age = age;
        Gender = gender;
        Telephone = telephone;
        Address = address;
    }
}
