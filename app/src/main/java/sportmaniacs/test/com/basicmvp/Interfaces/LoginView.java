package sportmaniacs.test.com.basicmvp.Interfaces;

/**
 * Created by jmarti on 22/2/17.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setErrorUser();

    void setErrorPassword();

    void navigateToHome();

}
