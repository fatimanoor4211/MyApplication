package spice.in.myapplication.maps;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import spice.in.myapplication.R;


/**
 * Created by Temp-01418 on 22-12-2015.
 */
/*
* Adapter to show list of notifications in notification activity
* */
public class BiometricSelectionAdapterextends extends RecyclerView.Adapter<BiometricSelectionAdapterextends.ViewHolder> {
    Context mcontext;
    private ArrayList<String> transHistoryList;

    public BiometricSelectionAdapterextends(Context context, ArrayList<String> transHistoryList) {

        this.mcontext = context;
        this.transHistoryList = transHistoryList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_biometric_selection_layout, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        try {


        } catch (Exception e) {
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            try {

            } catch (Exception e) {
            }
        }
    }
}