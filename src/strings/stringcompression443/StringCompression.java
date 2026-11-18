package strings.stringcompression443;

public class StringCompression {

    public int compress(char[] chars) {

        int i =0,index = 0;

        while(index<chars.length)
        {
            int count = 0;
            char c = chars[index];

            while(index<chars.length && chars[index]== c)
            {
                count++;
                index++;
            }
            chars[i++] = c;
            if(count>1)
            {
                String countStr = String.valueOf(count);
                for(char d : countStr.toCharArray())
                    chars[i++] = d;
            }

        }
       return i;
    }
}
