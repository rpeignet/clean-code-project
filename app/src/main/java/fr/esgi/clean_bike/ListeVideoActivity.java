package fr.esgi.clean_bike;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListeVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_video);

        Button btnHistorique = findViewById(R.id.btn_historique);
        btnHistorique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeVideoActivity.this, HistoriqueActivity.class);
                startActivity(intent);
            }
        });

        Button btnDeconnexion = findViewById(R.id.btn_deconnexion);
        btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeVideoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Ajouter la logique pour afficher la liste de vidéos
    }
}
