package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith)
            System.out.print("iterating till the end");
        else {
            for (int i = 0; i < numberToGoUntil; i++) {
                if (i == 0) continue;
                if (i > toBreakWith)
                    break;
                System.out.println(i);
            }
        }

    }
}
