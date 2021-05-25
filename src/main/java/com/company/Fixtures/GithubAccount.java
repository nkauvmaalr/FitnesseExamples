package com.company.Fixtures;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class GithubAccount {
    private  String url;
    private HttpResponse<String> response;

    public void setUrl(String url) throws IOException, InterruptedException {
        this.url = url;
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        response =  httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public int getResponse() {
        return response.statusCode();

    }
    public String getResponseBody()  {
        return response.body();
    }
}
