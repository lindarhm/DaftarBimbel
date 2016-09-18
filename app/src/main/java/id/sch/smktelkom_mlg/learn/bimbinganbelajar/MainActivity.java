package id.sch.smktelkom_mlg.learn.bimbinganbelajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ntawal, ntnama, ntjenisKelamin, ntumur, ntasalsekolah, ntalamat, ntkodepos, ntagama, ntnotelp, ntemail, ntpaketbimbel;
    EditText senama, seumur, sesekolah, sealamat, sekodepos, setelp, seemail;
    RadioGroup JK;
    Spinner ag;
    Button bOd;
    CheckBox a, b, c, d, e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        senama = (EditText) findViewById(R.id.enama);
        JK = (RadioGroup) findViewById(R.id.rgjk);
        seumur = (EditText) findViewById(R.id.eumur);
        sesekolah = (EditText) findViewById(R.id.easalsekolah);
        sealamat = (EditText) findViewById(R.id.ealamat);
        sekodepos = (EditText) findViewById(R.id.ekodepos);
        ag = (Spinner) findViewById(R.id.spinnerag);
        setelp = (EditText) findViewById(R.id.enotelp);
        seemail = (EditText) findViewById(R.id.eemail);
        bOd = (Button) findViewById(R.id.buttonDaftar);
        a = (CheckBox) findViewById(R.id.checkBoxA3);
        b = (CheckBox) findViewById(R.id.checkBoxA2);
        c = (CheckBox) findViewById(R.id.checkBoxO);
        d = (CheckBox) findViewById(R.id.checkBoxOA);
        e = (CheckBox) findViewById(R.id.checkBoxP);

        ntawal = (TextView) findViewById(R.id.awal);
        ntnama = (TextView) findViewById(R.id.nama);
        ntjenisKelamin = (TextView) findViewById(R.id.jeniskelamin);
        ntumur = (TextView) findViewById(R.id.umur);
        ntasalsekolah = (TextView) findViewById(R.id.asalsekolah);
        ntalamat = (TextView) findViewById(R.id.alamat);
        ntkodepos = (TextView) findViewById(R.id.kodepos2);
        ntagama = (TextView) findViewById(R.id.agama);
        ntnotelp = (TextView) findViewById(R.id.notelp);
        ntemail = (TextView) findViewById(R.id.email);
        ntpaketbimbel = (TextView) findViewById(R.id.paket);

        bOd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();

            }
        });

    }

    private void doProcess() {
        String nama = senama.getText().toString();
        String aalamat = sealamat.getText().toString();
        String assek = sesekolah.getText().toString();
        String eeemail = seemail.getText().toString();
        int uumurr = Integer.parseInt(seumur.getText().toString());
        int kodeposss = Integer.parseInt(sekodepos.getText().toString());
        int nootelpp = Integer.parseInt(setelp.getText().toString());

        ntawal.setText("Selamat anda sudah terdaftar...!!!");
        ntnama.setText("Nama : " + nama);
        ntalamat.setText("Alamat : " + aalamat);
        ntasalsekolah.setText("Asal sekolah : " + assek);
        ntemail.setText("E-mail : " + eeemail);

        String hasil = null;
        if (JK.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(JK.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }
        if (hasil == null) {
            ntjenisKelamin.setText("Anda belum memilih jenis kelamin");
        } else {
            ntjenisKelamin.setText("Jenis kelamin : " + hasil);
        }

        String hasil2 = "Paket yang anda pilih : \n";
        if (a.isChecked()) hasil2 += a.getText() + "\n";
        if (b.isChecked()) hasil2 += b.getText() + "\n";
        if (c.isChecked()) hasil2 += c.getText() + "\n";
        if (d.isChecked()) hasil2 += d.getText() + "\n";
        if (e.isChecked()) hasil2 += e.getText() + "\n";

        ntpaketbimbel.setText(hasil2);
        ntagama.setText("Agama : " + ag.getSelectedItem().toString());

        ntumur.setText("Umur : " + uumurr + " tahun");
        ntkodepos.setText("Kode pos : " + kodeposss);
        ntnotelp.setText("No Telphon : " + nootelpp);
    }
}
