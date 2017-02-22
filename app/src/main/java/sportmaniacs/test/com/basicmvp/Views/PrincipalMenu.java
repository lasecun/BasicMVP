package sportmaniacs.test.com.basicmvp.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import sportmaniacs.test.com.basicmvp.R;

/**
 * Created by jmarti on 22/2/17.
 */
public class PrincipalMenu extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
}
