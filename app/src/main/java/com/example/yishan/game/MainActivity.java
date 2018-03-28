package com.example.yishan.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtReslult;
    private ImageButton mBtnPaper,mBtnScissors,mBtnStone;
    private ImageView mTxtComplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtComplay=(ImageView)findViewById(R.id.comPlay);
        mTxtReslult=(TextView)findViewById(R.id.txtResult);
        mBtnPaper=(ImageButton)findViewById(R.id.imgbtnPaper);
        mBtnScissors=(ImageButton)findViewById(R.id.imgbtnScissors);
        mBtnPaper=(ImageButton)findViewById(R.id.imgbtnStone);

        mBtnStone.setOnClickListener(btnStoneOnClick);
        mBtnScissors.setOnClickListener(btnScissorsOnClick);
        mBtnPaper.setOnClickListener(btnPaperOnClick);
    }

    private View.OnClickListener btnStoneOnClick=new View.OnClickListener(){
        public void onClick(View w){
            int iComPlay=(int)(Math.random()*3+1);
            //1剪刀 2 石頭  3布
            switch (iComPlay){
                case 1:
                    mTxtComplay.setImageResource(R.drawable.scissors);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_win));
                    break;
                case 2:
                    mTxtComplay.setImageResource(R.drawable.rock);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_draw));
                    break;
                case 3:
                    mTxtComplay.setImageResource(R.drawable.paper);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_lose));
                    break;
            }
        }
    };

    private View.OnClickListener btnScissorsOnClick=new View.OnClickListener(){
        public void onClick(View w){
            int iComPlay=(int)(Math.random()*3+1);
            //1剪刀 2 石頭  3布
            switch (iComPlay){
                case 1:
                    mTxtComplay.setImageResource(R.drawable.scissors);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_draw));
                    break;
                case 2:
                    mTxtComplay.setImageResource(R.drawable.rock);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_lose));
                    break;
                case 3:
                    mTxtComplay.setImageResource(R.drawable.paper);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_win));
                    break;
            }
        }
    };

    private View.OnClickListener btnPaperOnClick=new View.OnClickListener(){
        public void onClick(View w){
            int iComPlay=(int)(Math.random()*3+1);
            //1剪刀 2 石頭  3布
            switch (iComPlay){
                case 1:
                    mTxtComplay.setImageResource(R.drawable.scissors);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_lose));
                    break;
                case 2:
                    mTxtComplay.setImageResource(R.drawable.rock);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_win));
                    break;
                case 3:
                    mTxtComplay.setImageResource(R.drawable.paper);
                    mTxtReslult.setText(getString(R.string.result)+getString(R.string.player_draw));
                    break;
            }
        }
    };
}
