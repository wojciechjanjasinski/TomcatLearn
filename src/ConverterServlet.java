import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String numberFromUser = request.getParameter("numberFromUser");
        PrintWriter writer = response.getWriter();
        writer.println();
        double parsedNumber;
        try {
            parsedNumber = Double.parseDouble(numberFromUser);
        }catch (NumberFormatException exception){
            System.err.println("Wprowadziłeś niepoprawną liczbę");
        }
        String converterChoice = null;

        final String ONE = "one"; //z metrów na centymetry i z metrów na milimetry
        final String TWO = "two"; //z centymetrów na metry i z centymetrów na milimetry
        final String THREE = "three"; //z milimetrów na centymetry i z milimetrów na metry
        final String FOUR = "four"; //z kilogramów na gramy i z kilogramów na miligramy
        final String FIVE = "five"; //z gramów na kilogramy i z gramów na miligramy
        final String SIX = "six"; //z miligramów na gramy i z miligramów na kilogramy
        final String pause = " ";
        final String theMessageToUser = "Szanowny użytkowniku! Niestety podałeś nieprawidłowe dane i nie mogę przeprowadzić konwersji";
        String userChoice = switch (converterChoice) {
            case ONE -> DistanceConverter.fromMetreToCentimetreConverter(parsedNumber) + pause + DistanceConverter.fromMetreToMillimetre(parsedNumber);
            case TWO -> DistanceConverter.fromCentimetreToMetre(parsedNumber) + pause + DistanceConverter.fromCentimetreToMillimetre(parsedNumber);
            case THREE -> DistanceConverter.fromMillimetreToCentimetre(parsedNumber) + pause + DistanceConverter.fromMillimetreToMetre(parsedNumber);
            case FOUR -> WeightConverter.fromKilogramToGram(parsedNumber) + pause + WeightConverter.fromKilogramToMilligram(parsedNumber);
            case FIVE -> WeightConverter.fromGramToKilogram(parsedNumber) + pause + WeightConverter.fromGramToMilligram(parsedNumber);
            case SIX -> WeightConverter.fromMilligramToGram(parsedNumber) + pause + WeightConverter.fromMilligramToKilogram(parsedNumber);
            default -> theMessageToUser;
        };
    }
}
