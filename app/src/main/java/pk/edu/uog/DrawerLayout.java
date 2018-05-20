package pk.edu.uog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ToggleButton;

public class DrawerLayout extends BaseCompatActivity {
 private DrawerLayout myDrawerLayout;
 private ToggleButton myToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

    }
}
