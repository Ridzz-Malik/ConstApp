package pk.edu.uog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CreateAccount extends BaseCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void goToLoginAgain(View view) {
            Intent intent = new Intent(CreateAccount.this, LoginActivity.class);
            startActivity(intent);
        }
    }

