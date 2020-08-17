package text_statistics;

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
        printWriter.println(text);
        printWriter.println("ilość znaków ze spacjami wynosi: " + TextStatistics.countCharsWithSpaces(text));
        printWriter.println("ilość znaków bez spacji wynosi: " + TextStatistics.countCharsWithoutSpaces(text));
        printWriter.println("ilość słów wynosi: " + TextStatistics.countWords(text));
        printWriter.println("Czy tekst jest palindromem? " +TextStatistics.palindromeTest(text));
    }

}
