package com.carllewis14.mvpexample.Login;

/**
 * MVP View Interface for Login Activity
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
