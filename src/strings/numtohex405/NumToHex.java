package strings.numtohex405;

public class NumToHex {

    public static void main(String[] args) {
       // System.out.println(toHex(26));
        System.out.println(6);
    }

    public static String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        String[] character = {"","","","","","","","","","","a","b","c", "d","e","f"};

        if(num>0)
        {
           while(num>0)
           {
               int rem = num%16;
               if(rem<10)
                    sb.append(rem);
               else sb.append(character[rem]);
               num/=16;
           }
        }
        return sb.reverse().toString();
    }
}
