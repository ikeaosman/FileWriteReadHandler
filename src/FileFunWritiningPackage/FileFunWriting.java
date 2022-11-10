package FileFunWritiningPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileFunWriting {
    public void run(){

    try {
        File myfile = new File("output.txt");
        if (myfile.createNewFile()) {
            System.out.println("File has been created:");
        } else {
            System.out.println("File overready exist");
        }

    } catch (IOException e ){
        System.out.println("Error");
        e.printStackTrace();
    }

    try{
        PrintStream ps = new PrintStream(new File("output.txt"));
        for (int i = 0; i < 5; i++) {
            ps.println("Number: " + (int)(Math.random()* 10000));
            ps.println("Hej");

        }
        ps.close(); //Close fungerer lidt om et 'break'
    } catch (IOException e){
        System.out.println("I/O exception" + "myfile");
    }




    }

    public static void main(String[] args) {
        new FileFunWriting().run();
    }
}


