package com.hjs.ex_1120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //액티비티에 메뉴 추가
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    //어떤 메뉴 item을 클릭했는지 감지

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(MainActivity.this,"추가 누름",Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit:
                Toast.makeText(MainActivity.this,"수정 누름",Toast.LENGTH_SHORT).show();
                break;
            case R.id.finish:
                finish(); // 현재 액티비티를 종료하는 메소드
                break;

        }
        return true;
    }
}
