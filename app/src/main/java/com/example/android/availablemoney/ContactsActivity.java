package com.example.android.availablemoney;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

        import java.util.ArrayList;
        import java.util.List;

public class ContactsActivity extends AppCompatActivity {



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
                Toast.makeText(getApplicationContext(), " " + selectedWord.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        nameList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){

        words.add(new Word ("Связаться с нами по телефону", "+37525 542 49 70"));
        words.add(new Word ("Наш адрес:", " г.Минск, пр-кт Независимости 95"));
        words.add(new Word ("Другие города:", "Также работаем в Гомеле, Могилеве, Бресте, Витебске, Гродно"));

    }


}

