package tpa.lab_1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.second_layout);

        ListView listView = new ListView(getApplicationContext());
        setContentView(listView);

        List<String> names = Arrays.asList("Pizza", "KFC", "Shaorma", "Ciorba deaia buna de la bunica", "Cartofi", "Bataie pe paine");
        List<String> descriptionm = Arrays.asList(
                "Mancare italiana de fite." ,
                "Mancare de pui cu fite",
                "Mancare de praduitor",
                "Only real kids eat this",
                "Lipsesc din iralanda ",
                "Only bad kids eat this"
        );
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                names);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(names.get(position));
                String  itemValue    = (String) descriptionm.get(position);

                Toast.makeText(getApplicationContext(),
                         itemValue, Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

























}
