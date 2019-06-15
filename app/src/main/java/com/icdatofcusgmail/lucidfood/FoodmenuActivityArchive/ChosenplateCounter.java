package com.icdatofcusgmail.lucidfood.FoodmenuActivityArchive;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.icdatofcusgmail.lucidfood.LucidApplication;
import com.icdatofcusgmail.lucidfood.R;

/**
 * Created by DAVID OGUNDEPO on 03/28/2017.
 *
 */

public class ChosenplateCounter extends Fragment {

    public static int balance_exceeded_checker, items_been_selected;
    public static TextView feetag;

    Spinner spinner;
    Button button, button2, button3, button4, button5, button6;

    public static int parseOne, parseTwo, parseThree, parseFour, parseFive, parseSix, parseSeven, parseEight, parseNine, parseTen, parseEleven, parseTwelve, parseThirteen, parseFourteen, parseFifteen, parseSixteen, parseSeventeen, parseEighteen, parseNineteen, parseTwenty, parseTwentyOne, parseTwentyTwo, parseTwentyThree, parseTwentyFour;
    public static String FirstSubString, SecondSubString, ThirdSubString, FourthSubString, FifthSubString, SixthSubString, SeventhSubString, EightSubString, NineSubString, TenSubString, EleventhSubString, TwelvethSubString, ThirteenthSubString, FourteenthSubString, FifteenthSubString, SixteenthSubString, SeventeenthSubString, EighteenthSubString, NineteenthSubString, TwentiethSubString, TwentyOneSubString, TwentyTwoSubString, TwentyThreeSubString, TwentyFourSubString;

    LucidApplication app;


    String PLATE_COUNT = "PLATE COUNT";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.foodmenufragment5_chosenplate_counter, container, false);

        app = LucidApplication.getInstance();


        return view;
    }

    public void updatePrice(String deductPrice) {

        int cve = Integer.parseInt(deductPrice.substring(0, deductPrice.indexOf(" N")));
        app.allinfoodcounter = app.allinfoodcounter - cve;
        feetag.setText("" + app.allinfoodcounter + "");

        FoodmenuActivity.Pcount.setText(PLATE_COUNT);
    }

    public void updateInfo(String price) {

        button = getActivity().findViewById(R.id.Istpricebutton);
        button2 = getActivity().findViewById(R.id.Secondpricebutton);
        button3 = getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = getActivity().findViewById(R.id.Fifthpricebutton);
        button6 = getActivity().findViewById(R.id.Sixthpricebutton);

        feetag = getActivity().findViewById(R.id.counter);

        feetag.setVisibility(View.VISIBLE);

        feetag.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int feetag, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int feetag) {

            }

            @Override
            public void afterTextChanged(Editable s) {



                /* <!-- Please note the below strictly requires HighSea for for crashesAdmiNes --!> */ //i.e light

                try {
                    Bundle bundle = getActivity().getIntent().getExtras();
                    items_been_selected = Integer.parseInt(String.valueOf(s));
                    balance_exceeded_checker = Integer.parseInt(String.valueOf(bundle.getString("accountbalance")));

                    if (items_been_selected > balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#B71C1C"));
                    } else if (items_been_selected < balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#000000"));
                    } else if (items_been_selected == balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#303F9F"));
                    }
                } catch (Exception ignored) {

                }
            }
        });

        String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SevenString, EightString, NineString, TenString, ElevenString, TwelveString, ThirteenString, FourteenString, FifteenString, SixteenString, SeventeenString, EighteenString, NineteenString, TwentyString, TwentyOneString, TwentyTwoString, TwentyThreeString, TwentyFourString;

        if (price.contentEquals("150 NAIRA WHITE RICE")) {
            FirstString = button.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "150 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "150 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA WHITE RICE")) {
            FirstString = button2.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "200 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "200 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA WHITE RICE")) {
            FirstString = button3.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "250 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "250 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA WHITE RICE")) {
            FirstString = button4.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "300 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "300 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("350 NAIRA WHITE RICE")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "350 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "350 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA WHITE RICE")) {
            FirstString = button6.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinfoodcounter = app.allinfoodcounter + parseOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("0", "400 NAIRA WHITE RICE");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "400 NAIRA WHITE RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FirstSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }

        if (price.contentEquals("150 NAIRA JOLLOF RICE")) {
            SecondString = button.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "150 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "150 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA JOLLOF RICE")) {
            SecondString = button2.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "200 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                   app.prev.remove("1");
                    app.prev.put("1", "200 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA JOLLOF RICE")) {
            SecondString = button3.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "250 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "250 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA JOLLOF RICE")) {
            SecondString = button4.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "300 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "300 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("350 NAIRA JOLLOF RICE")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "350 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "350 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA JOLLOF RICE")) {
            SecondString = button6.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("1", "400 NAIRA JOLLOF RICE");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "400 NAIRA JOLLOF RICE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SecondSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

            if (price.contentEquals("150 NAIRA FRIED RICE")) {
                ThirdString = button.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("2", "150 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "150 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA FRIED RICE")) {
                ThirdString = button2.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("2", "200 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "200 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }


            } else if (price.contentEquals("250 NAIRA FRIED RICE")) {
                ThirdString = button3.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("2", "250 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "250 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA FRIED RICE")) {
                ThirdString = button4.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("2", "300 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "300 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("350 NAIRA FRIED RICE")) {
                ThirdString = button5.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                   app.prev.put("2", "350 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "350 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA FRIED RICE")) {
                ThirdString = button6.getText().toString();
                ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
                parseThree = Integer.parseInt(ThirdSubString);
                if (!app.prev.containsKey("2")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("2", "400 NAIRA FRIED RICE");
                } else {
                    String val = app.prev.get("2");
                    ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(ThirdSubString) != parseThree) {
                        app.prev.remove("2");
                        app.prev.put("2", "400 NAIRA FRIED RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirdSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseThree;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("150 NAIRA VEGETABLE RICE")) {
                FourthString = button.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "150 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "150 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA VEGETABLE RICE")) {
                FourthString = button2.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "200 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "200 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("250 NAIRA VEGETABLE RICE")) {
                FourthString = button3.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "250 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "250 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA VEGETABLE RICE")) {
                FourthString = button4.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "300 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "300 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("350 NAIRA VEGETABLE RICE")) {
                FourthString = button5.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "350 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "350 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA VEGETABLE RICE")) {
                FourthString = button6.getText().toString();
                FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
                parseFour = Integer.parseInt(FourthSubString);
                if (!app.prev.containsKey("3")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("3", "400 NAIRA VEGETABLE RICE");
                } else {
                    String val = app.prev.get("3");
                    FourthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FourthSubString) != parseFour) {
                        app.prev.remove("3");
                        app.prev.put("3", "400 NAIRA VEGETABLE RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFour;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("150 NAIRA COCONUT RICE")) {
                FifthString = button.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "150 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "150 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA COCONUT RICE")) {
                FifthString = button2.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "200 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "200 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("250 NAIRA COCONUT RICE")) {
                FifthString = button3.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "250 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "250 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA COCONUT RICE")) {
                FifthString = button4.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "300 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "300 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("350 NAIRA COCONUT RICE")) {
                FifthString = button5.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "350 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "350 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA COCONUT RICE")) {
                FifthString = button6.getText().toString();
                FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
                parseFive = Integer.parseInt(FifthSubString);
                if (!app.prev.containsKey("4")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseFive;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("4", "400 NAIRA COCONUT RICE");
                } else {
                    String val = app.prev.get("4");
                    FifthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(FifthSubString) != parseFive) {
                        app.prev.remove("4");
                        app.prev.put("4", "400 NAIRA COCONUT RICE");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseFive;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("100 NAIRA SMALL BEEF")) {
                SixthString = button.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "100 NAIRA SMALL BEEF");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "100 NAIRA SMALL BEEF");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA SMALL BEEF(2)")) {
                SixthString = button2.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "200 NAIRA SMALL BEEF(2)");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "200 NAIRA SMALL BEEF(2)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA SMALL BEEF(3)")) {
                SixthString = button3.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "300 NAIRA SMALL BEEF(3)");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "300 NAIRA SMALL BEEF(3)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA SMALL BEEF(4)")) {
                SixthString = button4.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "400 NAIRA SMALL BEEF(4)");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "400 NAIRA SMALL BEEF(4)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("500 NAIRA SMALL BEEF(5)")) {
                SixthString = button5.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "500 NAIRA SMALL BEEF(5)");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "500 NAIRA SMALL BEEF(5)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("600 NAIRA SMALL BEEF(6)")) {
                SixthString = button6.getText().toString();
                SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
                parseSix = Integer.parseInt(SixthSubString);
                if (!app.prev.containsKey("5")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSix;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("5", "600 NAIRA SMALL BEEF(6)");
                } else {
                    String val = app.prev.get("5");
                    SixthSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(SixthSubString) != parseSix) {
                        app.prev.remove("5");
                        app.prev.put("5", "600 NAIRA SMALL BEEF(6)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixthSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSix;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("200 NAIRA BIG BEEF")) {
                SevenString = button.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "200 NAIRA BIG BEEF");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "200 NAIRA BIG BEEF");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA BIG BEEF(2)")) {
                SevenString = button2.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "400 NAIRA BIG BEEF(2)");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "400 NAIRA BIG BEEF(2)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("600 NAIRA BIG BEEF(3)")) {
                SevenString = button3.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "600 NAIRA BIG BEEF(3)");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "600 NAIRA BIG BEEF(3)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("800 NAIRA BIG BEEF(4)")) {
                SevenString = button4.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "800 NAIRA BIG BEEF(4)");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "800 NAIRA BIG BEEF(4)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("1000 NAIRA BIG BEEF(5)")) {
                SevenString = button5.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "1000 NAIRA BIG BEEF(5)");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "1000 NAIRA BIG BEEF(5)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("1200 NAIRA BIG BEEF(6)")) {
                SevenString = button6.getText().toString();
                SeventhSubString = SevenString.substring(SevenString.indexOf(""), SevenString.indexOf(" "));
                parseSeven = Integer.parseInt(SeventhSubString);
                if (!app.prev.containsKey("6")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("6", "1200 NAIRA BIG BEEF(6)");
                } else {
                    String val = app.prev.get("6");
                    SeventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(SeventhSubString) != parseSeven) {
                        app.prev.remove("6");
                        app.prev.put("6", "1200 NAIRA BIG BEEF(6)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventhSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseSeven;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("100 NAIRA ASSORTED MEAT")) {
                EightString = button.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "100 NAIRA ASSORTED MEAT");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "100 NAIRA ASSORTED MEAT");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA ASSORTED MEAT(2)")) {
                EightString = button2.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "200 NAIRA ASSORTED MEAT(2)");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "200 NAIRA ASSORTED MEAT(2)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA ASSORTED MEAT(3)")) {
                EightString = button3.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "300 NAIRA ASSORTED MEAT(3)");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "300 NAIRA ASSORTED MEAT(3)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA ASSORTED MEAT(4)")) {
                EightString = button4.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "400 NAIRA ASSORTED MEAT(4)");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "400 NAIRA ASSORTED MEAT(4)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("500 NAIRA ASSORTED MEAT(5)")) {
                EightString = button5.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "500 NAIRA ASSORTED MEAT(5)");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "500 NAIRA ASSORTED MEAT(5)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("600 NAIRA ASSORTED MEAT(6)")) {
                EightString = button6.getText().toString();
                EightSubString = EightString.substring(EightString.indexOf(""), EightString.indexOf(" "));
                parseEight = Integer.parseInt(EightSubString);
                if (!app.prev.containsKey("7")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseEight;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("7", "600 NAIRA ASSORTED MEAT(6)");
                } else {
                    String val = app.prev.get("7");
                    EightSubString = val.substring(0, val.indexOf("N")).trim();

                    if (Integer.parseInt(EightSubString) != parseEight) {
                        app.prev.remove("7");
                        app.prev.put("7", "600 NAIRA ASSORTED MEAT(6)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EightSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseEight;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("50 NAIRA PONMO")) {
                NineString = button.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "50 NAIRA PONMO");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "50 NAIRA PONMO");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("100 NAIRA PONMO(2)")) {
                NineString = button2.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "100 NAIRA PONMO(2)");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "100 NAIRA PONMO(2)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("150 NAIRA PONMO(3)")) {
                NineString = button3.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "150 NAIRA PONMO(3)");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "150 NAIRA PONMO(3)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("200 NAIRA PONMO(4)")) {
                NineString = button4.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "200 NAIRA PONMO(4)");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "200 NAIRA PONMO(4)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("250 NAIRA PONMO(5)")) {
                NineString = button5.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "250 NAIRA PONMO(5)");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "250 NAIRA PONMO(5)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("300 NAIRA PONMO(6)")) {
                NineString = button6.getText().toString();
                NineSubString = NineString.substring(NineString.indexOf(""), NineString.indexOf(" "));
                parseNine = Integer.parseInt(NineSubString);
                if (!app.prev.containsKey("8")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseNine;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("8", "300 NAIRA PONMO(6)");
                } else {
                    String val = app.prev.get("8");
                    NineSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(NineSubString) != parseNine) {
                        app.prev.remove("8");
                        app.prev.put("8", "300 NAIRA PONMO(6)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseNine;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }

            if (price.contentEquals("200 NAIRA SMALL CHICKEN")) {
                TenString = button.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "200 NAIRA SMALL CHICKEN");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "200 NAIRA SMALL CHICKEN");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("400 NAIRA SMALL CHICKEN(2)")) {
                TenString = button2.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "400 NAIRA SMALL CHICKEN(2)");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "400 NAIRA SMALL CHICKEN(2)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("600 NAIRA SMALL CHICKEN(3)")) {
                TenString = button3.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "600 NAIRA SMALL CHICKEN(3)");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "600 NAIRA SMALL CHICKEN(3)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("800 NAIRA SMALL CHICKEN(4)")) {
                TenString = button4.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "800 NAIRA SMALL CHICKEN(4)");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "800 NAIRA SMALL CHICKEN(4)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("1000 NAIRA SMALL CHICKEN(5)")) {
                TenString = button5.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "1000 NAIRA SMALL CHICKEN(5)");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "1000 NAIRA SMALL CHICKEN(5)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }

            } else if (price.contentEquals("1200 NAIRA SMALL CHICKEN(6)")) {
                TenString = button6.getText().toString();
                TenSubString = TenString.substring(TenString.indexOf(""), TenString.indexOf(" "));
                parseTen = Integer.parseInt(TenSubString);
                if (!app.prev.containsKey("9")) {
                    app.allinfoodcounter = app.allinfoodcounter + parseTen;
                    feetag.setText("" + app.allinfoodcounter + "");
                    app.prev.put("9", "1200 NAIRA SMALL CHICKEN(6)");
                } else {
                    String val = app.prev.get("9");
                    TenSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                    if (Integer.parseInt(TenSubString) != parseTen) {
                        app.prev.remove("9");
                        app.prev.put("9", "1200 NAIRA SMALL CHICKEN(6)");
                        app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TenSubString);
                        app.allinfoodcounter = app.allinfoodcounter + parseTen;
                        feetag.setText("" + app.allinfoodcounter + "");
                    }
                }
            }




        if (price.contentEquals("300 NAIRA BIG CHICKEN")) {
            ElevenString = button.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "300 NAIRA BIG CHICKEN");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "300 NAIRA BIG CHICKEN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA BIG CHICKEN(2)")) {
            ElevenString = button2.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "600 NAIRA BIG CHICKEN(2)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "600 NAIRA BIG CHICKEN(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("900 NAIRA BIG CHICKEN(3)")) {
            ElevenString = button3.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "900 NAIRA BIG CHICKEN(3)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "900 NAIRA BIG CHICKEN(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 NAIRA BIG CHICKEN(4)")) {
            ElevenString = button4.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "1200 NAIRA BIG CHICKEN(4)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "1200 NAIRA BIG CHICKEN(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 NAIRA BIG CHICKEN(5)")) {
            ElevenString = button5.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "1500 NAIRA BIG CHICKEN(5)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "1500 NAIRA BIG CHICKEN(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("1800 NAIRA BIG CHICKEN(6)")) {
            ElevenString = button6.getText().toString();
            EleventhSubString = ElevenString.substring(ElevenString.indexOf(""), ElevenString.indexOf(" "));
            parseEleven = Integer.parseInt(EleventhSubString);
            if (!app.prev.containsKey("10")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("10", "1800 NAIRA BIG CHICKEN(6)");
            } else {
                String val = app.prev.get("10");
                EleventhSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EleventhSubString) != parseEleven) {
                    app.prev.remove("10");
                    app.prev.put("10", "1800 NAIRA BIG CHICKEN(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EleventhSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEleven;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("200 NAIRA SMALL GOATMEAT")) {
            TwelveString = button.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "200 NAIRA SMALL GOATMEAT");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "200 NAIRA SMALL GOATMEAT");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA SMALL GOATMEAT(2)")) {
            TwelveString = button2.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "400 NAIRA SMALL GOATMEAT(2)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "400 NAIRA SMALL GOATMEAT(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA SMALL GOATMEAT(3)")) {
            TwelveString = button3.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "600 NAIRA SMALL GOATMEAT(3)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "600 NAIRA SMALL GOATMEAT(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("800 NAIRA SMALL GOATMEAT(4)")) {
            TwelveString = button4.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "800 NAIRA SMALL GOATMEAT(4)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "800 NAIRA SMALL GOATMEAT(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 NAIRA SMALL GOATMEAT(5)")) {
            TwelveString = button5.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "1000 NAIRA SMALL GOATMEAT(5)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "1000 NAIRA SMALL GOATMEAT(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("1200 NAIRA SMALL GOATMEAT(6)")) {
            TwelveString = button6.getText().toString();
            TwelvethSubString = TwelveString.substring(TwelveString.indexOf(""), TwelveString.indexOf(" "));
            parseTwelve = Integer.parseInt(TwelvethSubString);
            if (!app.prev.containsKey("11")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("11", "1200 NAIRA SMALL GOATMEAT(6)");
            } else {
                String val = app.prev.get("11");
                TwelvethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwelvethSubString) != parseTwelve) {
                    app.prev.remove("11");
                    app.prev.put("11", "1200 NAIRA SMALL GOATMEAT(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwelvethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwelve;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("300 NAIRA BIG GOATMEAT")) {
            ThirteenString = button.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "300 NAIRA BIG GOATMEAT");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "300 NAIRA BIG GOATMEAT");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA BIG GOATMEAT(2)")) {
            ThirteenString = button2.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "600 NAIRA BIG GOATMEAT(2)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "600 NAIRA BIG GOATMEAT(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }


        } else if (price.contentEquals("900 NAIRA BIG GOATMEAT(3)")) {
            ThirteenString = button3.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "900 NAIRA BIG GOATMEAT(3)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "900 NAIRA BIG GOATMEAT(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 NAIRA BIG GOATMEAT(4)")) {
            ThirteenString = button4.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "1200 NAIRA BIG GOATMEAT(4)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "1200 NAIRA BIG GOATMEAT(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1500 NAIRA BIG GOATMEAT(5)")) {
            ThirteenString = button5.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "1500 NAIRA BIG GOATMEAT(5)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "1500 NAIRA BIG GOATMEAT(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("1800 NAIRA BIG GOATMEAT(6)")) {
            ThirteenString = button6.getText().toString();
            ThirteenthSubString = ThirteenString.substring(ThirteenString.indexOf(""), ThirteenString.indexOf(" "));
            parseThirteen = Integer.parseInt(ThirteenthSubString);
            if (!app.prev.containsKey("12")) {
                app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("12", "1800 NAIRA BIG GOATMEAT(6)");
            } else {
                String val = app.prev.get("12");
                ThirteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirteenthSubString) != parseThirteen) {
                    app.prev.remove("12");
                    app.prev.put("12", "1800 NAIRA BIG GOATMEAT(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(ThirteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseThirteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA TITUS FISH")) {
            FourteenString = button.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "100 NAIRA TITUS FISH");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "100 NAIRA TITUS FISH");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA TITUS FISH(2)")) {
            FourteenString = button2.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "200 NAIRA TITUS FISH(2)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "200 NAIRA TITUS FISH(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA TITUS FISH(3)")) {
            FourteenString = button3.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "300 NAIRA TITUS FISH(3)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "300 NAIRA TITUS FISH(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA TITUS FISH(4)")) {
            FourteenString = button4.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "400 NAIRA TITUS FISH(4)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "400 NAIRA TITUS FISH(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA TITUS FISH(5)")) {
            FourteenString = button5.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "500 NAIRA TITUS FISH(5)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "500 NAIRA TITUS FISH(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("600 NAIRA TITUS FISH(6)")) {
            FourteenString = button6.getText().toString();
            FourteenthSubString = FourteenString.substring(FourteenString.indexOf(""), FourteenString.indexOf(" "));
            parseFourteen = Integer.parseInt(FourteenthSubString);
            if (!app.prev.containsKey("13")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("13", "600 NAIRA TITUS FISH(6)");
            } else {
                String val = app.prev.get("13");
                FourteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourteenthSubString) != parseFourteen) {
                    app.prev.remove("13");
                    app.prev.put("13", "600 NAIRA TITUS FISH(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FourteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFourteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA SAWA FISH")) {
            FifteenString = button.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "100 NAIRA SAWA FISH");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "100 NAIRA SAWA FISH");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA SAWA FISH(2)")) {
            FifteenString = button2.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "200 NAIRA SAWA FISH(2)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "200 NAIRA SAWA FISH(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA SAWA FISH(3)")) {
            FifteenString = button3.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "300 NAIRA SAWA FISH(3)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FifthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "300 NAIRA SAWA FISH(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA SAWA FISH(4)")) {
            FifteenString = button4.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "400 NAIRA SAWA FISH(4)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "400 NAIRA SAWA FISH(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA SAWA FISH(5)")) {
            FifteenString = button5.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "500 NAIRA SAWA FISH(5)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "500 NAIRA SAWA FISH(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("600 NAIRA SAWA FISH(6)")) {
            FifteenString = button6.getText().toString();
            FifteenthSubString = FifteenString.substring(FifteenString.indexOf(""), FifteenString.indexOf(" "));
            parseFifteen = Integer.parseInt(FifteenthSubString);
            if (!app.prev.containsKey("14")) {
                app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("14", "600 NAIRA SAWA FISH(6)");
            } else {
                String val = app.prev.get("14");
                FifteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FifteenthSubString) != parseFifteen) {
                    app.prev.remove("14");
                    app.prev.put("14", "600 NAIRA SAWA FISH(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(FifteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseFifteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA PANLA FISH")) {
            SixteenString = button.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "100 NAIRA PANLA FISH");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "100 NAIRA PANLA FISH");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

            } else if (price.contentEquals("200 NAIRA PANLA FISH(2)")) {
            SixteenString = button2.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "200 NAIRA PANLA FISH(2)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "200 NAIRA PANLA FISH(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA PANLA FISH(3)")) {
            SixteenString = button3.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "300 NAIRA PANLA FISH(3)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "300 NAIRA PANLA FISH(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA PANLA FISH(4)")) {
            SixteenString = button4.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "400 NAIRA PANLA FISH(4)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "400 NAIRA PANLA FISH(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA PANLA FISH(5)")) {
            SixteenString = button5.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "500 NAIRA PANLA FISH(5)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "500 NAIRA PANLA FISH(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("600 NAIRA PANLA FISH(6)")) {
            SixteenString = button6.getText().toString();
            SixteenthSubString = SixteenString.substring(SixteenString.indexOf(""), SixteenString.indexOf(" "));
            parseSixteen = Integer.parseInt(SixteenthSubString);
            if (!app.prev.containsKey("15")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("15", "600 NAIRA PANLA FISH(6)");
            } else {
                String val = app.prev.get("15");
                SixteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(SixteenthSubString) != parseSixteen) {
                    app.prev.remove("15");
                    app.prev.put("15", "600 NAIRA PANLA FISH(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SixteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSixteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA MOIMOI")) {
            SeventeenString = button.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "100 NAIRA MOIMOI");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "100 NAIRA MOIMOI");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA MOIMOI(2)")) {
            SeventeenString = button2.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "200 NAIRA MOIMOI(2)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "200 NAIRA MOIMOI(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA MOIMOI(3)")) {
            SeventeenString = button3.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "300 NAIRA MOIMOI(3)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "300 NAIRA MOIMOI(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA MOIMOI(4)")) {
            SeventeenString = button4.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "400 NAIRA MOIMOI(4)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "400 NAIRA MOIMOI(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA MOIMOI(5)")) {
            SeventeenString = button5.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "500 NAIRA MOIMOI(5)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "500 NAIRA MOIMOI(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("600 NAIRA MOIMOI(6)")) {
            SeventeenString = button6.getText().toString();
            SeventeenthSubString = SeventeenString.substring(SeventeenString.indexOf(""), SeventeenString.indexOf(" "));
            parseSeventeen = Integer.parseInt(SeventeenthSubString);
            if (!app.prev.containsKey("16")) {
                app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("16", "600 NAIRA MOIMOI(6)");
            } else {
                String val = app.prev.get("16");
                SeventeenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SeventeenthSubString) != parseSeventeen) {
                    app.prev.remove("16");
                    app.prev.put("16", "600 NAIRA MOIMOI(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(SeventeenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseSeventeen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("50 NAIRA PLANTAIN")) {
            EighteenString = button.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "50 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "50 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("100 NAIRA PLANTAIN")) {
            EighteenString = button2.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "100 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "100 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("150 NAIRA PLANTAIN")) {
            EighteenString = button3.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "150 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "150 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA PLANTAIN")) {
            EighteenString = button4.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "200 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "200 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA PLANTAIN")) {
            EighteenString = button5.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "250 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "250 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("300 NAIRA PLANTAIN")) {
            EighteenString = button6.getText().toString();
            EighteenthSubString = EighteenString.substring(EighteenString.indexOf(""), EighteenString.indexOf(" "));
            parseEighteen = Integer.parseInt(EighteenthSubString);
            if (!app.prev.containsKey("17")) {
                app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("17", "300 NAIRA PLANTAIN");
            } else {
                String val = app.prev.get("17");
                EighteenthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(EighteenthSubString) != parseEighteen) {
                    app.prev.remove("17");
                    app.prev.put("17", "300 NAIRA PLANTAIN");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(EighteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseEighteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("50 NAIRA BOILED EGG")) {
            NineteenString = button.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "50 NAIRA BOILED EGG");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "50 NAIRA BOILED EGG");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("100 NAIRA BOILED EGG(2)")) {
            NineteenString = button2.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "100 NAIRA BOILED EGG(2)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "100 NAIRA BOILED EGG(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("150 NAIRA BOILED EGG(3)")) {
            NineteenString = button3.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "150 NAIRA BOILED EGG(3)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "150 NAIRA BOILED EGG(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA BOILED EGG(4)")) {
            NineteenString = button4.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "200 NAIRA BOILED EGG(4)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "200 NAIRA BOILED EGG(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA BOILED EGG(5)")) {
            NineteenString = button5.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "250 NAIRA BOILED EGG(5)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "250 NAIRA BOILED EGG(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("300 NAIRA BOILED EGG(6)")) {
            NineteenString = button6.getText().toString();
            NineteenthSubString = NineteenString.substring(NineteenString.indexOf(""), NineteenString.indexOf(" "));
            parseNineteen = Integer.parseInt(NineteenthSubString);
            if (!app.prev.containsKey("18")) {
                app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("18", "300 NAIRA BOILED EGG(6)");
            } else {
                String val = app.prev.get("18");
                NineteenthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(NineteenthSubString) != parseNineteen) {
                    app.prev.remove("18");
                    app.prev.put("18", "300 NAIRA BOILED EGG(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(NineteenthSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseNineteen;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA COLESLAW")) {
            TwentyString = button.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "100 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "100 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("150 NAIRA COLESLAW")) {
            TwentyString = button2.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "150 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "150 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA COLESLAW")) {
            TwentyString = button3.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "200 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "200 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA COLESLAW")) {
            TwentyString = button4.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "250 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "250 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA COLESLAW")) {
            TwentyString = button5.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "300 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "300 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("350 NAIRA COLESLAW")) {
            TwentyString = button6.getText().toString();
            TwentiethSubString = TwentyString.substring(TwentyString.indexOf(""), TwentyString.indexOf(" "));
            parseTwenty = Integer.parseInt(TwentiethSubString);
            if (!app.prev.containsKey("19")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("19", "350 NAIRA COLESLAW");
            } else {
                String val = app.prev.get("19");
                TwentiethSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentiethSubString) != parseTwenty) {
                    app.prev.remove("19");
                    app.prev.put("19", "350 NAIRA COLESLAW");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentiethSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwenty;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }


        if (price.contentEquals("100 NAIRA WHITEBEANS")) {
            TwentyOneString = button.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "100 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "100 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("150 NAIRA WHITEBEANS")) {
            TwentyOneString = button2.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "150 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "150 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA WHITEBEANS")) {
            TwentyOneString = button3.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "200 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "200 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA WHITEBEANS")) {
            TwentyOneString = button4.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "250 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "250 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA WHITEBEANS")) {
            TwentyOneString = button5.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "300 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "300 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }
        else if (price.contentEquals("350 NAIRA WHITEBEANS")) {
            TwentyOneString = button6.getText().toString();
            TwentyOneSubString = TwentyOneString.substring(TwentyOneString.indexOf(""), TwentyOneString.indexOf(" "));
            parseTwentyOne = Integer.parseInt(TwentyOneSubString);
            if (!app.prev.containsKey("20")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("20", "350 NAIRA WHITEBEANS");
            } else {
                String val = app.prev.get("20");
                TwentyOneSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyOneSubString) != parseTwentyOne) {
                    app.prev.remove("20");
                    app.prev.put("20", "350 NAIRA WHITEBEANS");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyOneSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyOne;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        }


        if (price.contentEquals("200 NAIRA COWLEG")) {
            TwentyTwoString = button.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "200 NAIRA COWLEG");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "200 NAIRA COWLEG");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA COWLEG(2)")) {
            TwentyTwoString = button2.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "400 NAIRA COWLEG(2)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "400 NAIRA COWLEG(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA COWLEG(3)")) {
            TwentyTwoString = button3.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "600 NAIRA COWLEG(3)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "600 NAIRA COWLEG(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("800 NAIRA COWLEG(4)")) {
            TwentyTwoString = button4.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "800 NAIRA COWLEG(4)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "800 NAIRA COWLEG(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1000 NAIRA COWLEG(5)")) {
            TwentyTwoString = button5.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "1000 NAIRA COWLEG(5)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "1000 NAIRA COWLEG(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("1200 NAIRA COWLEG(6)")) {
            TwentyTwoString = button6.getText().toString();
            TwentyTwoSubString = TwentyTwoString.substring(TwentyTwoString.indexOf(""), TwentyTwoString.indexOf(" "));
            parseTwentyTwo = Integer.parseInt(TwentyTwoSubString);
            if (!app.prev.containsKey("21")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("21", "1200 NAIRA COWLEG(6)");
            } else {
                String val = app.prev.get("21");
                TwentyTwoSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyTwoSubString) != parseTwentyTwo) {
                    app.prev.remove("21");
                    app.prev.put("21", "1200 NAIRA COWLEG(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyTwoSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyTwo;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "100 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "100 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("150 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button2.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "150 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "150 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button3.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "200 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "200 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("250 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button4.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "250 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "250 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button5.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "300 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "300 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("350 NAIRA BEANS PORRIDGE")) {
            TwentyThreeString = button6.getText().toString();
            TwentyThreeSubString = TwentyThreeString.substring(TwentyThreeString.indexOf(""), TwentyThreeString.indexOf(" "));
            parseTwentyThree = Integer.parseInt(TwentyThreeSubString);
            if (!app.prev.containsKey("22")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("22", "350 NAIRA BEANS PORRIDGE");
            } else {
                String val = app.prev.get("22");
                TwentyThreeSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyThreeSubString) != parseTwentyThree) {
                    app.prev.remove("22");
                    app.prev.put("22", "350 NAIRA BEANS PORRIDGE");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyThreeSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyThree;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

        if (price.contentEquals("100 NAIRA BREAD")) {
            TwentyFourString = button.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "100 NAIRA BREAD");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "100 NAIRA BREAD");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA BREAD(2)")) {
            TwentyFourString = button2.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "200 NAIRA BREAD(2)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "200 NAIRA BREAD(2)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA BREAD(3)")) {
            TwentyFourString = button3.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "300 NAIRA BREAD(3)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "300 NAIRA BREAD(3)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA BREAD(4)")) {
            TwentyFourString = button4.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "400 NAIRA BREAD(4)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "400 NAIRA BREAD(4)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA BREAD(5)")) {
            TwentyFourString = button5.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "500 NAIRA BREAD(5)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "500 NAIRA BREAD(5)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA BREAD(6)")) {
            TwentyFourString = button6.getText().toString();
            TwentyFourSubString = TwentyFourString.substring(TwentyFourString.indexOf(""), TwentyFourString.indexOf(" "));
            parseTwentyFour = Integer.parseInt(TwentyFourSubString);
            if (!app.prev.containsKey("23")) {
                app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                feetag.setText("" + app.allinfoodcounter + "");
                app.prev.put("23", "600 NAIRA BREAD(6)");
            } else {
                String val = app.prev.get("23");
                TwentyFourSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(TwentyFourSubString) != parseTwentyFour) {
                    app.prev.remove("23");
                    app.prev.put("23", "600 NAIRA BREAD(6)");
                    app.allinfoodcounter = app.allinfoodcounter - Integer.parseInt(TwentyFourSubString);
                    app.allinfoodcounter = app.allinfoodcounter + parseTwentyFour;
                    feetag.setText("" + app.allinfoodcounter + "");
                }
            }
        }

    }
}
