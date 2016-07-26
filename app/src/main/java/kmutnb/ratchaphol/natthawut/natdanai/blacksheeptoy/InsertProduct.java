package kmutnb.ratchaphol.natthawut.natdanai.blacksheeptoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InsertProduct extends AppCompatActivity {

    //Explicit
    private ImageView[] productImageViews;
    private Button[] productButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_product);

        //BindWidget
        bindWidget();

    } //Main Metrod

    private void bindWidget() {

        productImageViews = new ImageView[32];
        productImageViews[0] = (ImageView) findViewById(R.id.imageView5);
        productImageViews[1] = (ImageView) findViewById(R.id.imageView6);
        productImageViews[2] = (ImageView) findViewById(R.id.imageView7);
        productImageViews[3] = (ImageView) findViewById(R.id.imageView8);
        productImageViews[4] = (ImageView) findViewById(R.id.imageView9);
        productImageViews[5] = (ImageView) findViewById(R.id.imageView10);
        productImageViews[6] = (ImageView) findViewById(R.id.imageView11);
        productImageViews[7] = (ImageView) findViewById(R.id.imageView12);
        productImageViews[8] = (ImageView) findViewById(R.id.imageView13);
        productImageViews[9] = (ImageView) findViewById(R.id.imageView14);
        productImageViews[10] = (ImageView) findViewById(R.id.imageView15);
        productImageViews[11] = (ImageView) findViewById(R.id.imageView16);
        productImageViews[12] = (ImageView) findViewById(R.id.imageView17);
        productImageViews[13] = (ImageView) findViewById(R.id.imageView18);
        productImageViews[14] = (ImageView) findViewById(R.id.imageView19);
        productImageViews[15] = (ImageView) findViewById(R.id.imageView20);
        productImageViews[16] = (ImageView) findViewById(R.id.imageView21);
        productImageViews[17] = (ImageView) findViewById(R.id.imageView22);
        productImageViews[18] = (ImageView) findViewById(R.id.imageView23);
        productImageViews[19] = (ImageView) findViewById(R.id.imageView24);
        productImageViews[20] = (ImageView) findViewById(R.id.imageView25);
        productImageViews[21] = (ImageView) findViewById(R.id.imageView26);
        productImageViews[22] = (ImageView) findViewById(R.id.imageView27);
        productImageViews[23] = (ImageView) findViewById(R.id.imageView28);
        productImageViews[24] = (ImageView) findViewById(R.id.imageView29);
        productImageViews[25] = (ImageView) findViewById(R.id.imageView30);
        productImageViews[26] = (ImageView) findViewById(R.id.imageView31);
        productImageViews[27] = (ImageView) findViewById(R.id.imageView32);
        productImageViews[28] = (ImageView) findViewById(R.id.imageView33);
        productImageViews[29] = (ImageView) findViewById(R.id.imageView34);
        productImageViews[30] = (ImageView) findViewById(R.id.imageView35);
        productImageViews[31] = (ImageView) findViewById(R.id.imageView36);

        productButtons = new Button[32];
        productButtons[0] = (Button) findViewById(R.id.button36);


    } //bindWidget

    public void clickCancleInsert(View view) {
        finish();

    } //clickCancel
} //Main Class
