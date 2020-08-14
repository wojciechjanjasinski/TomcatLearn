public class DistanceConverter {

    //konwersja numer 1
    public static double fromMetreToCentimetreConverter (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMetreToCentimetre();
    }
    //konwersja numer 2
    public static double fromMetreToMillimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMetreToMillimetre();
    }
    //konwersja numer 3
    public static double fromCentimetreToMetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromCentimetreToMetre();
    }
    //konwersja numer 4
    public static double fromCentimetreToMillimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromCentimetreToMillimetre();
    }
    //konwersja numer 5
    public static double fromMillimetreToCentimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMillimetreToCentimetre();
    }
    //konwersja numer 6
    public static double fromMillimetreToMetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMillimetreToMetre();
    }
}
