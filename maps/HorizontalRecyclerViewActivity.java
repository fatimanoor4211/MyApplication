package spice.in.myapplication.maps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import spice.in.myapplication.HorizontalRecylerViewAdapter;
import spice.in.myapplication.R;


public class HorizontalRecyclerViewActivity extends AppCompatActivity {
    private HorizontalRecylerViewAdapter mHorizontalrecyclerviewadapter;
    private ArrayList<Integer> mArrayList;
    private Context  mcontext;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_recycler_view);
        mcontext = this;

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mArrayList = new ArrayList<Integer>();
        mArrayList.add(R.drawable.banner);
        mArrayList.add(R.drawable.banner_old);
        mArrayList.add(R.drawable.blue_banner);
        mArrayList.add(R.drawable.mobile_banner);
        mArrayList.add(R.drawable.banner);
        mArrayList.add(R.drawable.banner_old);
        mArrayList.add(R.drawable.blue_banner);
        mArrayList.add(R.drawable.mobile_banner);
        mArrayList.add(R.drawable.banner);
        mArrayList.add(R.drawable.banner_old);
        mArrayList.add(R.drawable.blue_banner);
        mArrayList.add(R.drawable.mobile_banner);
        mArrayList.add(R.drawable.banner);
        mArrayList.add(R.drawable.banner_old);
        mArrayList.add(R.drawable.blue_banner);
        mArrayList.add(R.drawable.mobile_banner);
        mArrayList.add(R.drawable.banner);
        mArrayList.add(R.drawable.banner_old);
        mArrayList.add(R.drawable.blue_banner);
        mArrayList.add(R.drawable.mobile_banner);


        mHorizontalrecyclerviewadapter = new HorizontalRecylerViewAdapter(mcontext,mArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setAdapter(mHorizontalrecyclerviewadapter);
        mHorizontalrecyclerviewadapter.notifyDataSetChanged();
    }
}
