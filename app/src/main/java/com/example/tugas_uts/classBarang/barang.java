package com.example.tugas_uts.classBarang;

import android.os.Parcel;
import android.os.Parcelable;

public class barang implements Parcelable {

    private int items, harga;
    private String nama, nama_barang;

    public String getNamaBarang() { return nama_barang; }
    public int getItems() { return items; }
    public String getNama() {
        return nama;
    }
    public int getHarga() { return harga;  }


    public barang(String nama, int items, int harga, String nama_barang) {
        this.nama = nama;
        this.items = items;
        this.harga = harga;
        this.nama_barang = nama_barang;
    }

    protected barang(Parcel in) {
        nama = in.readString();
        nama_barang = in.readString();
        items = in.readInt();
        harga = in.readInt();
    }

    public static final Parcelable.Creator<barang> CREATOR = new Parcelable.Creator<barang>() {
        @Override
        public barang createFromParcel(Parcel in) {
            return new barang(in);
        }

        @Override
        public barang[] newArray(int size) {
            return new barang[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(nama_barang);
        parcel.writeInt(items);
        parcel.writeInt(harga);
    }
}
