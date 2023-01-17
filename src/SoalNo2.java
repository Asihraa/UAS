public class SoalNo2 {
    public static int[] countPositivesSumNegatives(int[] input) {
        //Your code here...
        return null;
    }

    public static void main(String[] args, SoalNo2 countPositivesSumNegatives) {
        //Output { }
        System.out.println(new int[] {Integer.parseInt(null)});
        
        //Output { }
        System.out.println(new int[] {});
        
        //OUTPUT {10,-65}
        System.out.println(countPositivesSumNegatives.countPositivesSumNegatives(
                new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
        //OUTPUT {8,-50}
        System.out.println(countPositivesSumNegatives.countPositivesSumNegatives(
                new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[] {};
        }
        int positivesCount = 0;
        int negativesSum = 0;
        for (int number : input) {
            if (number > 0) {
                positivesCount++;
            } else if (number < 0) {
                negativesSum += number;
            }
        }
    }
    return new int[] {positivesCount, negativesSum};
}