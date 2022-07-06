package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumSkip = 0;
        int sum = 0;
        if (numberToSkip>lastInRow)
            System.out.println("number to skip is bugger then the last");
        else
        if (lastInRow>=0) {
            for (int i = 1; i <= lastInRow; i++) {
                sum += i;
                if (i == numberToSkip) {
                    sumSkip = sum;
                    sum = 0;
                }
            }
            System.out.println("skipped sum is " + sumSkip + "\ncounted sum is " + sum);
        } else
            System.out.println("last number in row is negative");

    }
}
