package com.example.lab2jurele;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Spinner smbList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.smbList = findViewById(R.id.smbList);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.select_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.smbList.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edInput = findViewById(R.id.enTxt);
        TextView tvResult = findViewById(R.id.calcResult);
        String userInputText = edInput.getText().toString();


        String selection = this.smbList.getSelectedItem().toString();
        int resId = R.string.char_selection;


        String charSelectionOption = getResources().getString(R.string.char_selection);
        String numberSelectionOption = getResources().getString(R.string.numbers_selection);
        String wordSelectionOption = getResources().getString(R.string.words_selection);

        if(edInput.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Field is empty, please enter any phrase", Toast.LENGTH_SHORT).show();
        }

        if(selection.equalsIgnoreCase(charSelectionOption)){
            int count = calculator_jurele.getCharsCount(userInputText);
            tvResult.setText(String.valueOf(count));
        }

        if(selection.equalsIgnoreCase(numberSelectionOption)){
            int count = calculator_jurele.getNumbersCount(userInputText);
            tvResult.setText(String.valueOf(count));
        }
        if(selection.equalsIgnoreCase(wordSelectionOption)){
            int count = calculator_jurele.getWordsCount(userInputText);
            tvResult.setText(String.valueOf(count));
        }
    }
}