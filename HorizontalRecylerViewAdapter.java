package spice.in.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Temp-01421 on 03-10-2016.
 */
public class HorizontalRecylerViewAdapter extends RecyclerView.Adapter<HorizontalRecylerViewAdapter.ViewHolder> {

    private final Context context;
    private Boolean isUndo = false;
    private ArrayList<Integer> mArrayList;
    private View recentView;
    public HorizontalRecylerViewAdapter(Context context, ArrayList<Integer> mArrayList) {
        this.context = context;
        this.mArrayList=mArrayList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(
                R.layout.horizontal_recyclerview, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder,int position) {
        try{

            holder.mImageView.setImageResource(mArrayList .get(position));

        } catch (Exception e) {

        }

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.imageView);

        }


    }
}
