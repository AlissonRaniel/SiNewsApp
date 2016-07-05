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

public class MainOffice extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_office);
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

		TextView text10 = (TextView) findViewById(R.id.textView10);
        TextView text9 = (TextView) findViewById(R.id.textView9);
        TextView text11 = (TextView) findViewById(R.id.textView11);
        TextView text12 = (TextView) findViewById(R.id.textView12);
        TextView text13 = (TextView) findViewById(R.id.textView13);
        TextView text14 = (TextView) findViewById(R.id.textView14);

        text10.setOnClickListener(this);
        text9.setOnClickListener(this);
        text11.setOnClickListener(this);
        text12.setOnClickListener(this);
        text13.setOnClickListener(this);
        text14.setOnClickListener(this);
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
                startActivity(new Intent(MainOffice.this, MainActivity.class));
                return true;
            case R.id.action_curso:
                startActivity(new Intent(MainOffice.this, MainSobreCurso.class));
                return true;
            case R.id.action_plan:
                startActivity(new Intent(MainOffice.this, MainPlanoCurso.class));
                return true;
            case R.id.action_teachers:
                startActivity(new Intent(MainOffice.this, MainProfessores.class));
                return true;
            case R.id.action_office:
                startActivity(new Intent(MainOffice.this, MainOffice.class));
                return true;
            case R.id.action_help:
                startActivity(new Intent(MainOffice.this, MainHelp.class));
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
            case R.id.textView10: case R.id.textView9:
                intent = new Intent(this, MainNoticiaInterna.class);
                startActivity(intent);
                break;
            case R.id.textView11:case R.id.textView12:
                intent = new Intent(this, MainNoticiaInterna.class);
                startActivity(intent);
                break;
            case R.id.textView13:case R.id.textView14:
                intent = new Intent(this, MainNoticiaInterna.class);
                startActivity(intent);
                break;
        }

    }
}
