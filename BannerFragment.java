package spice.in.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static spice.in.myapplication.R.id.pager;

/**
 * Created by ch-e01294 on 29-05-2017.
 */

public class BannerFragment extends Fragment {
    private ViewPager mpager;
    private BannerViewPagerAdapter mpageAdapter;
    private List<BannerModel> mImagesArrayList;
    private BannerModel bannerModel1,bannerModel2,bannerModel3,bannerModel4,bannerModel5,bannerModel6,bannerModel7,bannerModel8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.banner_fragment_layout, container, false);

        mpager = (ViewPager) v.findViewById(pager);
        mImagesArrayList = new ArrayList<>();

        setBannerData();

        mpageAdapter = new BannerViewPagerAdapter(getActivity(), mImagesArrayList);
        mpager.setAdapter(mpageAdapter);

        return v;
    }

    public void setBannerData(){
        bannerModel1=new BannerModel();
        bannerModel1.setImage(R.drawable.banner_old);
        mImagesArrayList.add(bannerModel1);

        bannerModel2=new BannerModel();
        bannerModel2.setImage(R.drawable.banner);
        mImagesArrayList.add(bannerModel2);

        bannerModel3=new BannerModel();
        bannerModel3.setImage(R.drawable.blue_banner);
        mImagesArrayList.add(bannerModel3);

        bannerModel4=new BannerModel();
        bannerModel4.setImage(R.drawable.mobile_banner);
        mImagesArrayList.add(bannerModel4);

        bannerModel5=new BannerModel();
        bannerModel5.setImage(R.drawable.dummyimage);
        mImagesArrayList.add(bannerModel5);

        bannerModel6=new BannerModel();
        bannerModel6.setImage(R.drawable.dummyimage4);
        mImagesArrayList.add(bannerModel6);

        bannerModel7=new BannerModel();
        bannerModel7.setImage(R.drawable.banner_old);
        mImagesArrayList.add(bannerModel7);

        bannerModel8=new BannerModel();
        bannerModel8.setImage(R.drawable.mobile_banner);
        mImagesArrayList.add(bannerModel8);
    }
}
