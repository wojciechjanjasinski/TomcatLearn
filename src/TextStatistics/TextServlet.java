package TextStatistics;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String text = request.getParameter("tekst");
        response.setContentType("text/html; charset=iso-8859-2");
        response.setCharacterEncoding("iso-8859-2");
        java.io.PrintWriter printWriter = response.getWriter();
        printWriter.print(text);
        printWriter.print(TextStatistics.countCharsWithSpaces(text));
        printWriter.print(TextStatistics.countCharsWithoutSpaces(text));
        printWriter.print(TextStatistics.countWords(text));
        printWriter.print(TextStatistics.palindromeTest(text));
    }

}
