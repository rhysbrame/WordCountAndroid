package example.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    only declare here the text view that is accesible and therefore has an id on activity_main.xml
    private EditText sentenceEditText;
    private Button countWords;
    private TextView returnCountNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText) findViewById(R.id.sentence_text);
        returnCountNumber = (TextView) findViewById(R.id.returnCount);

    }
//    do everything here, after the layout

    public void onButtonClicked(View button){
        String theSentence = sentenceEditText.getText().toString();
        int count = WordCounter.countWords(theSentence);
        String countAsString = String.valueOf(count);

        returnCountNumber.setText(countAsString + " words");

    }
}



