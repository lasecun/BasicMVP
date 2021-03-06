package sportmaniacs.test.com.basicmvp.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import sportmaniacs.test.com.basicmvp.Interfaces.LoginPresenter;
import sportmaniacs.test.com.basicmvp.Interfaces.LoginView;
import sportmaniacs.test.com.basicmvp.Presenters.LoginPresenterImpl;
import sportmaniacs.test.com.basicmvp.R;

public class Login extends AppCompatActivity implements LoginView {

    private EditText user, pass;
    private ProgressBar progressBar;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setErrorUser() {
        user.setError("Campo Obligatorio");
    }

    @Override
    public void setErrorPassword() {
        pass.setError("Campo Obligatorio");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(Login.this, PrincipalMenu.class));
    }

    public void validacion(View view){
        presenter.validarUsuario(user.getText().toString(), pass.getText().toString());
    }
}
