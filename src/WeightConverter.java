public class WeightConverter {

    //konwersja numer 7
    public static double fromKilogramToGram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromKilogramToGram();
    }
    //konwersja numer 8
    public static double fromKilogramToMilligram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromKilogramToMilligram();
    }
    //konwersja numer 9
    public static double fromGramToKilogram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromGramToKilogram();
    }
    //konwersja numer 10
    public static double fromGramToMilligram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromGramToMilligram();
    }
    //konwersja numer 11
    public static double fromMilligramToGram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromMilligramToGram();
    }
    //konwersja numer 12
    public static double fromMilligramToKilogram (double fromUserInput){
        return fromUserInput*WeightMultiples.getMultiplierFromMilligramToKilogram();
    }
}
