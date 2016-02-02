package ct.librarytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ct.cttextview.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        View v = new MyView(this);
        setContentView(v);
    }
}
