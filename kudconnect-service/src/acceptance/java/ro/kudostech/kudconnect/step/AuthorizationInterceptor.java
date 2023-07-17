package ro.kudostech.kudconnect.step;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.*;

import java.io.IOException;
public class AuthorizationInterceptor implements ClientHttpRequestInterceptor {

    private String bearerToken;

    public AuthorizationInterceptor(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add("Authorization", "Bearer " + bearerToken);
        return execution.execute(request, body);
    }
}