package com.company;

import com.company.Fixtures.GithubAccount;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        GithubAccount githubAccount = new GithubAccount();
        githubAccount.setUrl("https://api.github.com/users/NAVAL-KUMAR");
        System.out.println(githubAccount.getResponse());
        System.out.println(githubAccount.getResponseBody());
    }
}
