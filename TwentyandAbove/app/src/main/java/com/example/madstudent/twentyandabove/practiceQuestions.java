package com.example.madstudent.twentyandabove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class practiceQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_practice_questions);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();


        // english question 1

        TextView revealAnswer = (TextView) findViewById(R.id.question0);
        switch (view.getId()) {
            case R.id.radio0:
                if (checked)
                    revealAnswer.setText("Right! It provides the best punctuation for the underlined portion.");
                break;
            case R.id.radio1:
                if (checked)
                    revealAnswer.setText("Wrong. The first comma after 'waiting' is not necessary.");
                break;
            case R.id.radio2:
                if (checked)
                    revealAnswer.setText("Wrong. The appropriate punctuation after 'door' should be a semicolon and not a comma.");
                break;
            case R.id.radio3:
                if (checked)
                    revealAnswer.setText("Wrong. The semicolon is missing after the word 'door'.");
        }

        // english question 2

        revealAnswer = (TextView) findViewById(R.id.question1);
        switch (view.getId()) {
            case R.id.radio4:
                if (checked)
                    revealAnswer.setText("Wrong. The plural verb 'are' does not agree with the singular subject 'smile'.");
                break;
            case R.id.radio5:
                if (checked)
                    revealAnswer.setText("Right! It has the appropriate subject-verb agreement and results in a complete sentence.");
                break;
            case R.id.radio6:
                if (checked)
                    revealAnswer.setText("Wrong. The plural verb 'were' does not agree with the singular subject 'smile'.");
                break;
            case R.id.radio7:
                if (checked)
                    revealAnswer.setText("Wrong. Omitting the verb would result in a sentence fragment.");
        }

        // english question 3

        revealAnswer = (TextView) findViewById(R.id.question2);
        switch (view.getId()) {
            case R.id.radio8:
                if (checked)
                    revealAnswer.setText("Wrong. The phrase 'more richer and more powerful' is a comparative adjective form, and in this context, the superlative is required.");
                break;
            case R.id.radio9:
                if (checked)
                    revealAnswer.setText("Wrong. The phrase 'one of the richest and most powerful' does not agree with the singular noun 'empire'.");
                break;
            case R.id.radio10:
                if (checked)
                    revealAnswer.setText("Right! The superlative form is needed because the comparison involves more than two items. The writer compares the Incan civilization with all of the different peoples of South America.");
                break;
            case R.id.radio11:
                if (checked)
                    revealAnswer.setText("The phrase 'more richer and more powerful' is a comparative adjective form, and in this context, the superlative is required.");
        }

        // english question 4

        revealAnswer = (TextView) findViewById(R.id.question4);
        switch (view.getId()) {
            case R.id.radio16:
                if (checked)
                    revealAnswer.setText("Right! These 'paintings' refer to the intricate mosaics that line some of the basilica's dome, so they are not actual paintings. By using quotation marks, the writer signals the reader that the mosaics resemble paintings.");
                break;
            case R.id.radio17:
                if (checked)
                    revealAnswer.setText("Wrong. The  mosaics were already described as 'intricate'.");
                break;
            case R.id.radio18:
                if (checked)
                    revealAnswer.setText("Wrong. Although the mosaics may have been carefully put together, this is not the writer's reason for putting quotation marks around the word paintings. By using quotation marks, the writer signals the reader that the mosaics resemble paintings; they are not actual paintings.");
                break;
            case R.id.radio19:
                if (checked)
                    revealAnswer.setText("Wrong. There is no information in this sentence that suggests that the mosaics are atypical.");
        }


        // math question 1

        revealAnswer = (TextView) findViewById(R.id.question5);
        switch (view.getId()) {
            case R.id.radio20:
                if (checked)
                    revealAnswer.setText("Wrong. Did you divide 2,727 by 27 correctly? Check your calculations.");
                break;
            case R.id.radio21:
                if (checked)
                    revealAnswer.setText("Wrong. You probably multiplied 27 and 4.04. However, this gives milse per gallon times cost per gallon, not the cost of gas for the trip.");
                break;
            case R.id.radio22:
                if (checked)
                    revealAnswer.setText("Wrong. You might have tried multiplying 27 by 4.4. Find the number of gallons of gas needed for 2,727 miles.");
                break;
            case R.id.radio23:
                if (checked)
                    revealAnswer.setText("Right! If you divide 2,727 miles by 27 miles per gallon you will get the number of gallons (101). Then multiply the number of gallons by the cost per gallon. This gives the cost of gas for the car to travel 2,727 miles.");
                break;
            case R.id.radio24:
                if (checked)
                    revealAnswer.setText("Wrong. You probably found the number of gallons of gas. However, you still need to multiply by 4.04.");
        }

        // math question 2

        revealAnswer = (TextView) findViewById(R.id.question6);
        switch (view.getId()) {
            case R.id.radio25:
                if (checked)
                    revealAnswer.setText("Wrong. Did you remember that 2x - 3x = -x and -4 - 3 = -7 ?");
                break;
            case R.id.radio26:
                if (checked)
                    revealAnswer.setText("Wrong. Possibly you tried to add 2x and 3x and 3 and -4.");
                break;
            case R.id.radio27:
                if (checked)
                    revealAnswer.setText("Wrong. Did you combine 3 and -4 by adding them together?");
                break;
            case R.id.radio28:
                if (checked)
                    revealAnswer.setText("Wrong. You need to subtract 2x and 4 to each side of the equation.");
                break;
            case R.id.radio29:
                if (checked)
                    revealAnswer.setText("Right! First subtract 2x from each side, then add 4.");
        }

        // math question 3

        revealAnswer = (TextView) findViewById(R.id.question7);
        switch (view.getId()) {
            case R.id.radio30:
                if (checked)
                    revealAnswer.setText("Wrong. You found the second least common factor.");
                break;
            case R.id.radio31:
                if (checked)
                    revealAnswer.setText("Wrong. This is a common factor, but not the greatest common factor.");
                break;
            case R.id.radio32:
                if (checked)
                    revealAnswer.setText("Wrong. This is a common factor, but not the greatest common factor.");
                break;
            case R.id.radio33:
                if (checked)
                    revealAnswer.setText("Wrong. This is a common factor, but not the greatest common factor.");
                break;
            case R.id.radio34:
                if (checked)
                    revealAnswer.setText("Right! You can find the greatest common factor by writing out the prime factorization of all three numbers and then taking each of the common prime factors to the lowest power that appears for that factor.");
        }

        // math question 4

        revealAnswer = (TextView) findViewById(R.id.question9);
        switch (view.getId()) {
            case R.id.radio40:
                if (checked)
                    revealAnswer.setText("Wrong. You may have found the price after a markdown of 30%, but then added 20% of that amount and rounded. First, find the price after the markdown, then take 80% of that amount.");
                break;
            case R.id.radio41:
                if (checked)
                    revealAnswer.setText("Wrong. Remember that 30% is .30, not .03. You may have discounted the original price by 3% and took 80% of that amount.");
                break;
            case R.id.radio42:
                if (checked)
                    revealAnswer.setText("Right! 100(.70) = 70, the amount that would be paid of the DVD was marked down 30%, but there is another discount of 20%. The price is going to be 80% of the marked down price, so 70(.80) = 56.");
                break;
            case R.id.radio43:
                if (checked)
                    revealAnswer.setText("Wrong. You can't just add the discounts together. You must find the first price after one discount, and then take the second discount on that amount, not the original price.");
                break;
            case R.id.radio44:
                if (checked)
                    revealAnswer.setText("Wrong. You found both of the discounts correctly, but just gave the total amount of the discount, not what John paid.");
        }


        // reading question 1

        revealAnswer = (TextView) findViewById(R.id.question10);
        switch (view.getId()) {
            case R.id.radio45:
                if (checked)
                    revealAnswer.setText("Wrong. The text suggests that the phrase 'not guilty by reason of insanity' has actually made our legal system more complicated, not more efficient.");
                break;
            case R.id.radio46:
                if (checked)
                    revealAnswer.setText("Right! The passage focuses mainly on how standards of legal responsibility regarding a mentally incompetent person who commits a crime have been modified over time. The passage further states that 'the problem of legal responsibility in the case of mentally disordered individuals is currently a topic of intense debate', which indicates that additional modifications to the meanings of responsibility and guilt are likely.");
                break;
            case R.id.radio47:
                if (checked)
                    revealAnswer.setText("Wrong. The text suggests that knowing 'right or wrong is not enough' for the mentally ill person to 'be held criminally responsible'.");
                break;
            case R.id.radio48:
                if (checked)
                    revealAnswer.setText("Wrong. Whether or not a person can become severely disturbed without a word of warning to anyone has nothing to do with the legal concept of responsibility and is not a main point in the passage.");
        }

        // reading question 2

        revealAnswer = (TextView) findViewById(R.id.question11);
        switch (view.getId()) {
            case R.id.radio49:
                if (checked)
                    revealAnswer.setText("Wrong. The 1970s redefinition of insanity was adopted by 'a number of state and federal courts'; therefore, the purpose would not be to eliminate the insanity defense.");
                break;
            case R.id.radio50:
                if (checked)
                    revealAnswer.setText("Right! This 1970s redefinition of insanity set out to define more precisely when 'a person is not responsible for criminal conduct' and to explain that a person must have \"substantial capacity either to appreciate the wrongfulness of his conduct or to conform his conduct to the requirements of the law.\"");
                break;
            case R.id.radio51:
                if (checked)
                    revealAnswer.setText("Wrong. The text suggests a limitation of the number of criminals who could bring the insanity defense, not an increase.");
                break;
            case R.id.radio52:
                if (checked)
                    revealAnswer.setText("Wrong. There is no mention of mistaken identity in relation to the 1970s redefinition of insanity proposed by the American Law Institute");
        }

        // reading question 3

        revealAnswer = (TextView) findViewById(R.id.question13);
        switch (view.getId()) {
            case R.id.radio57:
                if (checked)
                    revealAnswer.setText("Wrong. There is no mention in the passage of any disputes between federal and state courts.");
                break;
            case R.id.radio58:
                if (checked)
                    revealAnswer.setText("Wrong. There is no evidence that the doctrine in any way contradicts accepted notions of justice.");
                break;
            case R.id.radio59:
                if (checked)
                    revealAnswer.setText("Wrong. The text suggests nothing about the number of murder trials in which the insanity defense was used.");
                break;
            case R.id.radio60:
                if (checked)
                    revealAnswer.setText("Right! The inference is that the narrowness of the McNaghten Rule led to modifications: 'Some states added to their statutes the doctrine of irresistible impulse,' and later 'a number of state and federal courts adopted a broader legal definition of insanity'. Both of these changes suggest that strictly applying the original McNaghten Rule could in some cases be unjust.");
        }

        // reading question 4

        revealAnswer = (TextView) findViewById(R.id.question14);
        switch (view.getId()) {
            case R.id.radio61:
                if (checked)
                    revealAnswer.setText("Right! Support for this choice is clearly stated, which explains how Queen Victoria, not pleased with the result of an insanity judgment in favor of a defendant named McNaghten, 'called on the House of Lords to review the decision. The decision was upheld and rules for the legal definition of insanity were put into writing,' and this came to be known as the McNaghten Rule, the basis for future decisions regarding legal insanity.");
                break;
            case R.id.radio62:
                if (checked)
                    revealAnswer.setText("Wrong. The text clearly states that the McNaghten case led to the McNagthen Rule after the House of Lords upheld an insanity-defense decision; there is no evidence that mistaken-identity cases had an effect on this decision.");
                break;
            case R.id.radio63:
                if (checked)
                    revealAnswer.setText("Wrong. McNaghten won his case on an insanity defense, so this choice is untrue.");
                break;
            case R.id.radio64:
                if (checked)
                    revealAnswer.setText("Wrong. Although the passage does suggest that McNaghten used a gun in his crime, there is no mention of the jury's reaction to this fact.");
        }


        // science question 1

        revealAnswer = (TextView) findViewById(R.id.question15);
        switch (view.getId()) {
            case R.id.radio65:
                if (checked)
                    revealAnswer.setText("Wrong. Scientist 1 says that the craters are smoothed by liquid water that oozes up into the craters from the subsurface and then quickly freezes. Scientist 2 says that ice sublimates, eroding and removing any craters that form.");
                break;
            case R.id.radio66:
                if (checked)
                    revealAnswer.setText("Right! Scientist 1 says that the craters are smoothed by liquid water that oozes up into the craters from the subsurface and then quickly freezes. Scientist 2 says that when ice sublimates, the craters are eroded and smoothed.");
                break;
            case R.id.radio67:
                if (checked)
                    revealAnswer.setText("Wrong. Scientist 1 says that the craters are smoothed by liquid water that oozes up into the craters from the subsurface and then quickly freezes.");
                break;
            case R.id.radio68:
                if (checked)
                    revealAnswer.setText("Wrong. Scientist 1 says that the craters are smoothed by liquid water that oozes up into the crater from the subsurface and then quickly freezes. Scientist 2 says that ice sublimates, eroding and removing any craters that form.");
        }

        // science question 2

        revealAnswer = (TextView) findViewById(R.id.question16);
        switch (view.getId()) {
            case R.id.radio69:
                if (checked)
                    revealAnswer.setText("Wrong. Neither scientist discusses the diameter of Europa.");
                break;
            case R.id.radio70:
                if (checked)
                    revealAnswer.setText("Wrong. Both scientists indicate that Europa's surface is made of ice, not rocky material.");
                break;
            case R.id.radio71:
                if (checked)
                    revealAnswer.setText("Wrong. Scientist 2 states that Europa's surface temperature is –160°C.");
                break;
            case R.id.radio72:
                if (checked)
                    revealAnswer.setText("Right! Both scientists indicate that ice covers large portions of the surface and neither discusses the presence of any other surface material. So, both scientists would likely agree that Europa is completely covered by a layer of ice.");
        }

        // science question 3

        revealAnswer = (TextView) findViewById(R.id.question17);
        switch (view.getId()) {
            case R.id.radio73:
                if (checked)
                    revealAnswer.setText("Wrong. Both scientists describe processes that continually smooth meteorite craters. For these craters to exist, meteorites must be striking Europa.");
                break;
            case R.id.radio74:
                if (checked)
                    revealAnswer.setText("Right! Both scientists describe surface processes that smooth or remove meteorite craters. Scientist 1 says that the craters become smooth when liquid water oozes into the craters and then quickly freezes. Scientist 2 says the process is the result of the sublimation of ice.");
                break;
            case R.id.radio75:
                if (checked)
                    revealAnswer.setText("Wrong. Both scientists describe processes that smooth meteorite craters. These craters do not remain unchanged for billions of years.");
                break;
            case R.id.radio76:
                if (checked)
                    revealAnswer.setText("Wrong. Both scientists describe processes that continually smooth meteorite craters. Thus, some meteorites must leave craters.");
        }

        // science question 4

        revealAnswer = (TextView) findViewById(R.id.question18);
        switch (view.getId()) {
            case R.id.radio77:
                if (checked)
                    revealAnswer.setText("Wrong. Water vapor molecules are composed of hydrogen and oxygen. The breakdown of these molecules would not lead to the production of nitrogen in the atmosphere.");
                break;
            case R.id.radio78:
                if (checked)
                    revealAnswer.setText("Wrong. Water vapor molecules are composed of hydrogen and oxygen. The breakdown of these molecules would not lead to the production of methane in the atmosphere");
                break;
            case R.id.radio79:
                if (checked)
                    revealAnswer.setText("Wrong. Water vapor molecules are composed of hydrogen and oxygen. The breakdown of these molecules would not lead to the production of chlorine in the atmosphere.");
                break;
            case R.id.radio80:
                if (checked)
                    revealAnswer.setText("Right! Water vapor molecules are composed of hydrogen and oxygen. The breakdown of these molecules would lead to the production of oxygen in the atmosphere.");
        }

    }

}