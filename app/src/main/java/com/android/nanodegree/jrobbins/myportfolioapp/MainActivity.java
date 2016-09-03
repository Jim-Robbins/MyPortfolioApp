package com.android.nanodegree.jrobbins.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MyPortfolioApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Generic button handler
     *
     * @param view reference of the button selected
     */
    public void onProjectBtnClicked(View view)
    {
        openNanoProject(view);
    }

    /**
     * Open the selected Nanodegree sample project
     *
     * @param view reference of the button selected from the project menu
     */
    private void openNanoProject(View view)
    {
        showProjectToast((Button) view);
//        switch (view.getId())
//        {
//            case R.id.popular_movies:
//                Log.d(TAG, getString(R.string.btn_popular_movies));
//                break;
//            case R.id.stock_hawk:
//                Log.d(TAG, getString(R.string.btn_stock_hawk));
//                break;
//            case R.id.build_it_bigger:
//                Log.d(TAG, getString(R.string.btn_build_it_bigger));
//                break;
//            case R.id.make_your_app_material:
//                Log.d(TAG, getString(R.string.btn_make_your_app_material));
//                break;
//            case R.id.go_ubiquitous:
//                Log.d(TAG, getString(R.string.btn_go_ubiquitous));
//                break;
//            case R.id.capstone:
//            default:
//                Log.d(TAG, getString(R.string.btn_capstone));
//                break;
//        }
    }

    /**
     * Show a toast message, and use the select button text in the message
     *
     * @param selectedButton reference to the view/button selected
     */
    private void showProjectToast(Button selectedButton)
    {
        String message = getString(R.string.s_toast_message, selectedButton.getText().toString());
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
