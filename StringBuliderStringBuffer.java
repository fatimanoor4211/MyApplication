package spice.in.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StringBuliderStringBuffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_bulider_string_buffer);

//        check effiency

//        long startTime = System.currentTimeMillis();
//        StringBuffer sb = new StringBuffer("Java");
//        for (int i=0; i<10000; i++){
//            sb.append("Tpoint");
//        }
//        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
//
//
//        startTime = System.currentTimeMillis();
//        StringBuilder sb2 = new StringBuilder("Java");
//        for (int i=0; i<10000; i++){
//            sb2.append("Tpoint");
//        }
//        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");


        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());

        sb.append("1234567891234567");
        System.out.println(sb.capacity());

        sb.append("j");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2






    }
}
