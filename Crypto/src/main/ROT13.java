import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Character cs;
    Character cf;
    Integer shift;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
        this.shift = cs - cf;
    }

    ROT13() {
        this('a', 'n');
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'm'){
                c += 13;
            } else if (c >= 'A' && c <= 'M'){
                c += 13;
            }  else if (c >= 'n' && c <= 'z'){
                c -= 13;
            }  else if (c >= 'N' && c <= 'Z'){
                c -= 13;
            }
            sb.append(c);
        }

        return text;
    }

    public String decrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'm'){
                c += 13;
            } else if (c >= 'A' && c <= 'M'){
                c += 13;
            }  else if (c >= 'n' && c <= 'z'){
                c -= 13;
            }  else if (c >= 'N' && c <= 'Z'){
                c -= 13;
            }
            sb.append(c);
        }
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
