package org.example.conroller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {

    @GetMapping
    public void hello(HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        final var gson = new Gson();
        response.getWriter().println(gson.toJson("Hello world!"));
    }
}
