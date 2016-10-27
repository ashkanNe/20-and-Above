package com.example.madstudent.twentyandabove;

import java.util.Random;

public class TipBook {

    private String[] mTips = {

            "•ACT English Tips•\n \n \n" +
                "CHOOSE THE MOST CONCISE ANSWER\n\n" +
                    "ACT English questions are looking for answers that result in the most straightforward, logical sentence structure. You should try to find the choice that provides all the necessary information for the sentence to make grammatical sense and nothing extra. The best writing says what it needs to say cleary and concisely!\n" +
                    " \n" +
                "\nREAD THE PARAGRAPH FIRST\n\n" +
                    "A good plan of attack for the ACT English section is to read the whole paragraph that contains the sentence you’ll be revising before looking at the answer choices. This will give you some context for your choices and give you a better grasp on the structure of the sentence and how you might need to change it. With this strategy, you’ll reduce the number of errors caused by careless misreadings.\n" +
                    " \n" +
                "\nBE CAREFUL WITH 'NO CHANGE' ANSWERS\n\n" +
                    "On questions for ACT English that ask you to choose the answer that makes a sentence grammatically correct, you will have the option to pick 'no change'. This is a dangerous choice because if you aren’t aware of more obscure grammar rules, you might be tempted to choose it on some questions where the sentence actually can be improved.\n" +
                    "It’s really important to double check all the other answers before you settle on 'no change' as the correct choice. However, keep in mind that 'no change' really is the answer around 25 - 30% of the time it's an option, so don't second guess yourself if you're relatively certain there really isn't an issue. Read the sentence through with each of the possible suggested changes before bubbling in “no change” to ensure you’re making the right call.\n",

            "•ACT Math Tips•\n \n \n" +
                "PAY ATTENTION TO DIAGRAMS\n\n" +
                    "The ACT Math section will often provide you with diagrams of figures that describe the problem you’re trying to answer. It’s important to pay attention to these figures, because they will give you clues about which answer choices are the most logical.\n" +
                    "If a problem is asking you to figure out an angle, for example, and some of the choices are acute while others are obtuse, you’ll be able to eliminate at least a couple of answers just by looking at the diagram. If it doesn’t seem like an answer is possible based on the visual aid you are given, it’s usually safe to cross it out.\n" +
                    " \n" +
                "\nPLUG IN THE ANSWER\n\n" +
                    "A really important strategy that will help you to be sure you have the correct answer on math problems is to plug in the answer choices. If a question asks you to solve for x, plug the answer choices back into the original equation and see which one works - you don’t even need to really solve it. This can be more time consuming than just solving the equation if you already know how to do that, so only use it as a last resort if you're stumped.",

            "•ACT Reading Tips•\n \n \n" +
                "START WITH YOUR STRENGTHS\n\n" +
                    "The ACT Reading section is always structured the same way with four topic areas in the same order that each correspond to a passage or pair of passages. The topics are as follows:\n" +
                    "•\tProse fiction/literary narrative\n" +
                    "•\tSocial science\n" +
                    "•\tHumanities\n" +
                    "•\tNatural science\n" +
                    "To make sure you’re getting the most out of this section, you should start with reading the passage(s) that correspond to the topic area in which you are most comfortable. This might simply mean starting with subject matter that is most interesting to you and will make for a quicker read. You’ll get the questions that are easiest for you out of the way first and won’t risk running out of time before you have a chance to answer them.\n" +
                    " \n" +
                "\nSKIM THE PASSAGES\n\n" +
                    "There’s a lot of time pressure on the ACT Reading section, so you should attempt to read the passages as efficiently as possible. For some students, it might be manageable to read passages normally and still have enough time to finish the section, but you have to be a really quick and thorough reader.\n" +
                    "The best strategy for most people is to skim the passages instead. In order to skim effectively, you should read the introduction and conclusion paragraphs and the first and last sentences of every body paragraph. This will give you a good overview of the main ideas and allow you to answer most main point questions about the passage. When you get to questions about details, you can read specific parts of the passage over again if necessary. \n",

            "•ACT Science Tips• \n \n \n" +
                "DO THE CONFLICTING VIEWPOINTS SECTION LAST\n\n" +
                    "The conflicting viewpoints section on ACT Science is usually the most time consuming for students. In case you’re not familiar with it, this part of the section asks you to read two or three passages that detail different viewpoints on a scientific issue. You'll then answer questions about these viewpoints and how they relate to one another.\n" +
                    "Since this is more reading-intensive and can eat up a lot of time, it’s best to save it for last so that you don’t end up missing other questions later on in the section that will be quicker and easier for you to answer. \n" +
                    " \n" +
                "\nRELY ON THE VISUALS\n\n" +
                    "The ACT Science section hits you with a lot of complicated terminology and unfamiliar facts that make it seem overwhelming. The best policy when faced with all this information is to ignore it and go straight for the graphs, which will provide enough information for you to answer the majority of the questions you’re faced with.\n" +
                    "Most the information you’re given is just extra stuff thrown in there to make this section seem more difficult than it is. ACT Science is more about logical reasoning and data interpretation than actually knowing any science, so if you can read the graphs you will be fine!\n",

            "•ACT Writing Tips• \n \n \n" +
                "PRE-PLAN EXAMPLES\n\n" +
                    "Since ACT essay prompts are relatively predictable, you can do some of your essay planning before the test to save yourself time and stress. You should choose concrete examples from art, history, literature, or personal experience; try not to use hypothetical or vague examples to support your points.\n" +
                    "Keep in mind that all the facts that you use in your essay don’t have to be true. Graders don’t have time to fact check, so they take everything you write at face value. This means you can make up statistics or historical facts to support your thesis, and you won't be penalized!\n" +
                    " \n" +
                "\nWRITE A GREAT INTRODUCTION AND CONCLUSION\n\n" +
                    "It’s likely that the essay graders will read your introduction and conclusion more closely than the rest of your essay. If they can find your thesis easily, you're already on the right track to earning a great score. As long as you have body paragraphs that make sense and support the points outlined in your thesis, graders will likely give you at least a 4 in the Organization and Ideas and Analysis domains.\n" +
                    "You'll also need to write a conclusion paragraph that shows a strong understanding of how all your points relate to one another and restates your thesis. If you can demonstrate basic knowledge of how to logically structure an essay and stay on topic, you should be good to go.\n",

            "•Preparing for the ACT• \n \n \n" +
                "STUDY EVERY DAY\n \n" +
                    "It may be difficult to consistently study for the ACT with so much going on in your life, but it will pay off to work at it. By practicing everyday, the information needed to pass will be implanted deep into your brain. Also it will help you get you into the right mindset for the test.\n" +
                    "Procrastination is difficult to combat but you must power through to get to your goals. Constantly think about how happy you will be getting the score you want. Power through and get to your goal.\n\n" +
                "\nRELAX THE DAY BEFORE\n \n" +
                    "Go out and enjoy yourself. Cramming the day before will not help and only stress yourself out even more. It will be difficult to retain the knowledge that soon to the test. By going out with friends, seeing a movie, or participating in a hobby, it wiill get your mind of the test and in a good mood.\n\n" +
                "\nHAVE A GOOD BREAKFAST\n \n" +
                    "Eating a good breakfast before the test will help you wake up and focus better. Being hungry and taking the ACT is the last thing you need.\n" +
                    "Do some practice questions while eating breakfast. Think of it as a warm up. You wouldn't want to play a sport without warming up and you wouldn't want to warm up on the actual ACT.\n\n",
    };

    public String getTip() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mTips.length);
        fact = mTips[randomNumber];

        return fact;
    }

}
