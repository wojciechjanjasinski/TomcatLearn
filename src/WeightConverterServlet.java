import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/WeightConverterServlet")
public class WeightConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String kilogram = request.getParameter("kilogram");
        String gram = request.getParameter("gram");
        String milligram = request.getParameter("milligram");

        double parsedKilogram = Double.parseDouble(kilogram);
        double parsedGram = Double.parseDouble(gram);
        double parsedMilligram = Double.parseDouble(milligram);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        java.io.PrintWriter printWriter = response.getWriter();

        List<Double> fromKilogramToGramAndMilligram = WeightConverter.fromKilogramToGramAndMilligram(parsedKilogram);
        List<Double> fromGramToKilogramAndMilligram = WeightConverter.fromGramToKilogramAndMilligram(parsedGram);
        List<Double> fromMilligramToGramAndKilogram = WeightConverter.fromMilligramToGramAndKilogram(parsedMilligram);

        printWriter.print(fromKilogramToGramAndMilligram);
        printWriter.print(fromGramToKilogramAndMilligram);
        printWriter.print(fromMilligramToGramAndKilogram);
    }
}
