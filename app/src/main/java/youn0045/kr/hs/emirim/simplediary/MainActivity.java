package youn0045.kr.hs.emirim.simplediary;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker date;
    EditText edit;
    Button but;
    String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = (DatePicker)findViewById(R.id.datepick);
        edit = (EditText) findViewById(R.id.edit);
        but = (Button) findViewById(R.id.but);

        Calendar cal= Calendar.getInstance(); //new연산자로 생성 못하면 메서드 안에 현재 객체 참조값을 반환하도록
        int year= cal.get(Calendar.YEAR);
        int month= cal.get(Calendar.MONTH);
        int day= cal.get(Calendar.DATE);

        date.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                fileName = year+"_"+(month+1)+"_"+day+".txt";
                String readData = readDiary(fileName);
                edit.setText(readData);
                but.setEnabled(true); //수정이나 새로 작성을 할 수 있다 활성화해서!
            }
        });
    }
    public String readDiary(String fileName){

        return null;
    }

}
