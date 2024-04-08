package DAY_50;
/*
# Leetcode 1700
*/

public class numOfStudents {

    public static int countStudents(int[] students, int[] sandwiches) {

        int countOfZero = 0;
        int countOfOne = 0;

        for(int i : students){
            if(i == 0)
            {
                countOfZero++;
            }
            else
            {
                countOfOne++;
            }
        }

        for(int i : sandwiches)
        {
            if((countOfZero == 0 && i == 0) || (countOfOne == 0 && i == 1))
            {
                break;
            }

            if(i == 0)
            {
                countOfZero--;
            }
            else
            {
                countOfOne--;
            }
        }

        return countOfZero+countOfOne;
    }
    

    public static void main(String[] args) {
        int students[]={1,1,0,1};
        int sandwiches[]={1,0,0,1};

        int ans=countStudents(students, sandwiches);
        System.out.println(ans);
    }
    
}
