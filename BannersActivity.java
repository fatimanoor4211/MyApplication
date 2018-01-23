package spice.in.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class BannersActivity extends Activity {
    ViewPager wrapContentViewPager;
    private BannerViewPagerAdapter mpageAdapter;
    private List<BannerModel> mImagesArrayList;
    private BannerModel bannerModel1, bannerModel2, bannerModel3, bannerModel4, bannerModel5, bannerModel6, bannerModel7, bannerModel8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_activity_layout);

//        mpager = (ViewPager) findViewById(pager);
        wrapContentViewPager = (ViewPager) findViewById(R.id.view_pager);
        mImagesArrayList = new ArrayList<>();
        setBannerData();
        mpageAdapter = new BannerViewPagerAdapter(this, mImagesArrayList);
//        int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
//        wrapContentViewPager.setClipToPadding(false);
//        wrapContentViewPager.setPadding(margin, 0, margin, 0);
        wrapContentViewPager.setAdapter(mpageAdapter);

//        wrapContentViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            int mCurrentPosition = 0;
//
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            }
//
//            @Override
//            public void onPageSelected(final int position) {
//                mCurrentPosition = position;
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//                if (mCurrentPosition == wrapContentViewPager.getAdapter().getCount() - 1) {
//                    wrapContentViewPager.setCurrentItem(0, false);
//                }
////                if (mCurrentPosition == mImagesArrayList.size()) {
////                    wrapContentViewPager.setCurrentItem(0, true);
////                }
//
//            }
//        });

    }


    public void setBannerData() {

        bannerModel2 = new BannerModel();
        bannerModel2.setImage(R.drawable.banner);
        mImagesArrayList.add(bannerModel2);

        bannerModel3 = new BannerModel();
        bannerModel3.setImage(R.drawable.banner_old);
        mImagesArrayList.add(bannerModel3);

        bannerModel4 = new BannerModel();
        bannerModel4.setImage(R.drawable.blue_banner);
        mImagesArrayList.add(bannerModel4);

        bannerModel5 = new BannerModel();
        bannerModel5.setImage(R.drawable.banner);
        mImagesArrayList.add(bannerModel5);

        bannerModel1 = new BannerModel();
        bannerModel1.setImage(R.drawable.banner_old);
        mImagesArrayList.add(bannerModel1);

        bannerModel6 = new BannerModel();
        bannerModel6.setImage(R.drawable.blue_banner);
        mImagesArrayList.add(bannerModel6);

    }

    @Override
    protected void onResume() {
        super.onResume();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                int currentIndex = wrapContentViewPager.getCurrentItem();
                if ((currentIndex + 1) > mImagesArrayList.size()) {
                    currentIndex = 0;

                } else {
                    currentIndex++;
                }
                wrapContentViewPager.setCurrentItem(currentIndex);
            }
        }, 1000);
    }


}

