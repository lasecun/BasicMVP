package sportmaniacs.test.com.basicmvp.Presenters;

import sportmaniacs.test.com.basicmvp.Interactors.LoginInteractorImpl;
import sportmaniacs.test.com.basicmvp.Interfaces.LoginInteractor;
import sportmaniacs.test.com.basicmvp.Interfaces.LoginPresenter;
import sportmaniacs.test.com.basicmvp.Interfaces.LoginView;
import sportmaniacs.test.com.basicmvp.Interfaces.OnLoginFinishListener;

/**
 * Created by jmarti on 22/2/17.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishListener {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl();
    }

    @Override
    public void validarUsuario(String user, String pass) {

        if (view != null) {
            view.showProgress();
        }

        interactor.validarUsuario(user, pass, this);

    }

    @Override
    public void userNameError() {
        if (view != null) {
            view.setErrorUser();
            view.hideProgress();
        }
    }

    @Override
    public void userPassError() {
        if (view != null) {
            view.setErrorPassword();
            view.hideProgress();
        }
    }

    @Override
    public void exitoOperacion() {
        if (view != null) {
            view.navigateToHome();
            view.hideProgress();
        }
    }
}
