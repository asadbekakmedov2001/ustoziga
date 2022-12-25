package com.example.ustozga;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));


        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I BOB.\tBUTUN SONLAR HALQASIDA BO'LINISH NAZARIYASI ELEMENTLARI");

                modelRcyclers.add(new ModelRcycler("1.1-§. Qoldiqli bo‘lish haqidagi tеorеma","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/1.1.pdf"));
                modelRcyclers.add(new ModelRcycler("1.2-§. Eng katta umumiy bo‘luvchi va eng kichik umumiy karrali","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/1.2.pdf"));
                modelRcyclers.add(new ModelRcycler("1.3-§. Tub va murakkab sonlar","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/1.3.pdf"));
                modelRcyclers.add(new ModelRcycler("I.BOB. Masalalarining javoblari","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/1j.pdf"));
                modelRcyclers.add(new ModelRcycler("I.BOB. Masalalarining yechilish usullari","https://github.com/asadbekakmedov2001/sonlar_nazariyasi/blob/main/1mi.pdf"));

            }break;
            case 2: {

                textViewSelectedChapterName.setText("II BOB.\tSONLI FUNKSIYALAR VA ULARNING XOSSALARI");

                modelRcyclers.add(new ModelRcycler("2.1-§. π(X) - funksiyasi.","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.1.pdf"));
                modelRcyclers.add(new ModelRcycler("2.2-§. Butun qism va kasr qism funksiyalari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));
                modelRcyclers.add(new ModelRcycler("2.3-§. Berilgan sonning bo‘luvchilari soni va bo‘luvchilari yig‘indisini ifodalovchi funksiyalar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));
                modelRcyclers.add(new ModelRcycler("2.4-§. Eyler funksiyasi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));
                modelRcyclers.add(new ModelRcycler("II.BOB. Masalalarining javoblari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));
                modelRcyclers.add(new ModelRcycler("II.BOB. Masalalarining yechilish usullari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/2.2.pdf"));

            }break;

            case 3: {

                textViewSelectedChapterName.setText("III BOB.\tTAQQOSLAMALAR NAZARIYASI VA ELEMENTLARI");

                modelRcyclers.add(new ModelRcycler("3.1-§.  Taqqoslamalar  va ularning asosiy xossalari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.1.pdf"));
                modelRcyclers.add(new ModelRcycler("3.2-§.  Bеrilgan modul bo‘yicha chеgirmalar sinflari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.2.pdf"));
                modelRcyclers.add(new ModelRcycler("3.3-§.  Eylеr va Fеrma tеorеmalari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.2.pdf"));
                modelRcyclers.add(new ModelRcycler("III.BOB. Masalalarining javoblari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.2.pdf"));
                modelRcyclers.add(new ModelRcycler("III.BOB. Masalalarining yechilish usullari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/3.2.pdf"));

            }break;
            case 4: {

                textViewSelectedChapterName.setText("IV BOB.\tBIR NOMA'LUMLI TAQQOSLAMALAR");

                modelRcyclers.add(new ModelRcycler("4.1-§. Bir noma‘lumli taqqoslamalar (umumiy ma‘lumotlar)","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.1.pdf"));
                modelRcyclers.add(new ModelRcycler("4.2-§. Bir noma‘lumli birinchi darajali taqqoslamalar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.2.pdf"));
                modelRcyclers.add(new ModelRcycler("4.3-§. Bir noma‘lumli birinchi darajali taqqoslamalar sistemasi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("4.4-§. Tub modul bo‘yicha yuqori darajali taqqoslamalar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("4.5-§. Murakkab modul bo‘yicha yuqori darajali taqqoslamalar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("4.6-§. Ikkinchi darajali taqqoslamalar va Lejandr simvoli","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("IV.BOB. Masalalarining javoblari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("IV.BOB. Masalalarining yechilish usullari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/4.3.pdf"));


            }break;
            case 5: {

                textViewSelectedChapterName.setText("V BOB.\tBOSHLANG'ICH ILDIZLAR VA INDEKSLAR");

                modelRcyclers.add(new ModelRcycler("5.1-§. Ko‘rsatkichga qarashli sonlar va boshlang‘ich ildizlar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.1.pdf"));
                modelRcyclers.add(new ModelRcycler("5.2-§. Indekslar va ularning tadbiqlar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.2.pdf"));
                modelRcyclers.add(new ModelRcycler("5.3-§. Taqqoslamalar nazariyasining ba‘zi tadbiqlari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.3.pdf"));
                modelRcyclers.add(new ModelRcycler("V.BOB. Masalalarining javoblari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.3.pdf"));
                modelRcyclers.add(new ModelRcycler("V.BOB. Masalalarining yechilish usullari","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/5.3.pdf"));

            }break;
            case 6: {

                textViewSelectedChapterName.setText("VI BOB.\tUZLUKSIZ KASRLAR VA ULARNING TADBIQLARI");

                modelRcyclers.add(new ModelRcycler("6.1-§. Chekli uzluksiz kasrlar","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.1.pdf"));
                modelRcyclers.add(new ModelRcycler("6.2-§. Chеksiz uzliksiz kasrlarning yaqinlashuvchiligi","https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.2.pdf"));
                modelRcyclers.add(new ModelRcycler("6.3-§. Chеksiz uzliksiz kasrlar va kvadrat irratsionalliklar","fhttps://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.3.pdf"));
                modelRcyclers.add(new ModelRcycler("6.4-§. Algebraik va transtsendent sonlar","fhttps://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.3.pdf"));
                modelRcyclers.add(new ModelRcycler("VI.BOB. Masalalarining javoblari","fhttps://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.3.pdf"));
                modelRcyclers.add(new ModelRcycler("VI.BOB. Masalalarining yechilish usullari","fhttps://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/6.3.pdf"));

            }break;


        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }
}