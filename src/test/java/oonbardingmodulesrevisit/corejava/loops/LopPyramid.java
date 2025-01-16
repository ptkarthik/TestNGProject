package oonbardingmodulesrevisit.corejava.loops;

public class LopPyramid {
    /*
  Pyramid

Enter Number:
5
Enter X:
1

0
1	2
3	4	5
6	7	8	9
10	11	12	13	14
     */
    public static void main(String[] args) {

        int rowSize = 5, startNum = 0;

        for (int row = 1; row <= rowSize; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(startNum + " ");
                startNum++;
            }
            System.out.println(" ");
        }

    }
}
