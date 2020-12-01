package org.techtown.mirimlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items={"사이렌","사랑하라","펜트하우스","나 혼자산다","노는언니","개는 훌륭하다"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list1 = findViewById(R.id.list1);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice,items);
        list1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(listListener);

    }
    AdapterView.OnItemClickListener listListener=new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Toast.makeText(getApplicationContext(),items[position],Toast.LENGTH_SHORT).show();
        }
    };
}