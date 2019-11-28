package camera.filters.hdresult.itbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView pdflistView;
    String[] pdfFiles = {"ICT","Principle of Programing Language",
            "Fundamentals of Computer Programing","Digital Logic Design1","Digital Logic Design2",
            "Calculus","Recognized Rabbit Breeds","OFFICIAL SHOW RULES"};
    Integer[] imgid={R.drawable.book,R.drawable.book,R.drawable.book,R.drawable.book,R.drawable.book,
            R.drawable.book,R.drawable.book,R.drawable.book,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdflistView=findViewById(R.id.myPDFList);
        CustomListView customListView=new CustomListView(this,pdfFiles,imgid);
        pdflistView.setAdapter((ListAdapter) customListView);

     pdflistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item = pdflistView.getItemAtPosition(position).toString();
            Intent start = new Intent(getApplicationContext(),PDFopner.class);
            start.putExtra("PdfFileName",item);
            startActivity(start);
        }
    });
}}
