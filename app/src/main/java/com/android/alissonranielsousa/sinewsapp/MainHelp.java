package com.android.alissonranielsousa.sinewsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainHelp extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help);
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
                startActivity(new Intent(MainHelp.this, MainActivity.class));
                return true;
            case R.id.action_curso:
                startActivity(new Intent(MainHelp.this, MainSobreCurso.class));
                return true;
            case R.id.action_plan:
                startActivity(new Intent(MainHelp.this, MainPlanoCurso.class));
                return true;
            case R.id.action_teachers:
                startActivity(new Intent(MainHelp.this, MainProfessores.class));
                return true;
            case R.id.action_office:
                startActivity(new Intent(MainHelp.this, MainOffice.class));
                return true;
            case R.id.action_help:
                startActivity(new Intent(MainHelp.this, MainHelp.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onClick(View v) {
        Uri uri = null;
        Intent intent = null;

        switch (v.getId()) {
            case R.id.fab:
                intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:alisson77@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Assunto");
                intent.putExtra(Intent.EXTRA_TEXT, "Mensagem");
                startActivity(Intent.createChooser(intent, "Enviar email"));
                break;
            default:
                finish();
        }
    }
}