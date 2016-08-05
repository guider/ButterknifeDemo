package com.yanyuanquan.android.helper;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by guider on 16/8/5.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class TestActivity extends Activity {


    @BindView(R2.id.textview)
    Button textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);
        Log.e("Buttterknife", "   title   " + textview);

    }

    @OnClick(R2.id.textview)
    boolean sayGetOffMe() {
        Toast.makeText(this, "Butterknife click active !", LENGTH_SHORT).show();
        return true;
    }
}
