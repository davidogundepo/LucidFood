package com.icdatofcusgmail.lucidfood;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.TreeMap;

/**
 * Created by DAVID OGUNDEPO on 06/02/2017.
 *
 */

public class LucidApplication extends Application {

    public  String[] Diamond;
    public Bundle sellerOruko;
    public TextView Idtext;
    public TextView Nametext;
    private static LucidApplication instance;
    public JSONArray selectedfoods;
    public JSONObject prices;

    public JSONObject stack;

    public int allinfoodcounter = 0;

    public int fifty = 50;
    public int hundred = 100;
    public int onefifty = 150;
    public int twohundred = 200;
    public int twofifty = 250;
    public int threehundred = 300;
    public int threehundredfifty = 350;
    public int fourhundred = 400;
    public int fourhundredfifty = 450;
    public int fivehundred = 500;
    public int fivehundredfifty = 550;
    public int sixhundred = 600;
    public int sixhundredfifty = 650;
    public int sevenhundred = 700;
    public int sevenhundredfifty = 750;
    public int eighthundred = 800;
    public int eighthundredfifty = 850;
    public int ninehundred = 900;
    public int ninehundredfifty = 950;
    public int onethousand = 1000;
    public int onethousandfifty = 1050;
    public int onethousandhundred = 1100;
    public int onethousandonefifty = 1150;
    public int onethousandtwohundred = 1200;
    public int onethousandtwofifty = 1250;
    public int onethousandthreehundred = 1300;
    public int onethousandthreefifty = 1350;
    public int onethousandfourhundred = 1400;
    public int onethousandfourfifty = 1450;
    public int onethousandfivehundred = 1500;


    public TreeMap<String,String> prev;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        selectedfoods = new JSONArray();
        prices = new JSONObject();
        prev = new TreeMap<>();

        stack = new JSONObject();


        JSONArray white_rice = new JSONArray();
        white_rice.add("150 NAIRA WHITE RICE");
        white_rice.add("200 NAIRA WHITE RICE");
        white_rice.add("250 NAIRA WHITE RICE");
        white_rice.add("300 NAIRA WHITE RICE");
        white_rice.add("350 NAIRA WHITE RICE");
        white_rice.add("400 NAIRA WHITE RICE");
        prices.put("White Rice",white_rice);

        JSONArray jollof_rice = new JSONArray();
        jollof_rice.add("150 NAIRA JOLLOF RICE");
        jollof_rice.add("200 NAIRA JOLLOF RICE");
        jollof_rice.add("250 NAIRA JOLLOF RICE");
        jollof_rice.add("300 NAIRA JOLLOF RICE");
        jollof_rice.add("350 NAIRA JOLLOF RICE");
        jollof_rice.add("400 NAIRA JOLLOF RICE");
        prices.put("Jollof Rice",jollof_rice);

        JSONArray fried_rice = new JSONArray();
        fried_rice.add("150 NAIRA FRIED RICE");
        fried_rice.add("200 NAIRA FRIED RICE");
        fried_rice.add("250 NAIRA FRIED RICE");
        fried_rice.add("300 NAIRA FRIED RICE");
        fried_rice.add("350 NAIRA FRIED RICE");
        fried_rice.add("400 NAIRA FRIED RICE");
        prices.put("Fried Rice",fried_rice);

        JSONArray vegetable_rice = new JSONArray();
        vegetable_rice.add("150 NAIRA VEGETABLE RICE");
        vegetable_rice.add("200 NAIRA VEGETABLE RICE");
        vegetable_rice.add("250 NAIRA VEGETABLE RICE");
        vegetable_rice.add("300 NAIRA VEGETABLE RICE");
        vegetable_rice.add("350 NAIRA VEGETABLE RICE");
        vegetable_rice.add("400 NAIRA VEGETABLE RICE");
        prices.put("Vegetable Rice",vegetable_rice);

        JSONArray coconut_rice = new JSONArray();
        coconut_rice.add("150 NAIRA COCONUT RICE");
        coconut_rice.add("200 NAIRA COCONUT RICE");
        coconut_rice.add("250 NAIRA COCONUT RICE");
        coconut_rice.add("300 NAIRA COCONUT RICE");
        coconut_rice.add("350 NAIRA COCONUT RICE");
        coconut_rice.add("400 NAIRA COCONUT RICE");
        prices.put("Coconut Rice",coconut_rice);

        JSONArray small_beef = new JSONArray();
        small_beef.add("100 NAIRA SMALL BEEF");
        small_beef.add("200 NAIRA SMALL BEEF(2)");
        small_beef.add("300 NAIRA SMALL BEEF(3)");
        small_beef.add("400 NAIRA SMALL BEEF(4)");
        small_beef.add("500 NAIRA SMALL BEEF(5)");
        small_beef.add("600 NAIRA SMALL BEEF(6)");
        prices.put("Small Beef",small_beef);

        JSONArray big_beef = new JSONArray();
        big_beef.add("200 NAIRA BIG BEEF");
        big_beef.add("400 NAIRA BIG BEEF(2)");
        big_beef.add("600 NAIRA BIG BEEF(3)");
        big_beef.add("800 NAIRA BIG BEEF(4)");
        big_beef.add("1000 NAIRA BIG BEEF(5)");
        big_beef.add("1200 NAIRA BIG BEEF(6)");
        prices.put("Big Beef",big_beef);

        JSONArray assorted_meat = new JSONArray();
        assorted_meat.add("100 NAIRA ASSORTED MEAT");
        assorted_meat.add("200 NAIRA ASSORTED MEAT(2)");
        assorted_meat.add("300 NAIRA ASSORTED MEAT(3)");
        assorted_meat.add("400 NAIRA ASSORTED MEAT(4)");
        assorted_meat.add("500 NAIRA ASSORTED MEAT(5)");
        assorted_meat.add("600 NAIRA ASSORTED MEAT(6)");
        prices.put("Assorted Meat",assorted_meat);

        JSONArray ponmo = new JSONArray();
        ponmo.add("50 NAIRA PONMO");
        ponmo.add("100 NAIRA PONMO(2)");
        ponmo.add("150 NAIRA PONMO(3)");
        ponmo.add("200 NAIRA PONMO(4)");
        ponmo.add("250 NAIRA PONMO(5)");
        ponmo.add("300 NAIRA PONMO(6)");
        prices.put("Ponmo",ponmo);

        JSONArray small_chicken = new JSONArray();
        small_chicken.add("200 NAIRA SMALL CHICKEN");
        small_chicken.add("400 NAIRA SMALL CHICKEN(2)");
        small_chicken.add("600 NAIRA SMALL CHICKEN(3)");
        small_chicken.add("800 NAIRA SMALL CHICKEN(4)");
        small_chicken.add("1000 NAIRA SMALL CHICKEN(5)");
        small_chicken.add("1200 NAIRA SMALL CHICKEN(6)");
        prices.put("Small Chicken",small_chicken);

        JSONArray big_chicken = new JSONArray();
        big_chicken.add("300 NAIRA BIG CHICKEN");
        big_chicken.add("600 NAIRA BIG CHICKEN(2)");
        big_chicken.add("900 NAIRA BIG CHICKEN(3)");
        big_chicken.add("1200 NAIRA BIG CHICKEN(4)");
        big_chicken.add("1500 NAIRA BIG CHICKEN(5)");
        big_chicken.add("1800 NAIRA BIG CHICKEN(6)");
        prices.put("Big Chicken",big_chicken);

        JSONArray small_goatmeat = new JSONArray();
        small_goatmeat.add("200 NAIRA SMALL GOATMEAT");
        small_goatmeat.add("400 NAIRA SMALL GOATMEAT(2)");
        small_goatmeat.add("600 NAIRA SMALL GOATMEAT(3)");
        small_goatmeat.add("800 NAIRA SMALL GOATMEAT(4)");
        small_goatmeat.add("1000 NAIRA SMALL GOATMEAT(5)");
        small_goatmeat.add("1200 NAIRA SMALL GOATMEAT(6)");
        prices.put("Small GoatMeat",small_goatmeat);

        JSONArray big_goatmeat = new JSONArray();
        big_goatmeat.add("300 NAIRA BIG GOATMEAT");
        big_goatmeat.add("600 NAIRA BIG GOATMEAT(2)");
        big_goatmeat.add("900 NAIRA BIG GOATMEAT(3)");
        big_goatmeat.add("1200 NAIRA BIG GOATMEAT(4)");
        big_goatmeat.add("1500 NAIRA BIG GOATMEAT(5)");
        big_goatmeat.add("1800 NAIRA BIG GOATMEAT(6)");
        prices.put("Big GoatMeat",big_goatmeat);

        JSONArray titus_fish = new JSONArray();
        titus_fish.add("100 NAIRA TITUS FISH");
        titus_fish.add("200 NAIRA TITUS FISH(2)");
        titus_fish.add("300 NAIRA TITUS FISH(3)");
        titus_fish.add("400 NAIRA TITUS FISH(4)");
        titus_fish.add("500 NAIRA TITUS FISH(5)");
        titus_fish.add("600 NAIRA TITUS FISH(6)");
        prices.put("Titus Fish",titus_fish);

        JSONArray sawa_fish = new JSONArray();
        sawa_fish.add("100 NAIRA SAWA FISH");
        sawa_fish.add("200 NAIRA SAWA FISH(2)");
        sawa_fish.add("300 NAIRA SAWA FISH(3)");
        sawa_fish.add("400 NAIRA SAWA FISH(4)");
        sawa_fish.add("500 NAIRA SAWA FISH(5)");
        sawa_fish.add("600 NAIRA SAWA FISH(6)");
        prices.put("Sawa Fish",sawa_fish);

        JSONArray panla_fish = new JSONArray();
        panla_fish.add("100 NAIRA PANLA FISH");
        panla_fish.add("200 NAIRA PANLA FISH(2)");
        panla_fish.add("300 NAIRA PANLA FISH(3)");
        panla_fish.add("400 NAIRA PANLA FISH(4)");
        panla_fish.add("500 NAIRA PANLA FISH(5)");
        panla_fish.add("600 NAIRA PANLA FISH(6)");
        prices.put("Panla Fish",panla_fish);

        JSONArray moimoi = new JSONArray();
        moimoi.add("100 NAIRA MOIMOI");
        moimoi.add("200 NAIRA MOIMOI(2)");
        moimoi.add("300 NAIRA MOIMOI(3)");
        moimoi.add("400 NAIRA MOIMOI(4)");
        moimoi.add("500 NAIRA MOIMOI(5)");
        moimoi.add("600 NAIRA MOIMOI(6)");
        prices.put("Moi Moi",moimoi);

        JSONArray plantain = new JSONArray();
        plantain.add("50 NAIRA PLANTAIN");
        plantain.add("100 NAIRA PLANTAIN");
        plantain.add("150 NAIRA PLANTAIN");
        plantain.add("200 NAIRA PLANTAIN");
        plantain.add("250 NAIRA PLANTAIN");
        plantain.add("300 NAIRA PLANTAIN");
        prices.put("Plantain",plantain);

        JSONArray boiled_egg = new JSONArray();
        boiled_egg.add("50 NAIRA BOILED EGG");
        boiled_egg.add("100 NAIRA BOILED EGG(2)");
        boiled_egg.add("150 NAIRA BOILED EGG(3)");
        boiled_egg.add("200 NAIRA BOILED EGG(4)");
        boiled_egg.add("250 NAIRA BOILED EGG(5)");
        boiled_egg.add("300 NAIRA BOILED EGG(6)");
        prices.put("Boiled Egg",boiled_egg);

        JSONArray coleslaw = new JSONArray();
        coleslaw.add("100 NAIRA COLESLAW");
        coleslaw.add("150 NAIRA COLESLAW");
        coleslaw.add("200 NAIRA COLESLAW");
        coleslaw.add("250 NAIRA COLESLAW");
        coleslaw.add("300 NAIRA COLESLAW");
        coleslaw.add("350 NAIRA COLESLAW");
        prices.put("Coleslaw",coleslaw);

        JSONArray white_beans = new JSONArray();
        white_beans.add("100 NAIRA WHITEBEANS");
        white_beans.add("150 NAIRA WHITEBEANS");
        white_beans.add("200 NAIRA WHITEBEANS");
        white_beans.add("250 NAIRA WHITEBEANS");
        white_beans.add("300 NAIRA WHITEBEANS");
        white_beans.add("350 NAIRA WHITEBEANS");
        prices.put("WhiteBeans",white_beans);

        JSONArray cowleg = new JSONArray();
        cowleg.add("200 NAIRA COWLEG");
        cowleg.add("400 NAIRA COWLEG(2)");
        cowleg.add("600 NAIRA COWLEG(3)");
        cowleg.add("800 NAIRA COWLEG(4)");
        cowleg.add("1000 NAIRA COWLEG(5)");
        cowleg.add("1200 NAIRA COWLEG(6)");
        prices.put("Cowleg",cowleg);

        JSONArray beans_porridge = new JSONArray();
        beans_porridge.add("100 NAIRA BEANS PORRIDGE");
        beans_porridge.add("150 NAIRA BEANS PORRIDGE");
        beans_porridge.add("200 NAIRA BEANS PORRIDGE");
        beans_porridge.add("250 NAIRA BEANS PORRIDGE");
        beans_porridge.add("300 NAIRA BEANS PORRIDGE");
        beans_porridge.add("350 NAIRA BEANS PORRIDGE");
        prices.put("Beans Porridge",beans_porridge);

        JSONArray bread = new JSONArray();
        bread.add("100 NAIRA BREAD");
        bread.add("200 NAIRA BREAD(2)");
        bread.add("300 NAIRA BREAD(3)");
        bread.add("400 NAIRA BREAD(4)");
        bread.add("500 NAIRA BREAD(5)");
        bread.add("600 NAIRA BREAD(6)");
        prices.put("Bread",bread);





    }



    public static LucidApplication getInstance(){
        return instance;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }

    @Override
    public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.registerOnProvideAssistDataListener(callback);
    }

    @Override
    public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.unregisterOnProvideAssistDataListener(callback);
    }
}
