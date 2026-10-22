
package com.ichasdg.belsekolah;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(245, 248, 255));

        TextView judul = new TextView(this);
        judul.setText("🔔 BelSekolah");
        judul.setTextSize(30);
        judul.setTextColor(Color.rgb(35, 70, 140));
        judul.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("Bel Sekolah Otomatis\n\nPilih menu di bawah ini");
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);
        status.setTextColor(Color.DKGRAY);

        layout.addView(judul);
        layout.addView(status);

        tambahTombol("⏰ Pengaturan Jadwal", "Fitur pengaturan jadwal akan dibuat berikutnya.");
        tambahTombol("📅 Jadwal Sekolah", "Jadwal Senin sampai Sabtu akan dibuat berikutnya.");
        tambahTombol("🔊 Suara Bel", "Pilihan suara bel akan dibuat berikutnya.");
        tambahTombol("ℹ️ Tentang Aplikasi", "BelSekolah - aplikasi bel sekolah otomatis.");

        setContentView(layout);
    }

    private void tambahTombol(String nama, String pesan) {
        Button tombol = new Button(this);
        tombol.setText(nama);
        tombol.setTextSize(16);
        tombol.setAllCaps(false);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            );

        params.setMargins(0, 12, 0, 0);
        layout.addView(tombol, params);

        tombol.setOnClickListener(v ->
            new android.app.AlertDialog.Builder(this)
                .setTitle(nama)
                .setMessage(pesan)
                .setPositiveButton("OK", null)
                .show()
        );
    }
}
