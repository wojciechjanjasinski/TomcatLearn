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
        String metre = request.getParameter("metre");
        String centimetre = request.getParameter("cenimetre");
        String millimetre = request.getParameter("millimetre");
        String kilogram = request.getParameter("kilogram");
        String gram = request.getParameter("gram");
        String milligram = request.getParameter("milligram");

        double parsedMetre = Double.parseDouble(metre);
        double parsedCentimetre = Double.parseDouble(centimetre);
        double parsedMillimetre = Double.parseDouble(millimetre);
        double parsedKilogram = Double.parseDouble(kilogram);
        double parsedGram = Double.parseDouble(gram);
        double parsedMilligram = Double.parseDouble(milligram);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        java.io.PrintWriter printWriter = response.getWriter();
        DistanceConverter.fromMetreToCentimetreAndMillimetre(parsedMetre);
        DistanceConverter.fromCentimetreToMetreAndMillimetre(parsedCentimetre);
        DistanceConverter.fromMillimetreToCentimetreAndMetre(parsedMillimetre);

        WeightConverter.fromKilogramToGramAndMilligram(parsedKilogram);
        WeightConverter.fromGramToKilogramAndMilligram(parsedGram);
        WeightConverter.fromMilligramToGramAndKilogram(parsedMilligram);

        printWriter.print(DistanceConverter.fromMetreToCentimetreAndMillimetre(parsedMetre));
        printWriter.print(DistanceConverter.fromCentimetreToMetreAndMillimetre(parsedCentimetre));
        printWriter.print(DistanceConverter.fromMillimetreToCentimetreAndMetre(parsedMillimetre));

        printWriter.print(WeightConverter.fromKilogramToGramAndMilligram(parsedKilogram));
        printWriter.print(WeightConverter.fromGramToKilogramAndMilligram(parsedGram));
        printWriter.print(DistanceConverter.fromMillimetreToCentimetreAndMetre(parsedMillimetre));
    }
}
