package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    int result;
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        result = first > second ? 10 : -10;
        System.out.println(result);
    }
}
