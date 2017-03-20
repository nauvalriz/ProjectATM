package id.sch.smktelkom_mlg.appberatbadan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button cek, clear, exit;
    EditText nama, tinggi, berat, hslideal, hasilket1, hasilket2;
    RadioButton laki, perempuan;
    RadioGroup kelamin;
    int ti, bt, h1;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cek = (Button) findViewById(R.id.cek);
        clear = (Button) findViewById(R.id.clear);
        exit = (Button) findViewById(R.id.exit);
        nama = (EditText) findViewById(R.id.nama);
        tinggi = (EditText) findViewById(R.id.tinggi);
        berat = (EditText) findViewById(R.id.berat);
        hslideal= (EditText) findViewById(R.id.hslideal);
        hasilket1 = (EditText) findViewById(R.id.hasilket1);
        hasilket2 = (EditText) findViewById(R.id.hasilket2);
        laki = (RadioButton) findViewById(R.id.laki);
        perempuan = (RadioButton) findViewById(R.id.perempuan);
        kelamin = (RadioGroup) findViewById(R.id.kelamin);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){proses();}

            private void proses() {

                int ti = Integer.parseInt(String.valueOf(tinggi.getText()));
                int bt = Integer.parseInt(String.valueOf(berat.getText()));

                if (laki.isChecked()){
                    h1 = (ti-100);
                }else if (perempuan.isChecked()){
                    h1 = (ti-104);
                }
                temp = Integer.toString(h1);

                if(h1<bt){
                    hslideal.setText("Berat badan ideal anda" + temp);
                    hasilket1.setText("maaf" + nama.getText() + ", Sepertinya anda overweight");
                }
            }

            {

            }
        });
    }
}
