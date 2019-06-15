package com.icdatofcusgmail.lucidfood.FoodmenuActivityArchive;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.icdatofcusgmail.lucidfood.LucidApplication;
import com.icdatofcusgmail.lucidfood.R;

/**
 * Created by DAVID OGUNDEPO on 03/28/2017.
 *
 */

public class ChosenfoodFragment extends Fragment {

    TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th;
    ImageButton imageButton, imageButton2nd, imageButton3rd, imageButton4th, imageButton5th, imageButton6th, imageButton7th, imageButton8th, imageButton9th, imageButton10th, imageButton11th, imageButton12th, imageButton13th, imageButton14th, imageButton15th, imageButton16th, imageButton17th, imageButton18th, imageButton19th, imageButton20th, imageButton21st, imageButton22nd, imageButton23rd, imageButton24th;
    OnPriceSetListener onPriceSetListener;

    LucidApplication app;

    String PLATE_COUNT = "PLATE COUNT";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.foodmenufragment3_chosenfood, container, false);

        app = LucidApplication.getInstance();

        textView = (Button) view.findViewById(R.id.Istchosenbutton);
        textView.setVisibility(View.GONE);
        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
        textView2nd.setVisibility(View.GONE);
        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
        textView3rd.setVisibility(View.GONE);
        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
        textView4th.setVisibility(View.GONE);
        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
        textView5th.setVisibility(View.GONE);
        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
        textView6th.setVisibility(View.GONE);
        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
        textView7th.setVisibility(View.GONE);
        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
        textView8th.setVisibility(View.GONE);
        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
        textView9th.setVisibility(View.GONE);
        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
        textView10th.setVisibility(View.GONE);
        textView11th = (Button) view.findViewById(R.id.Eleventhchosenbutton);
        textView11th.setVisibility(View.GONE);
        textView12th = (Button) view.findViewById(R.id.Twelvthchosenbutton);
        textView12th.setVisibility(View.GONE);
        textView13th = (Button) view.findViewById(R.id.Thirteenthchosenbutton);
        textView13th.setVisibility(View.GONE);
        textView14th = (Button) view.findViewById(R.id.Fourteenthchosenbutton);
        textView14th.setVisibility(View.GONE);
        textView15th = (Button) view.findViewById(R.id.Fifteenthchosenbutton);
        textView15th.setVisibility(View.GONE);
        textView16th = (Button) view.findViewById(R.id.Sixteenthchosenbutton);
        textView16th.setVisibility(View.GONE);
        textView17th = (Button) view.findViewById(R.id.Seventeenthchosenbutton);
        textView17th.setVisibility(View.GONE);
        textView18th = (Button) view.findViewById(R.id.Eighteenthchosenbutton);
        textView18th.setVisibility(View.GONE);
        textView19th = (Button) view.findViewById(R.id.Nineteenthchosenbutton);
        textView19th.setVisibility(View.GONE);
        textView20th = (Button) view.findViewById(R.id.Twentiethchosenbutton);
        textView20th.setVisibility(View.GONE);
        textView21st = (Button) view.findViewById(R.id.TwentyIstchosenbutton);
        textView21st.setVisibility(View.GONE);
        textView22nd = (Button) view.findViewById(R.id.TwentySecondchosenbutton);
        textView22nd.setVisibility(View.GONE);
        textView23rd = (Button) view.findViewById(R.id.TwentyThirdchosenbutton);
        textView23rd.setVisibility(View.GONE);
        textView24th = (Button) view.findViewById(R.id.TwentyFourchosenbutton);
        textView24th.setVisibility(View.GONE);



        imageButton = view.findViewById(R.id.Istchosendeletebutton);
        imageButton.setVisibility(View.GONE);
        imageButton2nd = view.findViewById(R.id.Secondchosendeletebutton);
        imageButton2nd.setVisibility(View.GONE);
        imageButton3rd = view.findViewById(R.id.Thirdchosendeletebutton);
        imageButton3rd.setVisibility(View.GONE);
        imageButton4th = view.findViewById(R.id.Fourthchosendeletebutton);
        imageButton4th.setVisibility(View.GONE);
        imageButton5th = view.findViewById(R.id.Fifthchosendeletebutton);
        imageButton5th.setVisibility(View.GONE);
        imageButton6th = view.findViewById(R.id.Sixthchosendeletebutton);
        imageButton6th.setVisibility(View.GONE);
        imageButton7th = view.findViewById(R.id.Seventhchosendeletebutton);
        imageButton7th.setVisibility(View.GONE);
        imageButton8th = view.findViewById(R.id.Eightchosendeletebutton);
        imageButton8th.setVisibility(View.GONE);
        imageButton9th = view.findViewById(R.id.Ninthchosendeleltebutton);
        imageButton9th.setVisibility(View.GONE);
        imageButton10th = view.findViewById(R.id.Tenthchosendeletebutton);
        imageButton10th.setVisibility(View.GONE);
        imageButton11th = view.findViewById(R.id.Eleventhchosendeleltebutton);
        imageButton11th.setVisibility(View.GONE);
        imageButton12th = view.findViewById(R.id.Twelvthchosendeletebutton);
        imageButton12th.setVisibility(View.GONE);
        imageButton13th = view.findViewById(R.id.Thirteenthchosendeleltebutton);
        imageButton13th.setVisibility(View.GONE);
        imageButton14th = view.findViewById(R.id.Fourteenthchosendeletebutton);
        imageButton14th.setVisibility(View.GONE);
        imageButton15th = view.findViewById(R.id.Fifteenthchosendeleltebutton);
        imageButton15th.setVisibility(View.GONE);
        imageButton16th = view.findViewById(R.id.Sixteenthchosendeletebutton);
        imageButton16th.setVisibility(View.GONE);
        imageButton17th = view.findViewById(R.id.Seventeenthchosendeleltebutton);
        imageButton17th.setVisibility(View.GONE);
        imageButton18th = view.findViewById(R.id.Eighteenthchosendeletebutton);
        imageButton18th.setVisibility(View.GONE);
        imageButton19th = view.findViewById(R.id.Nineteenthchosendeleltebutton);
        imageButton19th.setVisibility(View.GONE);
        imageButton20th = view.findViewById(R.id.Twentiethchosendeletebutton);
        imageButton20th.setVisibility(View.GONE);
        imageButton21st = view.findViewById(R.id.TwentyIstchosendeletebutton);
        imageButton21st.setVisibility(View.GONE);
        imageButton22nd = view.findViewById(R.id.TwentySecondchosendeletebutton);
        imageButton22nd.setVisibility(View.GONE);
        imageButton23rd = view.findViewById(R.id.TwentyThirdchosendeletebutton);
        imageButton23rd.setVisibility(View.GONE);
        imageButton24th = view.findViewById(R.id.TwentyFourchosendeletebutton);
        imageButton24th.setVisibility(View.GONE);



        return view;
    }

    interface OnPriceSetListener {
        void setPrice(String price);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onPriceSetListener = (OnPriceSetListener) activity;
        } catch (Exception ignored) {
        }
    }

    public void updateInfo(String name) {

        imageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setVisibility(View.GONE);
            imageButton.setVisibility(View.GONE);
            FoodmenuActivity.Pcount.setEnabled(false);
            FoodmenuActivity.Purchase.setEnabled(false);
            String Price = textView.getText().toString();
            onPriceSetListener.setPrice(Price);
            app.prev.remove("0");
            if (!imageButton.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                    || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                    || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                    || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                    || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                    || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                    || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                    || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                FoodmenuActivity.Pcount.setEnabled(true);
                FoodmenuActivity.Purchase.setEnabled(true);
            }
        }
        });

        imageButton2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2nd.setVisibility(View.GONE);
                imageButton2nd.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView2nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("1");
                if (!imageButton2nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3rd.setVisibility(View.GONE);
                imageButton3rd.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView3rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("2");
                if (!imageButton3rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4th.setVisibility(View.GONE);
                imageButton4th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView4th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("3");
                if (!imageButton4th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5th.setVisibility(View.GONE);
                imageButton5th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView5th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("4");
                if (!imageButton5th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6th.setVisibility(View.GONE);
                imageButton6th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView6th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("5");
                if (!imageButton6th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView7th.setVisibility(View.GONE);
                imageButton7th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView7th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("6");
                if (!imageButton7th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton8th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8th.setVisibility(View.GONE);
                imageButton8th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView8th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("7");
                if (!imageButton8th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView9th.setVisibility(View.GONE);
                imageButton9th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView9th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("8");
                if (!imageButton9th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton10th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView10th.setVisibility(View.GONE);
                imageButton10th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView10th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("9");
                if (!imageButton10th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton11th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView11th.setVisibility(View.GONE);
                imageButton11th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView11th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("10");
                if (!imageButton11th.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView12th.setVisibility(View.GONE);
                imageButton12th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView12th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("11");
                if (!imageButton12th.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton2nd.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton13th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView13th.setVisibility(View.GONE);
                imageButton13th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView13th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("12");
                if (!imageButton13th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton3rd.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton14th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView14th.setVisibility(View.GONE);
                imageButton14th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView14th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("13");
                if (!imageButton14th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton4th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton15th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView15th.setVisibility(View.GONE);
                imageButton15th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView15th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("14");
                if (!imageButton15th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton5th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton16th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView16th.setVisibility(View.GONE);
                imageButton16th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView16th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("15");
                if (!imageButton16th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton17th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView17th.setVisibility(View.GONE);
                imageButton17th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView17th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("16");
                if (!imageButton17th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton7th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton18th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18th.setVisibility(View.GONE);
                imageButton18th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView18th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("17");
                if (!imageButton18th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton8th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton19th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView19th.setVisibility(View.GONE);
                imageButton19th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView19th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("18");
                if (!imageButton19th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton9th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton20th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView20th.setVisibility(View.GONE);
                imageButton20th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView20th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("19");
                if (!imageButton20th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });



        imageButton21st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView21st.setVisibility(View.GONE);
                imageButton21st.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView21st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("20");
                if (!imageButton21st.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        imageButton22nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView22nd.setVisibility(View.GONE);
                imageButton22nd.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView22nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("21");
                if (!imageButton22nd.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton21st.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        imageButton23rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView23rd.setVisibility(View.GONE);
                imageButton23rd.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView23rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("22");
                if (!imageButton23rd.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton21st.isShown() || imageButton22nd.isShown() || imageButton24th.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        imageButton24th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView24th.setVisibility(View.GONE);
                imageButton24th.setVisibility(View.GONE);
                FoodmenuActivity.Pcount.setEnabled(false);
                FoodmenuActivity.Purchase.setEnabled(false);
                String Price = textView24th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("23");
                if (!imageButton24th.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton21st.isShown() || imageButton22nd.isShown() || imageButton23rd.isShown()) {
                    FoodmenuActivity.Pcount.setEnabled(true);
                    FoodmenuActivity.Purchase.setEnabled(true);
                }
            }
        });









        if (name.contentEquals("150 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA WHITE RICE")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA JOLLOF RICE")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("350 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA FRIED RICE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA VEGETABLE RICE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("150 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA COCONUT RICE")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA SMALL BEEF")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA SMALL BEEF(2)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA SMALL BEEF(3)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA SMALL BEEF(4)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA SMALL BEEF(5)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA SMALL BEEF(6)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("200 NAIRA BIG BEEF")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BIG BEEF(2)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG BEEF(3)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA BIG BEEF(4)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG BEEF(5)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG BEEF(6)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }


        if (name.contentEquals("100 NAIRA ASSORTED MEAT")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA ASSORTED MEAT(2)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA ASSORTED MEAT(3)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA ASSORTED MEAT(4)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA ASSORTED MEAT(5)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA ASSORTED MEAT(6)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("50 NAIRA PONMO")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("100 NAIRA PONMO(2)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA PONMO(3)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PONMO(4)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA PONMO(5)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PONMO(6)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("200 NAIRA SMALL CHICKEN")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL CHICKEN(2)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL CHICKEN(3)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL CHICKEN(4)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA SMALL CHICKEN(5)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL CHICKEN(6)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 NAIRA BIG CHICKEN")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG CHICKEN(2)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG CHICKEN(3)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG CHICKEN(4)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG CHICKEN(5)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG CHICKEN(6)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("200 NAIRA SMALL GOATMEAT")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL GOATMEAT(2)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL GOATMEAT(3)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL GOATMEAT(4)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA SMALL GOATMEAT(5)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL GOATMEAT(6)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("300 NAIRA BIG GOATMEAT")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG GOATMEAT(2)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG GOATMEAT(3)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG GOATMEAT(4)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG GOATMEAT(5)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG GOATMEAT(6)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA TITUS FISH")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA TITUS FISH(2)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA TITUS FISH(3)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA TITUS FISH(4)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA TITUS FISH(5)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA TITUS FISH(6)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA SAWA FISH")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA SAWA FISH(2)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA SAWA FISH(3)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SAWA FISH(4)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SAWA FISH(5)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SAWA FISH(6)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA PANLA FISH")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PANLA FISH(2)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PANLA FISH(3)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PANLA FISH(4)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PANLA FISH(5)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PANLA FISH(6)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA MOIMOI")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA MOIMOI(2)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA MOIMOI(3)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA MOIMOI(4)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA MOIMOI(5)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA MOIMOI(6)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("50 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("100 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("150 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("200 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("250 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA PLANTAIN")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("50 NAIRA BOILED EGG")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("100 NAIRA BOILED EGG(2)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA BOILED EGG(3)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BOILED EGG(4)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA BOILED EGG(5)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BOILED EGG(6)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA COLESLAW")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA WHITEBEANS")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("200 NAIRA COWLEG")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA COWLEG(2)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA COWLEG(3)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA COWLEG(4)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA COWLEG(5)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA COWLEG(6)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("250 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("350 NAIRA BEANS PORRIDGE")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }

        if (name.contentEquals("100 NAIRA BREAD")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BREAD(2)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BREAD(3)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BREAD(4)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA BREAD(5)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BREAD(6)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        }





        FoodmenuActivity.Pcount.setText(PLATE_COUNT);
    }
}
