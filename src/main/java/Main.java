import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try (ServletOutputStream out = resp.getOutputStream()) {
      out.write("Hello from Cloud Native Buildpacks!".getBytes());
      out.flush();
    }
  }
}
