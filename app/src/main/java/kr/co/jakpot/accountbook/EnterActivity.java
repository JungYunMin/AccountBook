package kr.co.jakpot.accountbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;

public class EnterActivity extends AppCompatActivity {
    private Spinner m_spinnerGroup = null;
    private Button m_btnEnter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

        m_spinnerGroup = (Spinner) findViewById(R.id.spinnerGroup);
        m_btnEnter = (Button) findViewById(R.id.buttonEnter);

    }
}
