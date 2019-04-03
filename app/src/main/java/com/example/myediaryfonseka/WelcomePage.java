package com.example.myediaryfonseka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        configureNewEntryButton();
        configureNewPictureButton();
        configureNewPlaylistButton();
        configureNewNoteButton();
    }

    //goes to entry page
    private void configureNewEntryButton() {
        Button nextButton = (Button) findViewById(R.id.button3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this, EntryPage.class));
            }
        });
    }

    //goes to picture page
    private void configureNewPictureButton() {
        Button nextButton = (Button) findViewById(R.id.button4);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this, PicturesPage.class));
            }
        });
    }

    //goes to playlist page
    private void configureNewPlaylistButton() {
        Button nextButton = (Button) findViewById(R.id.button2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this, PlaylistPage.class));
            }
        });
    }

    //goes to note page
    private void configureNewNoteButton() {
        Button nextButton = (Button) findViewById(R.id.button5);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this, NotesPage.class));
            }
        });
    }
}
