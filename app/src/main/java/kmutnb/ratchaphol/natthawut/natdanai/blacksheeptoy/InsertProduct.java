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
        productButtons[1] = (Button) findViewById(R.id.button18);
        productButtons[2] = (Button) findViewById(R.id.button37);
        productButtons[3] = (Button) findViewById(R.id.button38);
        productButtons[4] = (Button) findViewById(R.id.button39);
        productButtons[5] = (Button) findViewById(R.id.button40);
        productButtons[6] = (Button) findViewById(R.id.button41);
        productButtons[7] = (Button) findViewById(R.id.button42);
        productButtons[8] = (Button) findViewById(R.id.button43);
        productButtons[9] = (Button) findViewById(R.id.button44);
        productButtons[10] = (Button) findViewById(R.id.button45);
        productButtons[11] = (Button) findViewById(R.id.button46);
        productButtons[12] = (Button) findViewById(R.id.button47);
        productButtons[13] = (Button) findViewById(R.id.button48);
        productButtons[14] = (Button) findViewById(R.id.button49);
        productButtons[15] = (Button) findViewById(R.id.button50);
        productButtons[16] = (Button) findViewById(R.id.button51);
        productButtons[17] = (Button) findViewById(R.id.button52);
        productButtons[18] = (Button) findViewById(R.id.button53);
        productButtons[19] = (Button) findViewById(R.id.button54);
        productButtons[20] = (Button) findViewById(R.id.button55);
        productButtons[21] = (Button) findViewById(R.id.button56);
        productButtons[22] = (Button) findViewById(R.id.button57);
        productButtons[23] = (Button) findViewById(R.id.button58);
        productButtons[24] = (Button) findViewById(R.id.button59);
        productButtons[25] = (Button) findViewById(R.id.button60);
        productButtons[26] = (Button) findViewById(R.id.button61);
        productButtons[27] = (Button) findViewById(R.id.button62);
        productButtons[28] = (Button) findViewById(R.id.button63);
        productButtons[29] = (Button) findViewById(R.id.button64);
        productButtons[30] = (Button) findViewById(R.id.button65);
        productButtons[31] = (Button) findViewById(R.id.button66);


    } //bindWidget

    public void clickCancleInsert(View view) {
        finish();

    } //clickCancel
} //Main Class
