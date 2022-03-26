import java.io.*;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Character cs;
    Character cf;
    static Integer shift;
    static String line= "";
    static String line2= "";

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
        shift = cf - cs;
    }

    ROT13() {
        this('a', 'n');
    }


    public static String crypt(String text) throws UnsupportedOperationException {

        return encrypt(text);
    }

    public static String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'm'){
                c += shift;
            } else if (c >= 'A' && c <= 'M'){
                c += shift;
            }  else if (c >= 'n' && c <= 'z'){
                c -= shift;
            }  else if (c >= 'N' && c <= 'Z'){
                c -= shift;
            }

            sb.append(c);
        }

        return sb.toString();
    }

    public String decrypt(String text) {
      return  encrypt(text);
    }

    public static String rotate(String s, Character c) {
        int index = s.indexOf(c);
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(index, s.length()));
        sb.append(s.substring(0, index));
        System.out.println(sb);
        return String.valueOf(sb);
    }
    public static String readFile() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("/Users/mike/Projects/SimpleCrypt/sonnet18.txt"))){
            while(scanner.hasNext()){
                 line += scanner.nextLine() + "\n";
            }
    }  return line;
}


    public static String readFile2() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("/Users/mike/Projects/SimpleCrypt/sonnet18.enc"))){
            while(scanner.hasNext()){
                line2 += scanner.nextLine() + "\n";
            }
        }  return line2;
    }



public static void createFile(){
    try {
        File file = new File("/Users/mike/Projects/SimpleCrypt/sonnet18.enc");
    if(file.createNewFile()) {
        System.out.println("File Created");
    } else {
        System.out.println("File Exists");
    }
    } catch (IOException e) {
        e.printStackTrace();
    }
}



public static void writeToFile(String text) {
    createFile();
        try {
            FileWriter filewriter = new FileWriter("/Users/mike/Projects/SimpleCrypt/sonnet18.enc");

            filewriter.write(text);
            filewriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
}



public static void encode() throws FileNotFoundException {
        line= "";
        readFile();
       line2 = crypt(line);
        writeToFile(line2);


}
}
