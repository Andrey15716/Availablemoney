package com.example.android.availablemoney;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ConditionsActivity extends AppCompatActivity {
    int percent = 100;
    double b=1.45;
    double total;
    int score = 100;



    private List<Word> words = new ArrayList();
    ListView nameList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.names);
// начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        nameList = (ListView) findViewById(R.id.nameList);
        // создаем адаптер
        WordAdapter wordAdapter = new WordAdapter(this, R.layout.word_list, words);
        // устанавливаем адаптер
        nameList.setAdapter(wordAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Word selectedWord = (Word) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт" + selectedWord.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        nameList.setOnItemClickListener(itemListener);



    }
    private void setInitialData(){

        words.add(new Word ("", "Работаем через рассрочку техники, т.е клиент оформляет в рассрочку технику в магазине, а мы покупаем ее за наличные, в последующем клиент сам платит за рассрочку"));
        words.add(new Word ("", "Микрозаймы регулируются Указом 325 от 01.01.2015. Услуги по оформлению микрозаймов населению - не оказываем, в соответствии с указом Президента №325."));
        words.add(new Word ("", "Пример расчета общей стоимости займа, включая действующие комиссии: При процентной ставке 35% - Взяли 1 рубль, вернуть необходимо 1 руб. 35 коп. равными платежами на протяжении одного года( рассрочка на 2а года).За невыполнение условий займа нет уголовной ответственности. Вы отвечаете только материально. За просроченные платежи насчитывается пеня от 0,1 до 1,5%"));

    }


      public void change(View view) {
        EditText text = findViewById(R.id.plain_text_input);

        double a;
        a= Double.valueOf(text.getText().toString());
        total = a*1.7  ;

        display((int) total);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.plain2_text_input);
        quantityTextView.setText("" + number + " за 24 мес либо досрочно");
    }

}
