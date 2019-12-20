package com.example.tugas_uts.fragmen;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tugas_uts.R;
import com.example.tugas_uts.classBarang.barang;

/**
 * A simple {@link Fragment} subclass.
 */
public class barang_hasil extends Fragment {

    View view;
    barang Barang;
    TextView textNama, textJumlah, textTotal, textNamaBarang;


    public barang_hasil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_barang_hasil, container, false);
        textNama = view.findViewById(R.id.nama);
        textJumlah = view.findViewById(R.id.items);
        textTotal = view.findViewById(R.id.harga);
        textNamaBarang = view.findViewById(R.id.nama_barang);

        Bundle bundle = this.getArguments();

        Barang = bundle.getParcelable("barang");
        textNama.setText(Barang.getNama());
        textJumlah.setText(String.valueOf(Barang.getItems()));
        textTotal.setText(String.valueOf(Barang.getHarga()));
        textNamaBarang.setText(String.valueOf(Barang.getNamaBarang()));
        return view;

    }

}
