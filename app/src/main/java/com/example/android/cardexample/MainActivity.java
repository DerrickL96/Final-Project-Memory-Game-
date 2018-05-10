package com.example.android.cardexample;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private ImageView image9;
    private ImageView image10;
    private ImageView image11;
    private ImageView image12;
    private ImageView image13;
    private ImageView image14;
    private ImageView image15;
    private ImageView image16;


    int random1;
    int random2;
    private TextView points;

    private Button rulesButton;
    private Button checkButton;


    private ArrayList<String> cards;
    private ArrayList<String> cards2;
    private ArrayList<String> cards3;
    private ArrayList<String> cards4;
    private ArrayList<String> cards5;
    private ArrayList<String> cards6;
    private ArrayList<String> cards7;
    private ArrayList<String> cards8;
    ImageView firstcard;
    ImageView secondcard;

    /*
    private ArrayList<String> cards9;
    private ArrayList<String> cards10;
    private ArrayList<String> cards11;
    private ArrayList<String> cards12;
    private ArrayList<String> cards13;
    private ArrayList<String> cards14;
    private ArrayList<String> cards15;
    private ArrayList<String> cards16;
   */


    private Random rand;

    private int counter = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;
    private int counter6 = 0;
    private int counter7 = 0;
    private int counter8 = 0;
    private int counter9 = 0;
    private int counter10 = 0;
    private int counter11 = 0;
    private int counter12 = 0;
    private int counter13 = 0;
    private int counter14 = 0;
    private int counter15 = 0;
    private int counter16 = 0;

    private int score = 0;
    int rand1;
    int rand2 ;
    int rand3 ;
    int rand4 ;
    int rand5;
    int rand6;
    int rand7;
    int rand8;
    int Ocounter=0;
    Drawable back;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image = findViewById(R.id.image);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);
        checkButton = findViewById(R.id.check);

        Button rulesButton = findViewById(R.id.rulesButton);

        cards = new ArrayList<String>();
        cards2 = new ArrayList<String>();
        cards3 = new ArrayList<String>();
        cards4 = new ArrayList<String>();
        cards5 = new ArrayList<String>();
        cards6 = new ArrayList<String>();
        cards7 = new ArrayList<String>();
        cards8 = new ArrayList<String>();

        points = findViewById(R.id.points);

        rand = new Random();


        AssetManager manager = getAssets();
        try {
            for (String filename : manager.list("")) {
                cards.add(filename);
                cards2.add(filename);
                cards3.add(filename);
                cards4.add(filename);
                cards5.add(filename);
                cards6.add(filename);
                cards7.add(filename);
                cards8.add(filename);
            }
        } catch (IOException e) {
            Toast.makeText(this, "BAD ASSETS!", Toast.LENGTH_LONG).show();

        }


        /**  AssetManager manager2 = getAssets();
         try {
         for (String filename : manager.list("")) {
         cards2.add(filename);
         }
         } catch (IOException e) {
         Toast.makeText(this, "BAD ASSETS!", Toast.LENGTH_LONG).show();

         }**/

        rand1 = rand.nextInt(cards.size());
        rand2 = rand.nextInt(cards2.size());
        rand3 = rand.nextInt(cards3.size());
        rand4 = rand.nextInt(cards4.size());
        rand5 = rand.nextInt(cards5.size());
        rand6 = rand.nextInt(cards6.size());
        rand7 = rand.nextInt(cards7.size());
        rand8 = rand.nextInt(cards8.size());



    }
    public void checkPressed(View v){
        String card1 = cards.get(random1).toString();
        String card2 = cards2.get(random2).toString();
        System.out.println("++++++++++" +card1);
        System.out.println("++++++++++++" +card2);
        int l = card1.length();
        int l2 = card2.length();
        if(l>6){
            card1= card1.substring(0,2);
        }
        else{
            card1 = card1.substring(0,1);
        }
        if(l2>6){
            card2= card2.substring(0,2);
        }
        else{
            card2 = card2.substring(0,1);
        }
        int c1 = Integer.parseInt(card1);
        int c2 = Integer.parseInt(card2);
        System.out.println("++++++++++" +c1);
        System.out.println("++++++++++++" +c2);
            imageComparison();
            try {
                if (c1 != c2) {
                    firstcard.setImageBitmap(BitmapFactory.decodeStream(getAssets().open("cardback.png")));
                    secondcard.setImageBitmap(BitmapFactory.decodeStream(getAssets().open("cardback.png")));
                    counter=0;
                    counter2=0;
                    counter3=0;
                    counter4=0;
                    counter5=0;
                    counter6=0;
                    counter7=0;
                    counter8=0;
                    counter9=0;
                    counter10=0;
                    counter11=0;
                    counter12=0;
                    counter13=0;
                    counter14=0;
                    counter15=0;
                    counter16=0;
                }
            }
            catch (IOException e){
                return;
            }


            Ocounter=0;

    }

    public void rulesPressed(View v) {

        Intent i = new Intent(this, rules_Activity.class);
        i.putExtra("Points:", score);
        startActivity(i);

    }



    public void imagePressed(View v) throws IOException {
        if (counter == 0 && Ocounter<=1) {
            //int r = rand.nextInt(cards.size());
            image.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards.get(rand1))));
            if(Ocounter==0){
                firstcard=image;
                random1= rand1;
            }
            else if(Ocounter==1){
                secondcard= image;
                random2 = rand1;
            }
            counter = 1;
            Ocounter++;

            // image.setOnClickListener(imageComparison2());
        }


    }

    public void imagePressed2(View v) throws IOException {
        if (counter2 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards2.size());
            image2.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards2.get(rand2))));
            if(Ocounter==0){
                firstcard=image2;
                random1 = rand2;
            }
            else if(Ocounter==1){
                secondcard= image2;
                random2 = rand2;
            }

            counter2 = 1;
            Ocounter++;
        }
    }


    public void imagePressed3(View v) throws IOException {
        if (counter3 == 0&& Ocounter<=1) {
            int r = rand.nextInt(cards3.size());
            image3.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards3.get(rand3))));
            if(Ocounter==0){
                firstcard=image3;
                random1 = rand3;
            }
            else if(Ocounter==1){
                secondcard= image3;
                random2 = rand3;
            }
            counter3 = 1;Ocounter++;
        }
    }


    public void imagePressed4(View v) throws IOException {
        if (counter4 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards4.size());
            image4.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards4.get(rand4))));
            if(Ocounter==0){
                firstcard=image4;
                random1 = rand4;
            }
            else if(Ocounter==1){
                secondcard= image4;
                random2 = rand4;
            }
            counter4 = 1;Ocounter++;
        }

    }

    public void imagePressed5(View v) throws IOException {

        if (counter5 == 0&& Ocounter<=1) {
            int r = rand.nextInt(cards5.size());
            image5.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards5.get(rand5))));
            if(Ocounter==0){
                firstcard=image5;
                random1 = rand5;
            }
            else if(Ocounter==1){
                secondcard= image5;
                random2 = rand5;
            }
            counter5 = 1;Ocounter++;
        }
    }

    public void imagePressed6(View v) throws IOException {

        if (counter6 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards6.size());
            image6.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards6.get(rand6))));
            if(Ocounter==0){
                firstcard=image6;
                random1 = rand6;
            }
            else if(Ocounter==1){
                secondcard= image6;
                random2 = rand6;
            }
            counter6 = 1;Ocounter++;
        }

    }

    public void imagePressed7(View v) throws IOException {

        if (counter7 == 0&& Ocounter<=1) {
            int r = rand.nextInt(cards7.size());
            image7.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards7.get(rand7))));
            if(Ocounter==0){
                firstcard=image7;
                random1 = rand7;
            }
            else if(Ocounter==1){
                secondcard= image7;
                random2 = rand7;
            }
            counter7 = 1;Ocounter++;
        }
    }

    public void imagePressed8(View v) throws IOException {
        if (counter8 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards8.size());
            image8.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards8.get(rand8))));
            if(Ocounter==0){
                firstcard=image8;
                random1 = rand8;
            }
            else if(Ocounter==1){
                secondcard= image8;
                random2 = rand8;
            }
            counter8 = 1;Ocounter++;
        }

    }

    public void imagePressed9(View v) throws IOException {

        if (counter9 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards.size());
            image9.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards.get(rand2))));
            if(Ocounter==0){
                firstcard=image9;
                random1 = rand2;
            }
            else if(Ocounter==1){
                secondcard= image9;
                random2 = rand2;
            }
            counter9 = 1;Ocounter++;
        }

    }

    public void imagePressed10(View v) throws IOException {

        if (counter10 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards2.size());
            image10.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards2.get(rand4))));
            if(Ocounter==0){
                firstcard=image10;
                random1 = rand4;
            }
            else if(Ocounter==1){
                secondcard= image10;
                random2 = rand4;
            }
            counter10 = 1;Ocounter++;
        }

    }

    public void imagePressed11(View v) throws IOException {

        if (counter11 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards3.size());
            image11.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards3.get(rand1))));
            if(Ocounter==0){
                firstcard=image11;
                random1 = rand1;
            }
            else if(Ocounter==1){
                secondcard= image11;
                random2 = rand1;
            }
            counter11 = 1;Ocounter++;
        }

    }

    public void imagePressed12(View v) throws IOException {

        if (counter12 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards4.size());
            image12.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards4.get(rand8))));
            if(Ocounter==0){
                firstcard=image12;
                random1 = rand8;
            }
            else if(Ocounter==1){
                secondcard= image12;
                random2 = rand8;
            }
            counter12 = 1;Ocounter++;
        }

    }

    public void imagePressed13(View v) throws IOException {

        if (counter13 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards5.size());
            image13.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards5.get(rand7))));
            if(Ocounter==0){
                firstcard=image13;
                random1 = rand7;
            }
            else if(Ocounter==1){
                secondcard= image13;
                random2 = rand7;
            }
            counter13 = 1;Ocounter++;
        }

    }


    public void imagePressed14(View v) throws IOException {
        if (counter14 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards6.size());
            image14.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards6.get(rand6))));
            if(Ocounter==0){
                firstcard=image14;
                random1 = rand6;
            }
            else if(Ocounter==1){
                secondcard= image14;
                random2 = rand6;
            }
            counter14 = 1;Ocounter++;
        }

    }

    public void imagePressed15(View v) throws IOException {

        if (counter15 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards7.size());
            image15.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards7.get(rand3))));
            if(Ocounter==0){
                firstcard=image15;
                random1 = rand3;
            }
            else if(Ocounter==1){
                secondcard= image15;
                random2 = rand3;
            }
            counter15 = 1;Ocounter++;
        }

    }

    public void imagePressed16(View v) throws IOException {

        if (counter16 == 0&& Ocounter<=1) {
            int x = rand.nextInt(cards8.size());
            image16.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(cards8.get(rand5))));
            if(Ocounter==0){
                firstcard=image16;
                random1 = rand5;
            }
            else if(Ocounter==1){
                secondcard= image16;
                random2 = rand5;
            }
            counter16 = 1;Ocounter++;

        }
    }


    public void imageComparison() {

        String im1 = image.getDrawable().toString();
        String im2 = image2.getDrawable().toString();
        String im3 = image3.getDrawable().toString();
        String im4 = image4.getDrawable().toString();
        String im5 = image5.getDrawable().toString();
        String im6 = image6.getDrawable().toString();
        String im7 = image7.getDrawable().toString();
        String im8 = image8.getDrawable().toString();
        String im9 = image9.getDrawable().toString();
        String im10 = image10.getDrawable().toString();
        String im11 = image11.getDrawable().toString();
        String im12 = image12.getDrawable().toString();
        String im13 = image13.getDrawable().toString();
        String im14 = image14.getDrawable().toString();
        String im15 = image15.getDrawable().toString();
        String im16 = image16.getDrawable().toString();
/*
        if (im1.equals(im2) || im1.equals(im3) || im1.equals(im4) || im1.equals(im5) || im1.equals(im6) || im1.equals(im7) || im1.equals(im8) || im1.equals(im9) || im1.equals(im10) || im1.equals(im11) || im1.equals(im12) || im1.equals(im13) || im1.equals(im14) || im1.equals(im15) || im1.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im2.equals(im3) || im2.equals(im4) || im2.equals(im5) || im2.equals(im6) || im2.equals(im7) || im2.equals(im8) || im2.equals(im9) || im2.equals(im10) || im2.equals(im11) || im2.equals(im12) || im2.equals(im13) || im2.equals(im14) || im2.equals(im15) || im2.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im3.equals(im4) || im3.equals(im5) || im3.equals(im6) || im3.equals(im7) || im3.equals(im8) || im3.equals(im9) || im3.equals(im10) || im3.equals(im11) || im3.equals(im12) || im3.equals(im13) || im3.equals(im14) || im3.equals(im15) || im3.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im4.equals(im5) || im4.equals(im6) || im4.equals(im7) || im4.equals(im8) || im4.equals(im9) || im4.equals(im10) || im4.equals(im11) || im4.equals(im12) || im4.equals(im13) || im4.equals(im14) || im4.equals(im15) || im4.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im5.equals(im6) || im5.equals(im7) || im5.equals(im8) || im5.equals(im9) || im5.equals(im10) || im5.equals(im11) || im5.equals(im12) || im5.equals(im13) || im5.equals(im14) || im5.equals(im15) || im5.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im6.equals(im7) || im6.equals(im8) || im6.equals(im9) || im6.equals(im10) || im6.equals(im11) || im6.equals(im12) || im6.equals(im13) || im6.equals(im14) || im6.equals(im15) || im6.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im7.equals(im8) || im7.equals(im9) || im7.equals(im10) || im7.equals(im11) || im7.equals(im12) || im7.equals(im13) || im7.equals(im14) || im7.equals(im15) || im7.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im8.equals(im9) || im8.equals(im10) || im8.equals(im11) || im8.equals(im12) || im8.equals(im13) || im8.equals(im14) || im8.equals(im15) || im8.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im9.equals(im10) || im9.equals(im11) || im9.equals(im12) || im9.equals(im13) || im9.equals(im14) || im9.equals(im15) || im9.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im10.equals(im11) || im10.equals(im12) || im10.equals(im13) || im10.equals(im14) || im10.equals(im15) || im10.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im11.equals(im12) || im11.equals(im13) || im11.equals(im14) || im11.equals(im15) || im11.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im12.equals(im13) || im12.equals(im14) || im12.equals(im15) || im12.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im13.equals(im14) || im13.equals(im15) || im13.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im14.equals(im15) || im14.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else if (im15.equals(im16)) {
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        } else {
            score -= 2;
            points.setText("Score:" + score);
            Toast.makeText(this, "Better Luck Next Time! -2 Points", Toast.LENGTH_SHORT).show();
        }
        */



        String card1 = cards.get(random1).toString();
        String card2 = cards2.get(random2).toString();
        System.out.println("++++++++++" +card1);
        System.out.println("++++++++++++" +card2);
        int l = card1.length();
        int l2 = card2.length();
        if(l>6){
            card1= card1.substring(0,2);
        }
        else{
            card1 = card1.substring(0,1);
        }
        if(l2>6){
            card2= card2.substring(0,2);
        }
        else{
            card2 = card2.substring(0,1);
        }
        int c1 = Integer.parseInt(card1);
        int c2 = Integer.parseInt(card2);
        System.out.println("++++++++++" +c1);
        System.out.println("++++++++++++" +c2);

        if(c1==c2){
            score += 10;
            points.setText("Score:" + score);
            Toast.makeText(this, "Yay! +10 Points", Toast.LENGTH_SHORT).show();
        }
        else{
            score -= 2;
            points.setText("Score:" + score);
            Toast.makeText(this, "Better Luck Next Time! -2 Points", Toast.LENGTH_SHORT).show();
        }


    }



    public void imageComparison2(){



    }






}
