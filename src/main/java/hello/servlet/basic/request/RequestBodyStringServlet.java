package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "RequestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletInputStream inputStream = request.getInputStream(); // 메시지 바디의 내용을 byte 코드로 얻을 수 있음.
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);// byte를 문자로 변환하기 위해 스프링 프레임워크의 StreamUtils 사용.
// + byte를 String으로 꺼낼 때는 반드시 encoding정보가 무엇인지 알려주어야 한다.(반대도 동일)
        System.out.println("messageBody = " + messageBody);

        response.getWriter().write("ok");

    }
}
