package arrays.singlenumber136;

import java.util.HashMap;

public class SingleNumber {

    public   int  singlenumber(int[] nums ) {

        int keyWithValue1=0;

        for(int num : nums)
            keyWithValue1^=num;

        return keyWithValue1;
    }
}
