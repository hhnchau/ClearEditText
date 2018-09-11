package phuthotech.vn.drawableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String arr[] = {"ha nội", "Huế", "Sài gòn",
                "hà giang", "Hội an", "Kiên giang",
                "Lâm đồng", "Long khánh"};

        MyAutoCompleteTextView autoCompleteTextView = findViewById(R.id.auto);
        autoCompleteTextView.setAdapter(
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr));

    }
}
