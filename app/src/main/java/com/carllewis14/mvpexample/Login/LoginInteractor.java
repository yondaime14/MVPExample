package com.carllewis14.mvpexample.Login;

/**
 * Interactor Class for user actions after username
 * Password are entered
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
