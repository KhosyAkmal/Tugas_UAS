package com.example.tugas_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tugas_uts.R;

public class OutputHasil extends AppCompatActivity {

    private TextView textKategori;
    private TextView textNama;
    private TextView textHarga;
    private TextView textItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_hasil);
        textKategori = findViewById(R.id.hasil_kategori);
        textNama = findViewById(R.id.nama);
        textHarga = findViewById(R.id.items);
        textItems = findViewById(R.id.harga);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // TODO: display value here
            String Kategori = extras.getString(HasilActivity.KATEGORI_GROUP_KEY);
            String Nama = extras.getString(HasilActivity.NAMA_KEY);
            int Harga = extras.getInt(HasilActivity.HARGA_KEY);
            int Items = extras.getInt(HasilActivity.ITEMS_KEY);

            textKategori.setText(Kategori);
            textNama.setText(Nama);
            textHarga.setText(String.valueOf(Harga));
            textItems.setText(String.valueOf(Items));

        }
    }
}
