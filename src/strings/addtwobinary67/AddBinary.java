package strings.addtwobinary67;

public class AddBinary {

    public String addBinary(String a,String b){

        StringBuilder sb;
        int lenA = a.length();
        int lenB = b.length();
        int remNumber = Math.abs(lenB-lenA);
        if(lenA<lenB) {
            sb = new StringBuilder(a);
            for (int i = 0; i < remNumber; i++)
                sb.insert(0, '0');
            a=sb.toString();
        }
        else{
            sb = new StringBuilder(b);
            for (int i = 0; i < remNumber; i++)
                sb.insert(0, '0');
            b = sb.toString();
        }
        sb = new StringBuilder();
        int  carry = 0;
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        for(int i=lenA-1;i>=0;i--)
        {
            if(charA[i] == '1' && charB[i]=='1')
            {
                if(carry==0){
                    sb.append('0');
                    carry =1;
                }
                else{
                    sb.append('1');
                }
            }
            else if(charA[i] =='0' && charB[i] =='0')
            {
                if(carry ==0)
                    sb.append('0');
                else{
                    sb.append('1');
                    carry =0;
                }
            }
            else{
                if(carry ==0)
                {
                    sb.append('1');
                }
                else{
                    sb.append('0');
                }
            }
        }
        if(carry == 1)
            sb.append('1');
       return sb.reverse().toString();

    }
}
