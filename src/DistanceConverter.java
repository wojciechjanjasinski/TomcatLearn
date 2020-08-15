import java.util.List;

public class DistanceConverter {

    //konwersja numer 1
    public static double fromMetreToCentimetre(double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMetreToCentimetre();
    }
    //konwersja numer 2
    public static double fromMetreToMillimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMetreToMillimetre();
    }
    public static List<Double> fromMetreToCentimetreAndMillimetre (double fromUserInput){
        return List.of(fromMetreToCentimetre(fromUserInput), fromMetreToMillimetre(fromUserInput));
    }
    //konwersja numer 3
    public static double fromCentimetreToMetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromCentimetreToMetre();
    }
    //konwersja numer 4
    public static double fromCentimetreToMillimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromCentimetreToMillimetre();
    }
    public static List<Double> fromCentimetreToMetreAndMillimetre (double fromUserInput){
        return List.of(fromCentimetreToMetre(fromUserInput), fromCentimetreToMillimetre(fromUserInput));
    }
    //konwersja numer 5
    public static double fromMillimetreToCentimetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMillimetreToCentimetre();
    }
    //konwersja numer 6
    public static double fromMillimetreToMetre (double fromUserInput){
        return fromUserInput* DistanceMultiples.getMultiplierFromMillimetreToMetre();
    }
    public static List<Double> fromMillimetreToCentimetreAndMetre (double fromUserInput){
        return List.of(fromMillimetreToCentimetre(fromUserInput), fromMillimetreToMetre(fromUserInput));
    }
}
