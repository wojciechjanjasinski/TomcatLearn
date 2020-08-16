import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String metre = request.getParameter("metre");
        String centimetre = request.getParameter("centimetre");
        String millimetre = request.getParameter("millimetre");

        double parsedMetre = Double.parseDouble(metre);
        double parsedCentimetre = Double.parseDouble(centimetre);
        double parsedMillimetre = Double.parseDouble(millimetre);


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        java.io.PrintWriter printWriter = response.getWriter();
        List<Double> fromMetreToCentimetreAndMillimetre = DistanceConverter.fromMetreToCentimetreAndMillimetre(parsedMetre);
        List<Double> fromCentimetreToMetreAndMillimetre = DistanceConverter.fromCentimetreToMetreAndMillimetre(parsedCentimetre);
        List<Double> fromMillimetreToCentimetreAndMetre = DistanceConverter.fromMillimetreToCentimetreAndMetre(parsedMillimetre);


        printWriter.print(fromMetreToCentimetreAndMillimetre);
        printWriter.print(fromCentimetreToMetreAndMillimetre);
        printWriter.print(fromMillimetreToCentimetreAndMetre);
    }
}
