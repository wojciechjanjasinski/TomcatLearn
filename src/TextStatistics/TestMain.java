package TextStatistics;

public class TestMain {
    public static void main(String[] args) {
        String test ="madam madam madamaaa";
        TextStatistics.countWords(test);
        TextStatistics.countCharsWithoutSpaces(test);
        TextStatistics.countCharsWithSpaces(test);
        TextStatistics.printValuesOfTextStatistics(test);
        TextStatistics.palindromeTest(test);
    }
}
