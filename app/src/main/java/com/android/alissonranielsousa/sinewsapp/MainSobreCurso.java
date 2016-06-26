package com.android.alissonranielsousa.sinewsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class MainSobreCurso extends AppCompatActivity implements View.OnClickListener{

    private WebView wbvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sobre_curso);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        wbvDescription = (WebView)findViewById(R.id.wbvNews);
        wbvDescription.loadUrl("file:///android_asset/sobreCurso.html");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                Intent it = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:alisson77@gmail.com"));
                it.putExtra(Intent.EXTRA_SUBJECT, "Assunto");
                it.putExtra(Intent.EXTRA_TEXT, "Mensagem");
                startActivity(Intent.createChooser(it, "Enviar email"));
                break;
        }
    }
}
