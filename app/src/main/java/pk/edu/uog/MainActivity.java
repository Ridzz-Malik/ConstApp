package pk.edu.uog;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends BaseCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView banar1;
    private LinearLayout contact;
    private LinearLayout album;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Context context;
        banar1 = (ImageView)findViewById(R.id.banar1);
        contact = (LinearLayout)findViewById(R.id.contact);
        album = (LinearLayout)findViewById(R.id.album);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbarIcon();
        navigationDrawer();

        forCircleImage(banar1, R.drawable.white);
        //Bitmap bitmap = StringToBitMap(imgv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void serve(View v)
    {
        Intent i=new Intent();
        i.setClass(this,SignupActivity.class);
        startActivity(i);
    }

    public void goToMap(View view) {
        Intent int1 = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(int1);
    }
    private void forCircleImage(ImageView imageView, int image) {

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
                image);

        Bitmap circleBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);

        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(shader);
        paint.setAntiAlias(true);
        Canvas c = new Canvas(circleBitmap);
        c.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);

        imageView.setImageBitmap(circleBitmap);


        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, ListviewActivity.class);
                startActivity(it);
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
