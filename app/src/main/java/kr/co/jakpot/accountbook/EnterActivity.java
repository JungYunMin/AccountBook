package kr.co.jakpot.accountbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        getGroupList();

        //그룹 리스트 받아오기
        m_btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Commdefine.GROUP_KEY == 0){
                    Commdefine.setShortToastMessage("그룹을 선택하세요.",getApplicationContext());
                }

            }
        });
    }



    private void getGroupList(){



    }
}
