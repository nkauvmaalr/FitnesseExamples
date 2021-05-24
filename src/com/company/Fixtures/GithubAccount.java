package com.company.Fixtures;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class GithubAccount {
    private  String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public int getResponse() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        HttpResponse<String> response =  httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode();
//        System.out.println(response.statusCode());
//        System.out.println(response.headers());
//        System.out.println(response.body());

    }
}
