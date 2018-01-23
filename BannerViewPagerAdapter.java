package spice.in.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by ch-e01294 on 29-05-2017.
 */

public class BannerViewPagerAdapter extends PagerAdapter {
    int pos = 0;
    private List<BannerModel> mBannerImagesList;
    private LayoutInflater layoutInflater;
    private Context mContext;
    private ImageView mImage;

    public BannerViewPagerAdapter(Context mContext, List<BannerModel> mBannerImagesList) {
        this.mContext = mContext;
        this.mBannerImagesList = mBannerImagesList;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.banner_adapter_layout, container, false);

        mImage = (ImageView) view.findViewById(R.id.imageView);
//        mImage.setImageResource(R.drawable.aeps);
        mImage.setImageResource(mBannerImagesList.get(position).getImage());
        container.addView(view);


        return view;
    }

    @Override
    public int getCount() {

      return mBannerImagesList.size();
//        return 8;
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }




    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }


}
