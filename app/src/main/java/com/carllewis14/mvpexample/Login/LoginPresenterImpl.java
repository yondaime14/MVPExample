package com.carllewis14.mvpexample.Login;

/**
 * MVP Presenter implementation class for Login Activity
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {

    private LoginView mLoginView;
    private LoginInteractor mLoginInteractor;


    public LoginPresenterImpl(LoginView mLoginView) {
        this.mLoginView = mLoginView;
        this.mLoginInteractor = new LoginInteractorImpl();
    }


    @Override public void validateCredentials(String username, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
        }

        mLoginInteractor.login(username, password, this);
    }

    @Override public void onDestroy() {
        mLoginView = null;
    }

    @Override public void onUsernameError() {
        if (mLoginView != null) {
            mLoginView.setUsernameError();
            mLoginView.hideProgress();
        }
    }

    @Override public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }
    }

    @Override public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.navigateToHome();
        }
    }

}