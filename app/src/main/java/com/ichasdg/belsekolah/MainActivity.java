
package com.ichasdg.belsekolah;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(245, 248, 255));

        TextView judul = new TextView(this);
        judul.setText("🔔 BelSekolah");
        judul.setTextSize(30);
        judul.setTextColor(Color.rgb(35, 70, 140));
        judul.setGravity(Gravity.CENTER);

        TextView keterangan = new TextView(this);
        keterangan.setText(
            "Bel sekolah otomatis\n\n" +
            "Atur jadwal masuk, pergantian pelajaran,\n" +
            "istirahat, dan pulang sekolah."
        );
        keterangan.setTextSize(18);
        keterangan.setTextColor(Color.DKGRAY);
        keterangan.setGravity(Gravity.CENTER);
        keterangan.setPadding(0, 24, 0, 24);

        layout.addView(judul);
        layout.addView(keterangan);
        setContentView(layout);
    }
}
