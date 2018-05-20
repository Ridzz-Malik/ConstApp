package pk.edu.uog;

import android.os.Bundle;

/**
 * Created by RIDA on 5/20/2018.
 */

public class Activist extends BaseCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        navigationDrawer();
    }

}
