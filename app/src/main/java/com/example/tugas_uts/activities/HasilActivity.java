package com.example.tugas_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.tugas_uts.R;

public class HasilActivity extends AppCompatActivity {


    public static final String KATEGORI_GROUP_KEY = "kategori";
    public static final String NAMA_KEY = "nama";
    public static final String HARGA_KEY = "harga";
    public static final String ITEMS_KEY = "items";

    private RadioGroup radioKategori;
    private EditText fieldNama;
    private EditText fieldHarga;
    private EditText fieldItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        radioKategori = findViewById(R.id.radioKategori);
        fieldNama = findViewById(R.id.fieldNamaBarang);
        fieldHarga = findViewById(R.id.fieldHarga);
        fieldItems = findViewById(R.id.fieldItems);
    }

    public void handlerClikDaftarkan(View view) {
//        Intent intent = new Intent(this, OutputHasil.class);
//        startActivity(intent);
        String tipe = "";
        int checkId = radioKategori.getCheckedRadioButtonId();
        if ((checkId != -1)) {
            if (checkId == R.id.radio_baju) {
                tipe = "Baju";
            } else if (checkId == R.id.radio_celana) {
                tipe = "Celana";
            } else {
                tipe = "Jaket";
            }
        }

        String nama = fieldNama.getText().toString();
        int harga = Integer.parseInt(fieldHarga.getText().toString());
        int items = Integer.parseInt(fieldItems.getText().toString());

        Intent intent = new Intent(this, OutputHasil.class);
        intent.putExtra(KATEGORI_GROUP_KEY, tipe);
        intent.putExtra(NAMA_KEY, nama);
        intent.putExtra(HARGA_KEY, harga);
        intent.putExtra(ITEMS_KEY, items);

        startActivity(intent);
    }
}
