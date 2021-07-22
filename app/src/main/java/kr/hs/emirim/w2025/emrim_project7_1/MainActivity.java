package kr.hs.emirim.w2025.emrim_project7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Linear1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linear1 = findViewById(R.id.Linear1);
        btn1 = findViewById(R.id.btn1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_red:
                Linear1.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_yellow:
                Linear1.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_blue:
                Linear1.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.item_rotate:
                btn1.setRotation(45);
                return true;
            case R.id.item_zoom:
                btn1.setScaleX(2);
                return true;
        }
        return false;
    }
}