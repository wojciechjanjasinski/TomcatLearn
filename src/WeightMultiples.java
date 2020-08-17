public class WeightMultiples {

    private final static double MULTIPLIER_FROM_KILOGRAM_TO_GRAM = 1000;
    private final static double MULTIPLIER_FROM_KILOGRAM_TO_MILLIGRAM = 1000000;
    private final static double MULTIPLIER_FROM_GRAM_TO_KILOGRAM = 0.001;
    private final static double MULTIPLIER_FROM_GRAM_TO_MILLIGRAM = 10000;
    private final static double MULTIPLIER_FROM_MILLIGRAM_TO_GRAM = 0.001;
    private final static double MULTIPLIER_FROM_MILLIGRAM_TO_KILOGRAM = 0.000001;

    public static double getMultiplierFromKilogramToGram() {
        return MULTIPLIER_FROM_KILOGRAM_TO_GRAM;
    }

    public static double getMultiplierFromKilogramToMilligram() {
        return MULTIPLIER_FROM_KILOGRAM_TO_MILLIGRAM;
    }

    public static double getMultiplierFromGramToKilogram() {
        return MULTIPLIER_FROM_GRAM_TO_KILOGRAM;
    }

    public static double getMultiplierFromGramToMilligram() {
        return MULTIPLIER_FROM_GRAM_TO_MILLIGRAM;
    }

    public static double getMultiplierFromMilligramToGram() {
        return MULTIPLIER_FROM_MILLIGRAM_TO_GRAM;
    }

    public static double getMultiplierFromMilligramToKilogram() {
        return MULTIPLIER_FROM_MILLIGRAM_TO_KILOGRAM;
    }
}
