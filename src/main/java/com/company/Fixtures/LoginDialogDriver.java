package com.company.Fixtures;

public class LoginDialogDriver {
    private String userName;
    private String password;
    private String message;
    private int loginAttempts;
    private String confirmPassword;

    public LoginDialogDriver(String userName, String password, String confirmPassword) {
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean loginWithUsernameAndPassword(String userName, String password, String confirmPassword) {
        loginAttempts++;
        boolean result = this.userName.equals(userName) && this.password.equals(password) && this.password.equals(confirmPassword);
        if (result)
            message = String.format("%s logged in.", this.userName);
        else
            message = String.format("%s not logged in.", this.userName);
        return result;
    }

    public String loginMessage() {
        return message;
    }

    public String loginMessageAndLoginAttempts(String addMessage,Integer no) {
        return message+" "+loginAttempts+" "+addMessage+" "+no;
    }

    public int numberOfLoginAttempts() {
        return loginAttempts;
    }
}