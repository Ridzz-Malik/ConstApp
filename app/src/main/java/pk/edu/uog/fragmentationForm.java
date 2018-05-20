package pk.edu.uog;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RIDA on 5/16/2018.
 */

public class fragmentationForm extends Fragment {


    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.activity_fragmentation_form, container,false);
        return myView;
    }
}
