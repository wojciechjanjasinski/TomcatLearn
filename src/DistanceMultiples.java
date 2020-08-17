public class DistanceMultiples {
    private final static double MULTIPLIER_FROM_METRE_TO_CENTIMETRE = 100;
    private final static double MULTIPLIER_FROM_METRE_TO_MILLIMETRE = 1000;
    private final static double MULTIPLIER_FROM_CENTIMETRE_TO_METRE = 0.01;
    private final static double MULTIPLIER_FROM_CENTIMETRE_TO_MILLIMETRE = 10;
    private final static double MULTIPLIER_FROM_MILLIMETRE_TO_CENTIMETRE = 0.1;
    private final static double MULTIPLIER_FROM_MILLIMETRE_TO_METRE = 0.001;

    public static double getMultiplierFromMetreToCentimetre() {
        return MULTIPLIER_FROM_METRE_TO_CENTIMETRE;
    }

    public static double getMultiplierFromMetreToMillimetre() {
        return MULTIPLIER_FROM_METRE_TO_MILLIMETRE;
    }

    public static double getMultiplierFromCentimetreToMetre() {
        return MULTIPLIER_FROM_CENTIMETRE_TO_METRE;
    }

    public static double getMultiplierFromCentimetreToMillimetre() {
        return MULTIPLIER_FROM_CENTIMETRE_TO_MILLIMETRE;
    }

    public static double getMultiplierFromMillimetreToCentimetre() {
        return MULTIPLIER_FROM_MILLIMETRE_TO_CENTIMETRE;
    }

    public static double getMultiplierFromMillimetreToMetre() {
        return MULTIPLIER_FROM_MILLIMETRE_TO_METRE;
    }
}
