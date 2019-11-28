package camera.filters.hdresult.itbooks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopner extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdfopner);
        myPDFViewer=findViewById(R.id.PDFViewer);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("ICT")){
            myPDFViewer.fromAsset("ict.pdf").load();
        }
        if(getItem.equals("Principle of Programing Language")){
            myPDFViewer.fromAsset("principle_of_programing_language.pdf").load();
        }
        if(getItem.equals("Fundamentals of Computer Programing")){
            myPDFViewer.fromAsset("fundamentals_of_computer_programming.pdf").load();
        }
        if(getItem.equals("Digital Logic Design1")){
            myPDFViewer.fromAsset("digital_logic_design.pdf").load();
        }
        if(getItem.equals("Digital Logic Design2")){
            myPDFViewer.fromAsset("dld.pdf").load();
        }
        if(getItem.equals("Calculus")){
            myPDFViewer.fromAsset("calculus.pdf").load();
        }
        if(getItem.equals("OOP Java")){
            myPDFViewer.fromAsset("oop_prog_java.pdf").load();
        }
        if(getItem.equals("OOP_1")){
            myPDFViewer.fromAsset("oop1.pdf").load();
        }
        if(getItem.equals("Calculus II")){
            myPDFViewer.fromAsset("cal_2.pdf").load();
        }
        if(getItem.equals("Calculus-2")){
            myPDFViewer.fromAsset("calculus_2.pdf").load();
        }
        if(getItem.equals("Advanced Grammar in Use")){
            myPDFViewer.fromAsset("advanced_grammar_in_use.pdf").load();
        }
        if(getItem.equals("Complete English Guide")){
            myPDFViewer.fromAsset("english.pdf").load();
        }
        if(getItem.equals("Pakistan Studies")){
            myPDFViewer.fromAsset("pakistan_studies.pdf").load();
        }
        if(getItem.equals("Handout for Pakistan Studies")){
            myPDFViewer.fromAsset("handouts_for_pak.pdf").load();
        }
        if(getItem.equals("Pakistan Studies-2")){
            myPDFViewer.fromAsset("pakistan_studies2.pdf").load();
        }

    }
}