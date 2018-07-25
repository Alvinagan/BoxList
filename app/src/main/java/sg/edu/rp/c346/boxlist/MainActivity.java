package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewBox);

        alBoxList = new ArrayList<>();
        Box item1 = new Box("blue");
        alBoxList.add(item1);
        Box item2 = new Box("orange");
        alBoxList.add(item2);
        Box item3 = new Box("brown");
        alBoxList.add(item3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBoxList);

        lvToDo.setAdapter(caBox);
    }
}
