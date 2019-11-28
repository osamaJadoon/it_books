package camera.filters.hdresult.itbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    GridView myGridView;
    String[] ITbooks={"Semister 1st","Semister 2nd","Semister 3rd","Semister 4th","Semister 5th"
            ,"Semister 6th","Semister 7th","Semister 8th"};
    Integer[] imgid={R.drawable.book,R.drawable.book,R.drawable.book,R.drawable.book,R.drawable.book,
            R.drawable.book,R.drawable.book,R.drawable.book,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGridView=findViewById(R.id.booksView);
       // ITbooks=findViewById(R.id.books);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),ITbooks,imgid);
        myGridView.setAdapter(customAdapter);
        myGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    // set an Intent to Another Activity
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Semister", ITbooks[position]); // put image data in Intent
                    startActivity(intent); // start Intent
                }
                else if(position==1) {
                    // set an Intent to Another Activity
                    Intent intent = new Intent(MainActivity.this, Semester2.class);
                    intent.putExtra("Semister", ITbooks[position]); // put image data in Intent
                    startActivity(intent); // start Intent
                }
                else{
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Semister", ITbooks[position]); // put image data in Intent
                    startActivity(intent); // start Intent
                }
            }
        });
    }
}
