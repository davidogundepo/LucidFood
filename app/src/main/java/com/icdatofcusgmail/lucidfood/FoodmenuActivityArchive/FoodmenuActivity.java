package com.icdatofcusgmail.lucidfood.FoodmenuActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.antonionicolaspina.revealtextview.RevealTextView;
import com.icdatofcusgmail.lucidfood.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.lucidfood.LucidApplication;
import com.icdatofcusgmail.lucidfood.MyCountlesston;
import com.icdatofcusgmail.lucidfood.R;
import com.icdatofcusgmail.lucidfood.ServingActivityArchive.ServingActivity;
import com.luolc.emojirain.EmojiRainLayout;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class FoodmenuActivity extends AppCompatActivity implements Communicator, FoodpriceFragment.OnNameSetListener, ChosenfoodFragment.OnPriceSetListener, CompoundButton.OnCheckedChangeListener, AdapterView.OnItemClickListener {

    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_foodmenu;
    private RelativeLayout relative;
    public static Button textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th;
    Button button, button2, button3, button4, button5, button6;
    static Button Pcount, Purchase;
    ListView ShowForThis;
    TextView WelcomeSweet, fullUsername, Lucid, EmailAddress;
    TextView NoOfPlates;
    TextView Sex, UserProfileName, UserProfileAccountBalance, UserProfileStarLevel, Department, Level, LastSeen, UserProfileSex;
    ImageView UserProfileImage;
    TextView BooleanInPackorInPlate;
    static TextView myOwnPay;
    public static CheckBox pack;
    private ImageView AnimatedImageView;
    CircleImageView circleImageView;
    public static int out = 0;
    public static int fifty = 0;
    static int hundred = 0;
    static int onefifty = 0;
    static int twohundred = 0;
    static int twofifty = 0;
    static int threehundred = 0;
    static int threehundredfifty = 0;
    static int fourhundred = 0;
    static int fourhundredfifty = 0;
    static int fivehundred = 0;
    static int fivehundredfifty = 0;
    static int sixhundred = 0;
    static int sixhundredfifty = 0;
    static int sevenhundred = 0;
    static int sevenhundredfifty = 0;
    static int eighthundred = 0;
    static int eighthundredfifty = 0;
    static int ninehundred = 0;
    static int ninehundredfifty = 0;
    static int onethousand = 0;
    static int onethousandfifty = 0;
    static int onethousandhundred = 0;
    static int onethousandonefifty = 0;
    static int onethousandtwohundred = 0;
    static int onethousandtwofifty = 0;
    static int onethousandthreehundred = 0;
    static int onethousandthreefifty = 0;
    static int onethousandfourhundred = 0;
    static int onethousandfourfifty = 0;
    static int onethousandfivehundred = 0;

    String packPrice;
    String pacque, stringue = "";
    public static String playtcount = "";
    public static String stringplayti = "Buying all in a plate";
    String stringplaytii = "Buying all in two plates";
    String stringplaytiii = "Buying all in three plates";
    String stringplaytiv = "Buying all in four plates";
    String stringplaytv = "Buying all in five plates";
    String stringplaytvi = "Buying all in six plates";
    String stringplaytvii = "Buying all in seven plates";
    String stringplaytviii = "Buying all in eight plates";
    String stringplaytix = "Buying all in nine plates";
    String stringplaytx = "Buying all in ten plates";
    String stringplaytxi = "Buying all in oneone plates";
    String stringplaytxii = "Buying all in onetwo plates";
    String stringplaytxiii = "Buying all in onethree plates";
    String stringplaytxiv = "Buying all in onefour plates";
    String stringplaytxv = "Buying all in onefive plates";
    String stringplaytxvi = "Buying all in onesix plates";
    String stringplaytxvii = "Buying all in oneseven plates";
    String stringplaytxviii = "Buying all in oneeight plates";
    String stringplaytxix = "Buying all in onenine plates";
    String stringplaytxx = "Buying all in oneten plates";
    String stringplaytxxi = "Buying all in twoone plates";
    String stringplaytxxii = "Buying all in twotwo plates";
    String stringplaytxxiii = "Buying all in twothree plates";
    String stringplaytxxiv = "Buying all in twofour plates";
    String stringplaytxxv = "Buying all in twofive plates";
    String stringplaytxxvi = "Buying all in twosix plates";
    String stringplaytxxvii = "Buying all in twoseven plates";
    String stringplaytxxviii = "Buying all in twoeight plates";
    String stringplaytxxix = "Buying all in twonine plates";
    String stringplaytxxx = "Buying all in twoten plates";

    String FoodAOneBeta, FoodAOne, FoodATwo, NoOfFoodA;
    String FoodBOneBeta, FoodBOne, FoodBTwo, NoOfFoodB;
    String FoodCOneBeta, FoodCOne, FoodCTwo, NoOfFoodC;
    String FoodDOneBeta, FoodDOne, FoodDTwo, NoOfFoodD;
    String FoodEOneBeta, FoodEOne, FoodETwo, NoOfFoodE;
    String FoodFOneBeta, FoodFOne, FoodFTwo, NoOfFoodF;
    String FoodGOneBeta, FoodGOne, FoodGTwo, NoOfFoodG;
    String FoodHOneBeta, FoodHOne, FoodHTwo, NoOfFoodH;
    String FoodIOneBeta, FoodIOne, FoodITwo, NoOfFoodI;
    String FoodJOneBeta, FoodJOne, FoodJTwo, NoOfFoodJ;
    String FoodKOneBeta, FoodKOne, FoodKTwo, NoOfFoodK;
    String FoodLOneBeta, FoodLOne, FoodLTwo, NoOfFoodL;
    String FoodMOneBeta, FoodMOne, FoodMTwo, NoOfFoodM;
    String FoodNOneBeta, FoodNOne, FoodNTwo, NoOfFoodN;
    String FoodOOneBeta, FoodOOne, FoodOTwo, NoOfFoodO;
    String FoodPOneBeta, FoodPOne, FoodPTwo, NoOfFoodP;
    String FoodQOneBeta, FoodQOne, FoodQTwo, NoOfFoodQ;
    String FoodROneBeta, FoodROne, FoodRTwo, NoOfFoodR;
    String FoodSOneBeta, FoodSOne, FoodSTwo, NoOfFoodS;
    String FoodTOneBeta, FoodTOne, FoodTTwo, NoOfFoodT;
    String FoodUOneBeta, FoodUOne, FoodUTwo, NoOfFoodU;
    String FoodVOneBeta, FoodVOne, FoodVTwo, NoOfFoodV;
    String FoodWOneBeta, FoodWOne, FoodWTwo, NoOfFoodW;
    String FoodXOneBeta, FoodXOne, FoodXTwo, NoOfFoodX;

    LucidApplication app;

    String update_balance = "http://128.0.1.2/my_accountbalance_diff.php";
    String insert_bought_fooditems = "http://128.0.1.2/my_lucidfood_transaction_success.php";
    String webmail_foodtranc_details = "http://128.0.1.2/my_lucidfood_webmail_transaction_details.php";

    AlertDialog.Builder Dweezy;

    AlertDialog.Builder Lenient;
    Dialog Bamiidele;

    EmojiRainLayout emojiRainLayout;


    private enum OperationAnimation {
        BEGIN, ADJOURN
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodmenu);
        Log.d("FoodmenuActivity", "onCreate invoked");

        app = LucidApplication.getInstance();

        Dweezy = new AlertDialog.Builder(FoodmenuActivity.this);

        playtcount = stringplayti;
        ShowForThis = findViewById(R.id.listView);
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        textView = findViewById(R.id.Istchosenbutton);
        textView2nd = findViewById(R.id.Secondchosenbutton);
        textView3rd = findViewById(R.id.Thirdchosenbutton);
        textView4th = findViewById(R.id.Fourthchosenbutton);
        textView5th = findViewById(R.id.Fifthchosenbutton);
        textView6th = findViewById(R.id.Sixthchosenbutton);
        textView7th = findViewById(R.id.Seventhchosenbutton);
        textView8th = findViewById(R.id.Eightchosenbutton);
        textView9th = findViewById(R.id.Ninthchosenbutton);
        textView10th = findViewById(R.id.Tenthchosenbutton);
        textView11th = findViewById(R.id.Eleventhchosenbutton);
        textView12th = findViewById(R.id.Twelvthchosenbutton);
        textView13th = findViewById(R.id.Thirteenthchosenbutton);
        textView14th = findViewById(R.id.Fourteenthchosenbutton);
        textView15th = findViewById(R.id.Fifteenthchosenbutton);
        textView16th = findViewById(R.id.Sixteenthchosenbutton);
        textView17th = findViewById(R.id.Seventeenthchosenbutton);
        textView18th = findViewById(R.id.Eighteenthchosenbutton);
        textView19th = findViewById(R.id.Nineteenthchosenbutton);
        textView20th = findViewById(R.id.Twentiethchosenbutton);
        textView21st = findViewById(R.id.TwentyIstchosenbutton);
        textView22nd = findViewById(R.id.TwentySecondchosenbutton);
        textView23rd = findViewById(R.id.TwentyThirdchosenbutton);
        textView24th = findViewById(R.id.TwentyFourchosenbutton);

        BooleanInPackorInPlate = findViewById(R.id.InPackorPlate);

        NoOfPlates = findViewById(R.id.CountMyPlate);

        Sex = findViewById(R.id.sex);

        WelcomeSweet = findViewById(R.id.UserWelcome);
        fullUsername = findViewById(R.id.fullUsername);
        EmailAddress = findViewById(R.id.emailAddress);
        Lucid = (RevealTextView) findViewById(R.id.AppName);
        Typeface blackface = Typeface.createFromAsset(getAssets(), "customfont/buttonfor.otf");
        Lucid.setTypeface(blackface);

        button = findViewById(R.id.Istpricebutton);
        button2 = findViewById(R.id.Secondpricebutton);
        button3 = findViewById(R.id.Thirdpricebutton);
        button4 = findViewById(R.id.Fourthpricebutton);
        button5 = findViewById(R.id.Fifthpricebutton);
        button6 = findViewById(R.id.Sixthpricebutton);
        Pcount = findViewById(R.id.button);

        Purchase = findViewById(R.id.button20000);

        AnimatedImageView = findViewById(R.id.animatedImages);

        circleImageView = findViewById(R.id.ServerImage);
        final Bundle bundle = getIntent().getExtras();
        getUserAppearance(bundle.getString("image"));

        if (!textView.isShown() && !textView2nd.isShown() && !textView3rd.isShown()
                && !textView4th.isShown() && !textView5th.isShown() && !textView6th.isShown()
                && !textView7th.isShown() && !textView8th.isShown() && !textView9th.isShown()
                && !textView10th.isShown() && !textView11th.isShown() && !textView12th.isShown()
                && !textView13th.isShown() && !textView14th.isShown() && !textView15th.isShown()
                && !textView16th.isShown() && !textView17th.isShown() && !textView18th.isShown()
                && !textView19th.isShown() && !textView20th.isShown() && !textView21st.isShown()
                && !textView22nd.isShown() && !textView23rd.isShown() && !textView24th.isShown()) {
            Pcount.setEnabled(false);
            Purchase.setEnabled(false);
        }

        Bundle FirstParcel = getIntent().getExtras();
        try {
            WelcomeSweet.setText("Welcome,  " + FirstParcel.getString("king") + "");
        } catch (Exception ignored) {

        }

        Bundle SecondParcel = getIntent().getExtras();
        try {
            fullUsername.setText("" + SecondParcel.getString("kingDavid") + "");
        } catch (Exception ignored) {

        }

        Bundle ThirdParcel = getIntent().getExtras();
        try {
            EmailAddress.setText("" + ThirdParcel.getString("email") + "");
        } catch (Exception ignored) {

        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        relative = findViewById(R.id.activity_Foodmenu);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }
        toolbar_foodmenu = findViewById(R.id.ToolbarFoodmenuActivity);
        setSupportActionBar(toolbar_foodmenu);

        try {
            getSupportActionBar().setTitle("");
        }catch (NullPointerException ignored) {

        }


    }

    private void getUserAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("professor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mr")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("engineer")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mrs")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("miss")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        out = Integer.parseInt(String.valueOf(app.allinfoodcounter));
        fifty = Integer.parseInt(String.valueOf(app.fifty));
        hundred = Integer.parseInt(String.valueOf(app.hundred));
        onefifty = Integer.parseInt(String.valueOf(app.onefifty));
        twohundred = Integer.parseInt(String.valueOf(app.twohundred));
        twofifty = Integer.parseInt(String.valueOf(app.twofifty));
        threehundred = Integer.parseInt(String.valueOf(app.threehundred));
        threehundredfifty = Integer.parseInt(String.valueOf(app.threehundredfifty));
        fourhundred = Integer.parseInt(String.valueOf(app.fourhundred));
        fourhundredfifty = Integer.parseInt(String.valueOf(app.fourhundredfifty));
        fivehundred = Integer.parseInt(String.valueOf(app.fivehundred));
        fivehundredfifty = Integer.parseInt(String.valueOf(app.fivehundredfifty));
        sixhundred = Integer.parseInt(String.valueOf(app.sixhundred));
        sixhundredfifty = Integer.parseInt(String.valueOf(app.sixhundredfifty));
        sevenhundred = Integer.parseInt(String.valueOf(app.sevenhundred));
        sevenhundredfifty = Integer.parseInt(String.valueOf(app.sevenhundredfifty));
        eighthundred = Integer.parseInt(String.valueOf(app.eighthundred));
        eighthundredfifty = Integer.parseInt(String.valueOf(app.eighthundredfifty));
        ninehundred = Integer.parseInt(String.valueOf(app.ninehundred));
        ninehundredfifty = Integer.parseInt(String.valueOf(app.ninehundredfifty));
        onethousand = Integer.parseInt(String.valueOf(app.onethousand));
        onethousandfifty = Integer.parseInt(String.valueOf(app.onethousandfifty));
        onethousandhundred = Integer.parseInt(String.valueOf(app.onethousandhundred));
        onethousandonefifty = Integer.parseInt(String.valueOf(app.onethousandonefifty));
        onethousandtwohundred = Integer.parseInt(String.valueOf(app.onethousandtwohundred));
        onethousandtwofifty = Integer.parseInt(String.valueOf(app.onethousandtwofifty));
        onethousandthreehundred = Integer.parseInt(String.valueOf(app.onethousandthreehundred));
        onethousandthreefifty = Integer.parseInt(String.valueOf(app.onethousandthreefifty));
        onethousandfourhundred = Integer.parseInt(String.valueOf(app.onethousandfourhundred));
        onethousandfourfifty = Integer.parseInt(String.valueOf(app.onethousandfourfifty));
        onethousandfivehundred = Integer.parseInt(String.valueOf(app.onethousandfivehundred));



        if (isChecked && Objects.equals(playtcount, stringplayti)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(fifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out + fifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out + fifty) + "");
        }else if (!isChecked && Objects.equals(playtcount, stringplayti)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(hundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 2 + hundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 2 + hundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 2) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 2) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytiii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onefifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 3 + onefifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 3 + onefifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytiii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 3) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 3) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytiv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(twohundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 4 + twohundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 4 + twohundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytiv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 4) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 4) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(twofifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 5 + twofifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 5 + twofifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 5) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 5) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytvi)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(threehundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 6 + threehundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 6 + threehundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytvi)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 6) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 6) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytvii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(threehundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 7 + threehundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 7 + threehundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytvii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 7) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 7) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytviii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(fourhundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 8 + fourhundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 8 + fourhundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytviii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 8) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 8) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytix)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(fourhundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 9 + fourhundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 9 + fourhundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytix)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 9) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 9) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytx)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(fivehundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 10 + fivehundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 10 + fivehundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytx)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 10) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 10) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxi)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(fivehundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 11 + fivehundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 11 + fivehundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxi)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 11) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 11) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(sixhundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 12 + sixhundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 12 + sixhundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 12) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 12) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxiii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(sixhundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 13 + sixhundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 13 + sixhundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxiii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 13) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 13) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxiv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(sevenhundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 14 + sevenhundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 14 + sevenhundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxiv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 14) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 14) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(sevenhundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 15 + sevenhundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 15 + sevenhundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 15) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 15) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxvi)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(eighthundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 16 + eighthundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 16 + eighthundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxvi)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 16) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 16) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxvii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(eighthundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 17 + eighthundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 17 + eighthundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxvii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 17) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 17) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxviii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(ninehundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 18 + ninehundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 18 + ninehundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxviii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 18) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 18) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxix)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(ninehundredfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 19 + ninehundredfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 19 + ninehundredfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxix)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 19) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 19) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxx)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousand);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 20 + onethousand) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 20 + onethousand) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxx)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 20) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 20) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxi)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 21 + onethousandfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 21 + onethousandfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxi)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 21) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 21) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandhundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 22 + onethousandhundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 22 + onethousandhundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 22) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 22) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxiii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandonefifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 23 + onethousandonefifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 23 + onethousandonefifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxiii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 23) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 23) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxiv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandtwohundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 24 + onethousandtwohundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 24 + onethousandtwohundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxiv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 24) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 24) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxv)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandtwofifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 25 + onethousandtwofifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 25 + onethousandtwofifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxv)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 25) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 25) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxvi)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandthreehundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 26 + onethousandthreehundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 26 + onethousandthreehundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxvi)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 26) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 26) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxvii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandthreefifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 27 + onethousandthreefifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 27 + onethousandthreefifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxvii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 27) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 27) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxviii)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandfourhundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 28 + onethousandfourhundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 28 + onethousandfourhundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxviii)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 28) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 28) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxix)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandfourfifty);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 29 + onethousandfourfifty) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 29 + onethousandfourfifty) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxix)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 29) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 29) + "");
        }

        else if (isChecked && Objects.equals(playtcount, stringplaytxxx)) {
            pack.setText("" + " Buy in Pack(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = String.valueOf(onethousandfivehundred);
            BooleanInPackorInPlate.setText("" + "YES" + "");
            myOwnPay.setText("" + Integer.toString(out * 30 + onethousandfivehundred) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 30 + onethousandfivehundred) + "");
        } else if (!isChecked && Objects.equals(playtcount, stringplaytxxx)) {
            pack.setText("" + " Buying in Plate(s)" + "");
            pacque = pack.getText().toString();
            stringue = pacque;
            packPrice = null;
            BooleanInPackorInPlate.setText("" + "NO" + "");
            myOwnPay.setText("" + Integer.toString(out * 30) + "");
            ChosenplateCounter.feetag.setText("" + Integer.toString(out * 30) + "");
        }

    }

    public void ConfirmMyPurchase(View v) {

        Bundle FirstParcel = getIntent().getExtras();

        if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#B71C1C")) {
            AlertDialog.Builder notExactly = new AlertDialog.Builder(FoodmenuActivity.this);
            notExactly.setTitle("Ummmm....it seems you've kinda exceeded your accountbalance.");
            notExactly.setMessage("\nIt's alright " + FirstParcel.getString("king") +  ", we could do away with few stuffs.");
            notExactly.setPositiveButton("I'm Sorry Fam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notExactly.create().show();
        } else if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#303F9F")) {
            AlertDialog.Builder notBeyond = new AlertDialog.Builder(FoodmenuActivity.this);
            notBeyond.setTitle("Ummmm....Your Purchase really can't be equal with your Balance");
            notBeyond.setMessage("\nLet's try do away with something aiit?");
            notBeyond.setPositiveButton("Aiit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notBeyond.create().show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(FoodmenuActivity.this);

            Bundle GOAT = getIntent().getExtras();
            builder.setTitle("Confirm Purchase " + GOAT.getString("king") + "");

            builder.setMessage("The food(s) you selected will be bought by clicking \n\nBuy\n");
            LayoutInflater inflater = FoodmenuActivity.this.getLayoutInflater();
            View view = inflater.inflate(R.layout.fa_confirmpurchase_dialogue, null);
            builder.setView(view).setCancelable(false);

            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    BooleanInPackorInPlate.setText("" + "NO" + "");

                    pack.setText("" + " Buying in Plate(s)" + "");
                    pacque = pack.getText().toString();
                    stringue = pacque;
                    packPrice = null;
                    playtcount = stringplayti;
                    ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                    ChosenplateCounter.feetag.setText("" + app.allinfoodcounter + "");
                    FoodmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
                    NoOfPlates.setText("1");

                    StyleableToast NotConfirmed = new StyleableToast(getApplicationContext(), "Transaction not Confirmed", Toast.LENGTH_SHORT).spinIcon();
                    NotConfirmed.setBackgroundColor(Color.parseColor("#F48FB1"));
                    NotConfirmed.setTextColor(Color.WHITE);
                    NotConfirmed.show();
                }
            });
            builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    StringRequest fromJingSun = new StringRequest(Request.Method.POST, update_balance,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray jsonArray = new JSONArray(response);
                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
                                        String code = jsonObject.getString("code");

                                        Bundle FirstParcel = getIntent().getExtras();

                                        if (code.equals("Transaction Successful.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nAlright " + FirstParcel.getString("king") + " let's get you served.");
                                        }
                                        if (code.equals("Ummmm....it seems you've kinda exceeded your accountbalance.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nIt's alright " + FirstParcel.getString("king") + ", we could do away with few stuffs.");
                                            builder.setPositiveButton("Okay", null);
                                        }
                                        if (code.equals("It's crazy " + FirstParcel.getString("king") + " but you are not permitted to put exactly all your money.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nLet's try do away with something aiit?");
                                            builder.setPositiveButton("Aiit", null);
                                        }
                                        Dweezy.setCancelable(false);
                                        exhibitAnswer(code);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params = new HashMap<String, String>();
                            params.put("accountbalance_diff", ChosenplateCounter.feetag.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(fromJingSun);
                }

            }).setIcon(R.drawable.a_announcement_b);

            Dialog dialog = builder.create();
            try {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
            } catch (NullPointerException ignored) {

            }
            dialog.show();

            myOwnPay = view.findViewById(R.id.myPaynotYours);
            //  myOwnPay.setText(ChosenplateCounter.feetag.getText().toString());

            pack = view.findViewById(R.id.sendpackalso);
            pack.setOnCheckedChangeListener(this);

        }
    }

    public void exhibitAnswer(final String code) {
        Dweezy.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            //    Bundle FirstParcel = getIntent().getExtras();

                if (code.equals("Transaction Successful."))

                {

//                    WelcomeSweet.setText("Welcome,  " + FirstParcel.getString("king") + "");
//                    Dweezy.setTitle(code);
//                    Dweezy.setMessage("Alright " + FirstParcel.getString("king") + " let's get you served.");

                    StyleableToast TranCompleted = new StyleableToast(getApplicationContext(), "Transaction Verified", Toast.LENGTH_SHORT).spinIcon();
                    TranCompleted.setBackgroundColor(Color.parseColor("#4DB6AC"));
                    TranCompleted.setTextColor(Color.WHITE);
                    TranCompleted.setIcon(R.drawable.fa_confirmpurchasetoasticon);
                    TranCompleted.show();

                    Intent intent = new Intent(getBaseContext(), ServingActivity.class);
                    intent.putExtra("Roman", playtcount);
                    intent.putExtra("Key", stringue);

                    Bundle dweezy = new Bundle();
                    dweezy.putString("favouritism", textView.getText().toString());
                    intent.putExtras(dweezy);

                    Bundle tobi = new Bundle();
                    tobi.putString("genius", textView2nd.getText().toString());
                    intent.putExtras(tobi);

                    Bundle emmanuel = new Bundle();
                    emmanuel.putString("generous", textView3rd.getText().toString());
                    intent.putExtras(emmanuel);

                    Bundle joseph = new Bundle();
                    joseph.putString("focused", textView4th.getText().toString());
                    intent.putExtras(joseph);

                    Bundle godwin = new Bundle();
                    godwin.putString("creativebeast", textView5th.getText().toString());
                    intent.putExtras(godwin);

                    Bundle funmilayo = new Bundle();
                    funmilayo.putString("bestmom", textView6th.getText().toString());
                    intent.putExtras(funmilayo);

                    Bundle james = new Bundle();
                    james.putString("bestdad", textView7th.getText().toString());
                    intent.putExtras(james);

                    Bundle tomilola = new Bundle();
                    tomilola.putString("biggersis", textView8th.getText().toString());
                    intent.putExtras(tomilola);

                    Bundle opeyemi = new Bundle();
                    opeyemi.putString("biggestsis", textView9th.getText().toString());
                    intent.putExtras(opeyemi);

                    Bundle david = new Bundle();
                    david.putString("dhalson", textView10th.getText().toString());
                    intent.putExtras(david);

                    Bundle obla = new Bundle();
                    obla.putString("chikito", textView11th.getText().toString());
                    intent.putExtras(obla);

                    Bundle love = new Bundle();
                    love.putString("blackdiamond", textView12th.getText().toString());
                    intent.putExtras(love);

                    Bundle mrnoah = new Bundle();
                    mrnoah.putString("versatile", textView13th.getText().toString());
                    intent.putExtras(mrnoah);

                    Bundle google = new Bundle();
                    google.putString("resourceful", textView14th.getText().toString());
                    intent.putExtras(google);

                    Bundle havillah = new Bundle();
                    havillah.putString("crazitivity", textView15th.getText().toString());
                    intent.putExtras(havillah);

                    Bundle samuel = new Bundle();
                    samuel.putString("humility", textView16th.getText().toString());
                    intent.putExtras(samuel);

                    Bundle praise = new Bundle();
                    praise.putString("omuaranprince", textView17th.getText().toString());
                    intent.putExtras(praise);

                    Bundle albert = new Bundle();
                    albert.putString("zambian", textView18th.getText().toString());
                    intent.putExtras(albert);

                    Bundle akinfenwa = new Bundle();
                    akinfenwa.putString("silentassasin", textView19th.getText().toString());
                    intent.putExtras(akinfenwa);

                    Bundle aize = new Bundle();
                    aize.putString("speciallyunique", textView20th.getText().toString());
                    intent.putExtras(aize);

                    Bundle eruku = new Bundle();
                    eruku.putString("oribee", textView21st.getText().toString());
                    intent.putExtras(eruku);

                    Bundle prince = new Bundle();
                    prince.putString("ude", textView22nd.getText().toString());
                    intent.putExtras(prince);

                    Bundle oluyori = new Bundle();
                    oluyori.putString("chaplain", textView23rd.getText().toString());
                    intent.putExtras(oluyori);

                    Bundle adeyanju = new Bundle();
                    adeyanju.putString("veecee", textView24th.getText().toString());
                    intent.putExtras(adeyanju);




                    Bundle PrincessFiancee = new Bundle();
                    PrincessFiancee.putString("prince", WelcomeSweet.getText().toString()/*.substring(8)*/);
                    intent.putExtras(PrincessFiancee);


                    if (textView.getVisibility() == View.VISIBLE) {
                        stringRequestOne();
                    }
                    if (textView2nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwo();
                    }
                    if (textView3rd.getVisibility() == View.VISIBLE) {
                        stringRequestThree();
                    }
                    if (textView4th.getVisibility() == View.VISIBLE) {
                        stringRequestFour();
                    }
                    if (textView5th.getVisibility() == View.VISIBLE) {
                        stringRequestFive();
                    }
                    if (textView6th.getVisibility() == View.VISIBLE) {
                        stringRequestSix();
                    }
                    if (textView7th.getVisibility() == View.VISIBLE) {
                        stringRequestSeven();
                    }
                    if (textView8th.getVisibility() == View.VISIBLE) {
                        stringRequestEight();
                    }
                    if (textView9th.getVisibility() == View.VISIBLE) {
                        stringRequestNine();
                    }
                    if (textView10th.getVisibility() == View.VISIBLE) {
                        stringRequestTen();
                    }
                    if (textView11th.getVisibility() == View.VISIBLE) {
                        stringRequestEleven();
                    }
                    if (textView12th.getVisibility() == View.VISIBLE) {
                        stringRequestTwelve();
                    }
                    if (textView13th.getVisibility() == View.VISIBLE) {
                        stringRequestThirteen();
                    }
                    if (textView14th.getVisibility() == View.VISIBLE) {
                        stringRequestFourteen();
                    }
                    if (textView15th.getVisibility() == View.VISIBLE) {
                        stringRequestFifteen();
                    }
                    if (textView16th.getVisibility() == View.VISIBLE) {
                        stringRequestSixteen();
                    }
                    if (textView17th.getVisibility() == View.VISIBLE) {
                        stringRequestSeventeen();
                    }
                    if (textView18th.getVisibility() == View.VISIBLE) {
                        stringRequestEighteen();
                    }
                    if (textView19th.getVisibility() == View.VISIBLE) {
                        stringRequestNineteen();
                    }
                    if (textView20th.getVisibility() == View.VISIBLE) {
                        stringRequestTwenty();
                    }
                    if (textView21st.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyOne();
                    }
                    if (textView22nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyTwo();
                    }
                    if (textView23rd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyThree();
                    }
                    if (textView24th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyFour();
                    }
                    try {
                        if (!packPrice.isEmpty()) {
                            stringRequestPackPrice();
                        }
                    } catch (Exception ignored) {
//                        if (packPrice.isEmpty()) {
//
//                        }
                    }


//                    StringRequest stringRequest = new StringRequest(Request.Method.POST, insert_bought_fooditems,
//                            new Response.Listener<String>() {
//                                @Override
//                                public void onResponse(String response) {
//                                    try {
//                                        JSONArray jsonArray = new JSONArray(response);
//                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
//
//                                        String code = jsonObject.getString("tranc_success");
//
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//
//                        }
//                    }){
//                        @Override
//                        protected Map<String, String> getParams() throws AuthFailureError
//                        {
//
//                            String[] MealNames = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("naira")+6) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("naira")+6) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("naira")+6) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("naira")+6) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("naira")+6) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("naira")+6) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("naira")+6) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("naira")+6) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("naira")+6) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("naira")+6) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("naira")+6) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("naira")+6) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("naira")+6) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("naira")+6) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("naira")+6) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("naira")+6) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("naira")+6) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("naira")+6) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("naira")+6) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("naira")+6) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("naira")+6) : null,
//
//
//                            };
//
//                            String[] MealPrices = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
//
//
//                            };
//
//                            Map<String, String> params = new HashMap<String, String>();
//                            for (String Names : MealNames) {
//                                if (!(Names == null))
//                                    params.put("meal_names", Arrays.toString(MealNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            for (String Prices : MealPrices) {
//                                if (!(Prices == null))
//                                    params.put("meal_prices", Arrays.toString(MealPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            params.put("buyer_name", fullUsername.getText().toString());
//                            params.put("no_plates", NoOfPlates.getText().toString());
//                            params.put("all_pack", BooleanInPackorInPlate.getText().toString());
//                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
//                            params.put("vendor_id", app.Idtext.getText().toString());
//
//                            return params;
//                        }
//                    };
//                    MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequest);


                    StringRequest LandMarkUniversity = new StringRequest(Request.Method.POST, webmail_foodtranc_details,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray johnson = new JSONArray(response);
                                        JSONObject james = johnson.getJSONObject(0);

                                        String code = james.getString("");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError
                        {

                            String[] webmail_MealNames = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6) : null


                            };

                            String[] webmail_MealPrices = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null


                            };

                            Map<String, String> params = new HashMap<String, String>();
                            for (String Names : webmail_MealNames) {
                                if (!(Names == null))
                                    params.put("meal_names", Arrays.toString(webmail_MealNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            for (String Prices : webmail_MealPrices) {
                                if (!(Prices == null))
                                    params.put("meal_prices", Arrays.toString(webmail_MealPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            params.put("no_plates", NoOfPlates.getText().toString());
                            params.put("all_pack", BooleanInPackorInPlate.getText().toString());
                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
                            params.put("vendor_name", app.Nametext.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            params.put("sex", Sex.getText().toString());
                            params.put("accountbalance", ChosenplateCounter.feetag.getText().toString());

                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(LandMarkUniversity);
                    LandMarkUniversity.setRetryPolicy(new DefaultRetryPolicy(
                            DefaultRetryPolicy.DEFAULT_TIMEOUT_MS,
                            0, // maxNumRetries =0 means no retry
                            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                    ));

                    startActivity(intent);

                }

//                else if (code.equals("It's crazy but you are not permitted to put exactly all your money.")) {
//                //    BooleanInPackorInPlate.setText("" + "NO" + "");
//                }
            }
        });
        final AlertDialog alertDialog = Dweezy.create();
        alertDialog.show();
    }


    private void stringRequestPackPrice() {

        StringRequest stringRequestPackPrice = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            JSONObject jsonObject = jsonArray.getJSONObject(0);

                            String code = jsonObject.getString("tranc_success");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> paramsOne = new HashMap<>();

                paramsOne.put("buyer_name", fullUsername.getText().toString());
                paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                paramsOne.put("pack_price", packPrice);
                paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                paramsOne.put("vendor_id", app.Idtext.getText().toString());

                return paramsOne;
            }
        };
        MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestPackPrice);

    }


    public void stringRequestOne() {

            StringRequest stringRequestOne = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                        FoodAOneBeta  = textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6);
                        FoodATwo = textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodAOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodATwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestOne);

    }

    public void stringRequestTwo() {



            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodBOneBeta  = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6);
                        FoodBTwo = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodBOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodBTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestThree() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodCOneBeta  = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6);
                        FoodCTwo = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodCOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodCTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestFour() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodDOneBeta  = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6);
                        FoodDTwo = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodDOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodDTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestFive() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodEOneBeta  = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6);
                        FoodETwo = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodEOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodETwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestSix() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView6th.getText().toString().equals("100 NAIRA SMALL BEEF")) {

                        paramsOne.put("meal_names", "SMALLBEEF");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodFOneBeta  = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6);
                        FoodFOne = FoodFOneBeta.substring(FoodFOneBeta.indexOf(""), FoodFOneBeta.indexOf("("));
                        FoodFTwo = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" "));

                        NoOfFoodF = FoodFOneBeta.substring(FoodFOneBeta.indexOf("(")+1,FoodFOneBeta.indexOf(")"));


                        paramsOne.put("meal_names", FoodFOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodFTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodF);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestSeven() {

            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView7th.getText().toString().equals("200 NAIRA BIG BEEF")) {

                        paramsOne.put("meal_names", "BIGBEEF");
                        paramsOne.put("meal_prices", "200");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodGOneBeta  = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6);
                        FoodGOne = FoodGOneBeta.substring(FoodGOneBeta.indexOf(""), FoodGOneBeta.indexOf("("));
                        FoodGTwo = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" "));

                        NoOfFoodG = FoodGOneBeta.substring(FoodGOneBeta.indexOf("(")+1,FoodGOneBeta.indexOf(")"));


                        paramsOne.put("meal_names", FoodGOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodGTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodG);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestEight() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView8th.getText().toString().equals("100 NAIRA ASSORTED MEAT")) {

                        paramsOne.put("meal_names", "ASSORTEDMEAT");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodHOneBeta  = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6);
                        FoodHOne = FoodHOneBeta.substring(FoodHOneBeta.indexOf(""), FoodHOneBeta.indexOf("("));
                        FoodHTwo = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" "));

                        NoOfFoodH = FoodHOneBeta.substring(FoodHOneBeta.indexOf("(")+1,FoodHOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodHOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodHTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodH);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestNine() {


            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView9th.getText().toString().equals("50 NAIRA PONMO")) {

                        paramsOne.put("meal_names", "PONMO");
                        paramsOne.put("meal_prices", "50");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodIOneBeta  = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6);
                        FoodIOne = FoodIOneBeta.substring(FoodIOneBeta.indexOf(""), FoodIOneBeta.indexOf("("));
                        FoodITwo = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" "));

                        NoOfFoodI = FoodIOneBeta.substring(FoodIOneBeta.indexOf("(")+1,FoodIOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodIOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodITwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodI);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestNine);

    }

    public void stringRequestTen() {

            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView10th.getText().toString().equals("200 NAIRA SMALL CHICKEN")) {

                        paramsOne.put("meal_names", "SMALLCHICKEN");
                        paramsOne.put("meal_prices", "200");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodJOneBeta  = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6);
                        FoodJOne = FoodJOneBeta.substring(FoodJOneBeta.indexOf(""), FoodJOneBeta.indexOf("("));
                        FoodJTwo = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" "));

                        NoOfFoodJ = FoodJOneBeta.substring(FoodJOneBeta.indexOf("(")+1,FoodJOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodJOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodJTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodJ);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestEleven() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView11th.getText().toString().equals("300 NAIRA BIG CHICKEN")) {

                        paramsOne.put("meal_names", "BIGCHICKEN");
                        paramsOne.put("meal_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodKOneBeta  = textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6);
                        FoodKOne = FoodKOneBeta.substring(FoodKOneBeta.indexOf(""), FoodKOneBeta.indexOf("("));
                        FoodKTwo = textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" "));

                        NoOfFoodK = FoodKOneBeta.substring(FoodKOneBeta.indexOf("(")+1,FoodKOneBeta.indexOf(")"));


                        paramsOne.put("meal_names", FoodKOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodKTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodK);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestTwelve() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView12th.getText().toString().equals("200 NAIRA SMALL GOATMEAT")) {

                        paramsOne.put("meal_names", "SMALLGOATMEAT");
                        paramsOne.put("meal_prices", "200");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodLOneBeta  = textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6);
                        FoodLOne = FoodLOneBeta.substring(FoodLOneBeta.indexOf(""), FoodLOneBeta.indexOf("("));
                        FoodLTwo = textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" "));

                        NoOfFoodL = FoodLOneBeta.substring(FoodLOneBeta.indexOf("(")+1,FoodLOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodLOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodLTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodL);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestThirteen() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView13th.getText().toString().equals("300 NAIRA BIG GOATMEAT")) {

                        paramsOne.put("meal_names", "BIGGOATMEAT");
                        paramsOne.put("meal_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodMOneBeta  = textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6);
                        FoodMOne = FoodMOneBeta.substring(FoodMOneBeta.indexOf(""), FoodMOneBeta.indexOf("("));
                        FoodMTwo = textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" "));

                        NoOfFoodM = FoodMOneBeta.substring(FoodMOneBeta.indexOf("(")+1,FoodMOneBeta.indexOf(")"));


                        paramsOne.put("meal_names", FoodMOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodMTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodM);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestFourteen() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView14th.getText().toString().equals("100 NAIRA TITUS FISH")) {

                        paramsOne.put("meal_names", "TITUSFISH");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodNOneBeta  = textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6);
                        FoodNOne = FoodNOneBeta.substring(FoodNOneBeta.indexOf(""), FoodNOneBeta.indexOf("("));
                        FoodNTwo = textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" "));

                        NoOfFoodN = FoodNOneBeta.substring(FoodNOneBeta.indexOf("(")+1,FoodNOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodNOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodNTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodN);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestFifteen() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView15th.getText().toString().equals("100 NAIRA SAWA FISH")) {

                        paramsOne.put("meal_names", "SAWAFISH");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodOOneBeta  = textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6);
                        FoodOOne = FoodOOneBeta.substring(FoodOOneBeta.indexOf(""), FoodOOneBeta.indexOf("("));
                        FoodOTwo = textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" "));

                        NoOfFoodO = FoodOOneBeta.substring(FoodOOneBeta.indexOf("(")+1,FoodOOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodOOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodOTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodO);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestSixteen() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView16th.getText().toString().equals("100 NAIRA PANLA FISH")) {

                        paramsOne.put("meal_names", "PANLAFISH");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodPOneBeta  = textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6);
                        FoodPOne = FoodPOneBeta.substring(FoodPOneBeta.indexOf(""), FoodPOneBeta.indexOf("("));
                        FoodPTwo = textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" "));

                        NoOfFoodP = FoodPOneBeta.substring(FoodPOneBeta.indexOf("(")+1,FoodPOneBeta.indexOf(")"));


                        paramsOne.put("meal_names", FoodPOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodPTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodP);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestSeventeen() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView17th.getText().toString().equals("100 NAIRA MOIMOI")) {

                        paramsOne.put("meal_names", "MOIMOI");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodQOneBeta  = textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6);
                        FoodQOne = FoodQOneBeta.substring(FoodQOneBeta.indexOf(""), FoodQOneBeta.indexOf("("));
                        FoodQTwo = textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" "));

                        NoOfFoodQ = FoodQOneBeta.substring(FoodQOneBeta.indexOf("(")+1,FoodQOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodQOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodQTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodQ);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestEighteen() {



            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodROneBeta  = textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6);
                        FoodRTwo = textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodROneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodRTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestNine);


    }

    public void stringRequestNineteen() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView19th.getText().toString().equals("50 NAIRA BOILED EGG")) {

                        paramsOne.put("meal_names", "BOILEDEGG");
                        paramsOne.put("meal_prices", "50");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodSOneBeta  = textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6);
                        FoodSOne = FoodSOneBeta.substring(FoodSOneBeta.indexOf(""), FoodSOneBeta.indexOf("("));
                        FoodSTwo = textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" "));

                        NoOfFoodS = FoodSOneBeta.substring(FoodSOneBeta.indexOf("(")+1,FoodSOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodSOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodSTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodS);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTen);


    }

    public void stringRequestTwenty() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodTOneBeta  = textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6);
                        FoodTTwo = textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodTOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodTTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestTwentyOne() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodUOneBeta  = textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6);
                        FoodUTwo = textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodUOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodUTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestTwentyTwo() {


        StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            JSONObject jsonObject = jsonArray.getJSONObject(0);

                            String code = jsonObject.getString("tranc_success");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> paramsOne = new HashMap<>();

                if (textView22nd.getText().toString().equals("200 NAIRA COWLEG")) {

                    paramsOne.put("meal_names", "COWLEG");
                    paramsOne.put("meal_prices", "200");
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfPlates.getText().toString());
                    paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());
                }
                else {

                    FoodVOneBeta  = textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6);
                    FoodVOne = FoodVOneBeta.substring(FoodVOneBeta.indexOf(""), FoodVOneBeta.indexOf("("));
                    FoodVTwo = textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" "));

                    NoOfFoodS = FoodVOneBeta.substring(FoodVOneBeta.indexOf("(")+1,FoodVOneBeta.indexOf(")"));

                    paramsOne.put("meal_names", FoodVOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("meal_prices", FoodVTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfFoodS);
                    paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());

                }
                return paramsOne;
            }
        };
        MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestTen);


    }

    public void stringRequestTwentyThree() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();


                        FoodWOneBeta  = textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6);
                        FoodWTwo = textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" "));

                        paramsOne.put("meal_names", FoodWOneBeta.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodWTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestTwentyFour() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_fooditems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView24th.getText().toString().equals("100 NAIRA BREAD")) {

                        paramsOne.put("meal_names", "BREAD");
                        paramsOne.put("meal_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        FoodXOneBeta  = textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6);
                        FoodXOne = FoodXOneBeta.substring(FoodXOneBeta.indexOf(""), FoodXOneBeta.indexOf("("));
                        FoodXTwo = textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" "));

                        NoOfFoodX = FoodXOneBeta.substring(FoodXOneBeta.indexOf("(")+1,FoodXOneBeta.indexOf(")"));

                        paramsOne.put("meal_names", FoodXOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("meal_prices", FoodXTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfFoodX);
                        paramsOne.put("all_pack", BooleanInPackorInPlate.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }


                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(FoodmenuActivity.this).addToRequestQueue(stringRequestThree);

    }




    @Override
    public void respond(int ant) {
        FragmentManager manager = getFragmentManager();

        FoodpriceFragment fpf = (FoodpriceFragment) manager.findFragmentById(R.id.FragmentFoodprice);
        fpf.Datachange(ant);
    }

    @Override
    public void setName(String name) {
        ChosenfoodFragment cff = (ChosenfoodFragment) getFragmentManager().findFragmentById(R.id.FragmentChosenfood);
        cff.updateInfo(name);

        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updateInfo(name);

        Pcount.setEnabled(true);
        Purchase.setEnabled(true);
    }

    @Override
    public void setPrice(String price) {
        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updatePrice(price);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.foodactivityappbarmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.check_balance:
                break;

            case R.id.log_out:
                break;

            case R.id.auto_bio:
                break;
        }
        return false;
    }

    public void checkMyBalance(MenuItem item) {
        Bundle myMoney = getIntent().getExtras();
        myMoney.getString("");
        Snackbar CheckMyMoney = Snackbar.make(relative, "Your balance is: " + myMoney.getString("accountbalance"), Snackbar.LENGTH_LONG);
        View ColourfulMoney = CheckMyMoney.getView();
        ColourfulMoney.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSnqck));
        CheckMyMoney.setActionTextColor(Color.GREEN);
        CheckMyMoney.show();
    }

    public void AlrightImOff(MenuItem item) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Abioye = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Abioye.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert_b);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    public void autoBio(MenuItem item) {


        View view = LayoutInflater.from(FoodmenuActivity.this).inflate(R.layout.fa_userprof_background, null);


        Lenient = new AlertDialog.Builder(FoodmenuActivity.this);
        Lenient.setView(view);

        Department = view.findViewById(R.id.department);
        UserProfileAccountBalance = view.findViewById(R.id.userProfileAccountBalance);
        UserProfileName = view.findViewById(R.id.userProfileName);
        UserProfileStarLevel = view.findViewById(R.id.userProfileStarLevel);
        UserProfileSex = view.findViewById(R.id.userProfileSex);
        UserProfileImage = view.findViewById(R.id.userProfileImage);
        Level = view.findViewById(R.id.level);
        LastSeen = view.findViewById(R.id.lastSeen);

        final Bundle lenient = getIntent().getExtras();
        getUserProfileAppearance(lenient.getString("image"));


        Bundle ForthParcel = getIntent().getExtras();
        try {
            Department.setText("" + ForthParcel.getString("department") + "");
        } catch (Exception ignored) {

        }

        Bundle FifthParcel = getIntent().getExtras();
        try {
            Level.setText("" + FifthParcel.getString("level") + "");
        } catch (Exception ignored) {

        }

        Bundle SixthParcel = getIntent().getExtras();
        try {
            UserProfileAccountBalance.setText("" + SixthParcel.getString("accountbalance") + "");
        } catch (Exception ignored) {

        }

        Bundle SeventhParcel = getIntent().getExtras();
        try {
            UserProfileSex.setText("" + SeventhParcel.getString("sex") + "");
        } catch (Exception ignored) {

        }

        Bundle EightParcel = getIntent().getExtras();
        String myBirthtime = EightParcel.getString("time");
        final String justMonthNDate = myBirthtime;
        final String isToday = justMonthNDate != null ? justMonthNDate.substring(justMonthNDate.indexOf("- ") + 2) : null;


        Bundle NinthParcel = getIntent().getExtras();
        try {
            LastSeen.setText("" + NinthParcel.getString("last_seen_accept") + "");
        } catch (Exception ignored) {

        }

        Bundle TenthParcel = getIntent().getExtras();
        TenthParcel.getString("d_n_m");
        String myBirthday = TenthParcel.getString("d_n_m");

        Bundle EleventhParcel = getIntent().getExtras();
        if (Objects.equals(myBirthday, isToday)) {

            emojiRainLayout = (EmojiRainLayout) view;

//        emojiRainLayout.addEmoji(R.drawable.emoji_1_3);
//        emojiRainLayout.addEmoji(R.drawable.emoji_2_3);
//        emojiRainLayout.addEmoji(R.drawable.emoji_3_3);
//        emojiRainLayout.addEmoji(R.drawable.emoji_4_3);
//        emojiRainLayout.addEmoji(R.drawable.emoji_5_3);

            emojiRainLayout.addEmoji(R.drawable.c_happy_h);
            emojiRainLayout.addEmoji(R.drawable.c_happy_a);
            emojiRainLayout.addEmoji(R.drawable.c_happy_p);
            emojiRainLayout.addEmoji(R.drawable.c_happy_p_two);
            emojiRainLayout.addEmoji(R.drawable.c_happy_y);

            emojiRainLayout.addEmoji(R.drawable.c_happy_b);
            emojiRainLayout.addEmoji(R.drawable.c_happy_i);
            emojiRainLayout.addEmoji(R.drawable.c_happy_r);
            emojiRainLayout.addEmoji(R.drawable.c_happy_t);
            emojiRainLayout.addEmoji(R.drawable.c_happy_h_two);
            emojiRainLayout.addEmoji(R.drawable.c_happy_d);
            emojiRainLayout.addEmoji(R.drawable.c_happy_a_two);
            emojiRainLayout.addEmoji(R.drawable.c_happy_y_two);

            emojiRainLayout.stopDropping();
            emojiRainLayout.setPer(10);
            emojiRainLayout.setDuration(7200);
            emojiRainLayout.setDropDuration(4400);
            emojiRainLayout.setDropFrequency(500);

            emojiRainLayout.startDropping();

            UserProfileName.setText("Happy Birthday " + EightParcel.getString("name") + "");
            UserProfileName.setTextSize(30);

    }

        else {
            try {
                UserProfileName.setText("" + EleventhParcel.getString("name") + "");
            } catch (Exception ignored) {

            }
        }


        Bamiidele = Lenient.create();
        Bamiidele.show();
    }

    public void userProfileLayoutButton(View view) {

        Bamiidele.cancel();
    }

    private void getUserProfileAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("professor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mr")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("engineer")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mrs")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("miss")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

    }


    public void maxPlateCount(View view) {

        out = Integer.parseInt(String.valueOf(app.allinfoodcounter));

        final AlertDialog.Builder builder = new AlertDialog.Builder(FoodmenuActivity.this);

        try { final String[] whiteRing = app.Diamond;
                  builder.setItems(whiteRing, new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {

                          BooleanInPackorInPlate.setText("" + "NO" + "");


                          if (which == 0) {
                              Pcount.setText("" + "PLATE COUNT" + "");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in a plate", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                              playtcount = stringplayti;
                              NoOfPlates.setText("1");

//                              pack.setText("" + " Buying in Plate(s)" + "");
//                              pacque = pack.getText().toString();
//                              stringue = pacque;
                          }
                          if (which == 1) {
                              Pcount.setText("PLATE COUNT\n(2)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in two diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(2 * out ) + "");
                              playtcount = stringplaytii;
                              NoOfPlates.setText("2");

//                              pack.setText(" Buying in Plate(s)");
//                              pacque = pack.getText().toString();
//                              stringue = pacque;
                          }
                          if (which == 2) {
                              Pcount.setText("PLATE COUNT\n(3)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in three diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(3 * out ) + "");
                              playtcount = stringplaytiii;
                              NoOfPlates.setText("3");

//                              pack.setText("" + " Buying in Plate(s)" + "");
//                              pacque = pack.getText().toString();
//                              stringue = pacque;
                          }
                          if (which == 3) {
                              Pcount.setText("PLATE COUNT\n(4)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in four diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(4 * out ) + "");
                              playtcount = stringplaytiv;
                              NoOfPlates.setText("4");
                          }
                          if (which == 4) {
                              Pcount.setText("PLATE COUNT\n(5)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in five diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(5 * out ) + "");
                              playtcount = stringplaytv;
                              NoOfPlates.setText("5");
                          }
                          if (which == 5) {
                              Pcount.setText("PLATE COUNT\n(6)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in six diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(6 * out ) + "");
                              playtcount = stringplaytvi;
                              NoOfPlates.setText("6");
                          }
                          if (which == 6) {
                              Pcount.setText("PLATE COUNT\n(7)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seven diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(7 * out ) + "");
                              playtcount = stringplaytvii;
                              NoOfPlates.setText("7");
                          }
                          if (which == 7) {
                              Pcount.setText("PLATE COUNT\n(8)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eight diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(8 * out ) + "");
                              playtcount = stringplaytviii;
                              NoOfPlates.setText("8");
                          }
                          if (which == 8) {
                              Pcount.setText("PLATE COUNT\n(9)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nine diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(9 * out ) + "");
                              playtcount = stringplaytix;
                              NoOfPlates.setText("9");
                          }
                          if (which == 9) {
                              Pcount.setText("PLATE COUNT\n(10)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in ten diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(10 * out ) + "");
                              playtcount = stringplaytx;
                              NoOfPlates.setText("" + "10" + "");
                          }
                          if (which == 10) {
                              Pcount.setText("PLATE COUNT\n(11)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eleven diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(11 * out ) + "");
                              playtcount = stringplaytxi;
                              NoOfPlates.setText("" + "11" + "");
                          }
                          if (which == 11) {
                              Pcount.setText("PLATE COUNT\n(12)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twelve diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(12 * out ) + "");
                              playtcount = stringplaytxii;
                              NoOfPlates.setText("" + "12" + "");
                          }
                          if (which == 12) {
                              Pcount.setText("PLATE COUNT\n(13)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(13 * out ) + "");
                              playtcount = stringplaytxiii;
                              NoOfPlates.setText("" + "13" + "");
                          }
                          if (which == 13) {
                              Pcount.setText("PLATE COUNT\n(14)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fourteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(14 * out ) + "");
                              playtcount = stringplaytxiv;
                              NoOfPlates.setText("" + "14" + "");
                          }
                          if (which == 14) {
                              Pcount.setText("PLATE COUNT\n(15)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fifteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(15 * out ) + "");
                              playtcount = stringplaytxv;
                              NoOfPlates.setText("" + "15" + "");
                          }
                          if (which == 15) {
                              Pcount.setText("PLATE COUNT\n(16)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in sixteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(16 * out ) + "");
                              playtcount = stringplaytxvi;
                              NoOfPlates.setText("" + "16" + "");
                          }
                          if (which == 16) {
                              Pcount.setText("PLATE COUNT\n(17)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seventeen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(17 * out ) + "");
                              playtcount = stringplaytxvii;
                              NoOfPlates.setText("" + "17" + "");
                          }
                          if (which == 17) {
                              Pcount.setText("PLATE COUNT\n(18)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eighteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(18 * out ) + "");
                              playtcount = stringplaytxviii;
                              NoOfPlates.setText("" + "18" + "");
                          }
                          if (which == 18) {
                              Pcount.setText("PLATE COUNT\n(19)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nineteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(19 * out ) + "");
                              playtcount = stringplaytxix;
                              NoOfPlates.setText("" + "19" + "");
                          }
                          if (which == 19) {
                              Pcount.setText("PLATE COUNT\n(20)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twenty diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(20 * out ) + "");
                              playtcount = stringplaytxx;
                              NoOfPlates.setText("" + "20" + "");
                          }
                          if (which == 20) {
                              Pcount.setText("PLATE COUNT\n(21)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyone diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(21 * out ) + "");
                              playtcount = stringplaytxxi;
                              NoOfPlates.setText("" + "21" + "");
                          }
                          if (which == 21) {
                              Pcount.setText("PLATE COUNT\n(22)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentytwo diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(22 * out ) + "");
                              playtcount = stringplaytxxii;
                              NoOfPlates.setText("" + "22" + "");
                          }
                          if (which == 22) {
                              Pcount.setText("PLATE COUNT\n(23)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentythree diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(23 * out ) + "");
                              playtcount = stringplaytxxiii;
                              NoOfPlates.setText("" + "23" + "");
                          }
                          if (which == 23) {
                              Pcount.setText("PLATE COUNT\n(24)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfour diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(24 * out ) + "");
                              playtcount = stringplaytxxiv;
                              NoOfPlates.setText("" + "24" + "");
                          }
                          if (which == 24) {
                              Pcount.setText("PLATE COUNT\n(25)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfive diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(25 * out ) + "");
                              playtcount = stringplaytxxv;
                              NoOfPlates.setText("" + "25" + "");
                          }
                          if (which == 25) {
                              Pcount.setText("PLATE COUNT\n(26)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentysix diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(26 * out ) + "");
                              playtcount = stringplaytxxvi;
                              NoOfPlates.setText("" + "26" + "");
                          }
                          if (which == 26) {
                              Pcount.setText("PLATE COUNT\n(27)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyseven diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(27 * out ) + "");
                              playtcount = stringplaytxxvii;
                              NoOfPlates.setText("" + "27" + "");
                          }
                          if (which == 27) {
                              Pcount.setText("PLATE COUNT\n(28)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyeight diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(28 * out ) + "");
                              playtcount = stringplaytxxviii;
                              NoOfPlates.setText("" + "28" + "");
                          }
                          if (which == 28) {
                              Pcount.setText("PLATE COUNT\n(29)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentynine diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(29 * out ) + "");
                              playtcount = stringplaytxxix;
                              NoOfPlates.setText("" + "29" + "");
                          }
                          if (which == 29) {
                              Pcount.setText("PLATE COUNT\n(30)");
                              StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirty diff plates", Toast.LENGTH_SHORT).spinIcon();
                              CheckMyMoney.setBackgroundColor(Color.parseColor("#F48FB1"));
                              CheckMyMoney.setTextColor(Color.WHITE);
                              CheckMyMoney.show();
                              ChosenplateCounter.feetag.setText("" + Integer.toString(30 * out ) + "");
                              playtcount = stringplaytxxx;
                              NoOfPlates.setText("" + "30" + "");
                          }
                      }
                  });
        }
        catch (NullPointerException ignored) {

        }
        builder.setCancelable(true);
        Dialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Abioye = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Abioye.getString("king") + "");        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert_b);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        Bundle Abioye = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Abioye.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to Cancel your transaction? ");
        alertDialog.setIcon(R.drawable.a_alert_b);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FoodmenuActivity","onStart invoked");
        reverseAnime(OperationAnimation.BEGIN);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FoodmenuActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FoodmenuActivity", "onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FoodmenuActivity","onStop invoked");
        reverseAnime(OperationAnimation.ADJOURN);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FoodmenuActivity","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FoodmenuActivity","onDestroy invoked");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void reverseAnime(OperationAnimation bedCheck) {
        Drawable graphicsPad = AnimatedImageView.getDrawable();
        Animatable crazitivity = ((Animatable) graphicsPad);
        switch (bedCheck) {
            case BEGIN:
                crazitivity.start();
                break;
            case ADJOURN:
                crazitivity.stop();
                break;
        }
    }

}