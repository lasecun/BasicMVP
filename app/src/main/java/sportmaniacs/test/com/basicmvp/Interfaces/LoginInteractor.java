package sportmaniacs.test.com.basicmvp.Interfaces;

/**
 * Created by jmarti on 22/2/17.
 */

public interface LoginInteractor {

    void validarUsuario(String user, String password, OnLoginFinishListener listener);

}
