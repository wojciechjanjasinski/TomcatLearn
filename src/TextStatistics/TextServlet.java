package TextStatistics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String text = request.getParameter("tekst");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        java.io.PrintWriter printWriter = response.getWriter();
        printWriter.print(text);

        Path fileName = Path.of("text.txt");
        Files.writeString(fileName, text);

        String actual = Files.readString(fileName);
        System.out.println(actual);

    }

}
