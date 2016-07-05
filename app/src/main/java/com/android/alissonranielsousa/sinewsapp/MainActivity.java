package com.android.alissonranielsousa.sinewsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        ImageButton img1 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton img2 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton img3 = (ImageButton) findViewById(R.id.imageButton6);

        TextView text1 = (TextView) findViewById(R.id.textView4);
        TextView text2 = (TextView) findViewById(R.id.textView6);
        TextView text3 = (TextView) findViewById(R.id.textView9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);

        // wbvDescription = (WebView)findViewById(R.id.wbvNews);
        // wbvDescription.loadUrl("file:///android_asset/Movie1Description.html");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_home:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                return true;
            case R.id.action_curso:
                startActivity(new Intent(MainActivity.this, MainSobreCurso.class));
                return true;
            case R.id.action_plan:
                startActivity(new Intent(MainActivity.this, MainPlanoCurso.class));
                return true;
            case R.id.action_teachers:
                startActivity(new Intent(MainActivity.this, MainProfessores.class));
                return true;
            case R.id.action_office:
                startActivity(new Intent(MainActivity.this, MainOffice.class));
                return true;
            case R.id.action_help:
                startActivity(new Intent(MainActivity.this, MainHelp.class));
                return true;
           default:
               return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onClick(View v) {
        Uri uri = null;
        Intent intent = null;
        TextView titulo = null;

        switch (v.getId()) {
            case R.id.fab:
                intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:alisson77@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Assunto");
                intent.putExtra(Intent.EXTRA_TEXT, "Mensagem");
                startActivity(Intent.createChooser(intent, "Enviar email"));
                break;
            case R.id.imageButton2: case R.id.textView4:
                intent = new Intent(this, MainNoticiaInterna.class);
                titulo = (TextView)findViewById(R.id.textView3);
                intent.putExtra("TITULO", titulo.getText());
                startActivity(intent);
                break;
            case R.id.imageButton3:case R.id.textView6:
                intent = new Intent(this, MainNoticiaInterna.class);
                titulo = (TextView)findViewById(R.id.textView5);
                intent.putExtra("TITULO", titulo.getText());
                startActivity(intent);
                break;
            case R.id.imageButton6:case R.id.textView9:
                intent = new Intent(this, MainNoticiaInterna.class);
                titulo = (TextView)findViewById(R.id.textView2);
                intent.putExtra("TITULO", titulo.getText());
                startActivity(intent);
                break;
        }

    }
}
