package animation.john.com.videoplaydemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText et = (EditText) findViewById(R.id.edit_text_url);

        findViewById(R.id.ijk_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = et.getText().toString();
                if (!TextUtils.isEmpty(url)){
                    IjkPlayerDemoActivity.start(MainActivity.this, Uri.parse(url));
                } else {
                    Toast.makeText(MainActivity.this, "empty url!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
