package sportmaniacs.test.com.basicmvp.Interactors;

import android.os.Handler;

import sportmaniacs.test.com.basicmvp.Interfaces.LoginInteractor;
import sportmaniacs.test.com.basicmvp.Interfaces.OnLoginFinishListener;

/**
 * Created by jmarti on 22/2/17.
 */

public class LoginInteractorImpl implements LoginInteractor {


    @Override
    public void validarUsuario(final String user, final String password, final OnLoginFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!user.equals("") && !password.equals("")) {

                    listener.exitoOperacion();

                } else {
                    if (user.equals("")) {
                        listener.userNameError();
                    }
                    if (password.equals("")) {
                        listener.userPassError();
                    }
                }
            }
        }, 2000);
    }
}
