package UserAdmin;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class User {
    //Attributter
    private int id;
    private String name;
    private String password;
    private final String fileH = "user.txt";




    User(int id) {setId(id);}
    User(int id, String name, String password) {
        setId(id);
        setName(name);
        setPassword(password);   }

    //Getter og setter
    int getId() {
        return id;
    }
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setPassword(String password) {
        this.password = password;
    }
    String getPassword() {
        return password;
    }
/*
    //metode
    public String file() {
        try {
            PrintStream file = new PrintStream("user.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return id+name+password;

    }


 */
    //ToString-metode
    public String toString() { return "ID: " + getId() + " | Name: " + getName() +
            " | Password: " + getPassword();
    }
}


