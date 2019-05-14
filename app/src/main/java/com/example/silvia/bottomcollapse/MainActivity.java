package com.example.silvia.bottomcollapse;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetbehavior;
    private ImageView imgshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout=(LinearLayout)findViewById(R.id.bottomsheet);
        imgshare=(ImageView) findViewById(R.id.shareimg);
        bottomSheetbehavior= BottomSheetBehavior.from(bottomsheetlayout);

        // state hidden

       bottomSheetbehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        // state Collapse

        //inicia  escondido
        //bottomSheetbehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

       //inicia  expandido
      //  bottomSheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

    }
}
