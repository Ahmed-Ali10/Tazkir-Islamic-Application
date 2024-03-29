package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.main_green)));
//        sendMessage();

        Button btn1 =findViewById(R.id.btn1);
        Button btn2 =findViewById(R.id.btn2);
        Button btn3 =findViewById(R.id.btn3);
        Button btn4 =findViewById(R.id.btn4);
        Button btn5 =findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent intent1 = new
                Intent(NextActivity.this, sabah_zikr.class);
                startActivity(intent1);
                break;
            case R.id.btn2:
                Intent intent2 = new
                Intent(NextActivity.this,masaa_zikr.class);
                startActivity(intent2);
                break;
            case R.id.btn3:
                Intent intent3 = new
                Intent(NextActivity.this, sleep_zikr.class);
                startActivity(intent3);
                break;
            case R.id.btn4:
                Intent intent4 = new
                Intent(NextActivity.this, wakup_zikr.class);
                startActivity(intent4);
                break;
            case R.id.btn5:
                Intent intent5 = new
                Intent(NextActivity.this, afterSalat_zikr.class);
                startActivity(intent5);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mespaha:
                Intent intent6 = new
                        Intent(NextActivity.this, rosary.class);
                startActivity(intent6);
                return true;
            case R.id.rate:
                Rate();
                return true;
            case R.id.share:

                shareptn();
                return true;
            case R.id.website:
                Website();
                return true;
            case R.id.facebook:
                Facebook();
                return true;
            case R.id.about:
                Intent intent11 = new
                        Intent(NextActivity.this, about.class);
                startActivity(intent11);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void shareptn()
    {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent,"Send Via"));

    }
    public void Rate()
    {
        Uri rate = Uri.parse("https://www.play.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, rate);
        startActivity(webIntent);
    }
    public void Website()
    {
        Uri webpage = Uri.parse("https://www.linkedin.com/in/ahmed-ali-9706701a1/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void Facebook()
    {
        Uri faecbookpage = Uri.parse("https://web.facebook.com/profile.php?id=100015161014450");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, faecbookpage);
        startActivity(webIntent);
    }
}
