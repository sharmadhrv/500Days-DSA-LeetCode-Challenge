package greedy.lemonadechange860;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int countOfFive = 0,countOfTen = 0;

        for(int bill : bills)
        {
            if(bill == 5)
                countOfFive +=1;

            else if(bill == 10)
            {
                if(countOfFive!=0)
                {
                    countOfFive-=1;
                    countOfTen +=1;
                }

                else return false;
            }
            else {
                if(countOfFive != 0 && countOfTen !=0)
                {
                    countOfFive -=1;
                    countOfTen-=1;
                }

                else if(countOfFive>=3)
                    countOfFive -=3;

                else  return false;
            }
        }
        return true;
    }
}
