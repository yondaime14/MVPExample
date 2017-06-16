package com.carllewis14.mvpexample.Login;

/**
 * Presenter functionality for hte
 */

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();

}
