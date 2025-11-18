package strings.reversewordinstring151;
import java.util.Objects;

public class ReverseString {

    public String reverseString(String s){

        String[] wordsArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = wordsArray.length-1;i>=0;i--)
        {
            if(!Objects.equals(wordsArray[i], ""))
                sb.append(wordsArray[i]).append(" ");
        }
       return sb.toString().trim();
    }
}
