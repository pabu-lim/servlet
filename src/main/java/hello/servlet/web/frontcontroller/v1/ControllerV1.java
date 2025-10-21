package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {
    // 서블릿이랑 똑같은 모양의 인터페이스 만들었음(매개변수와 exception까지 똑같이)
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
