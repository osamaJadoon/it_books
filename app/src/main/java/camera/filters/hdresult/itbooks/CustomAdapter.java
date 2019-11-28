package camera.filters.hdresult.itbooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] ITbooks;
    Integer[] imgid;
    LayoutInflater inflter;
    /*
    public CustomAdapter(Context applicationContext, int[] imgid) {
        this.context = applicationContext;
       // this.imgid = imgid;
        inflter = (LayoutInflater.from(applicationContext));
    }
     */

    public CustomAdapter(Context applicationContext, String[] ITbooks, Integer[] imgid) {
        this.context = applicationContext;
        this.imgid = imgid;
        this.ITbooks=ITbooks;
        inflter = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return imgid.length;
    }
    @Override
    public Object getItem(int i) {
        return imgid[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       view = inflter.inflate(R.layout.gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView textView =(TextView)view.findViewById(R.id.textView);
        // get the reference of ImageView
        icon.setImageResource(imgid[i]);
        textView.setText(ITbooks[i]);
        // set logo images
        return view;
    }}
