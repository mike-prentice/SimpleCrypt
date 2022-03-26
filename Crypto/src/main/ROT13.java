import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Character cs;
    Character cf;
    static Integer shift;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
        shift = cf - cs;
    }

    ROT13() {
        this('a', 'n');
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return encrypt(text);
    }

    public String encrypt(String text) {
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
            System.out.println(sb);
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

}
