package com.example.tugas_uts.fragmen;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.tugas_uts.R;
import com.example.tugas_uts.classBarang.barang;

/**
 * A simple {@link Fragment} subclass.
 */
public class barang_daftar3 extends Fragment implements View.OnClickListener {


    View view;
    Button button;
    RadioGroup radioGroup;
    EditText textNama, textJumlah, textHarga, textNamaBarang;
    public barang_daftar3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_barang_daftar3, container, false);

        textNama = view.findViewById(R.id.fieldNama);
        textNamaBarang = view.findViewById(R.id.fieldNamaBarang);
        textJumlah = view.findViewById(R.id.fieldItems);
        textHarga = view.findViewById(R.id.fieldHarga);
        button = view.findViewById(R.id.buttonDaftarkan);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String nama = textNama.getText().toString();
        String namaBarang = textNamaBarang.getText().toString();
        int harga = Integer.parseInt(textHarga.getText().toString());
        int jumlah = Integer.parseInt(textJumlah.getText().toString());

        barang barang = new barang(nama, jumlah, harga, namaBarang);
        Bundle bundle = new Bundle();
        bundle.putParcelable("barang", barang);
        Fragment Result = new barang_hasil();
        Result.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getActivity()
                .getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, Result);
        fragmentTransaction.commit();
    }
}
