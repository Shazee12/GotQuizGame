
/*Copyright 2016 Android

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License. **/


package shahzaib.com.gotquizgame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class databaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "quiz";
    private static final String TABLE_QUEST = "quest";
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTA = "opta";
    private static final String KEY_OPTB = "optb";
    private static final String KEY_OPTC = "optc";
    private SQLiteDatabase dbase;

    // DbHelper constructor
    public databaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        // Set SQLite database parameters
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        db.execSQL(sql);
        addQuestions();
    }

    // create the questions and use the addQuestion method to add them to the database
    private void addQuestions() {

        questions q1 = new questions("What is the surname given to bastards born in Dorne?", "Sand", "Stone", "Water", "Sand");
        this.addQuestion(q1);

        questions q2 = new questions("Where did Jon grow up?", "Castle Black", "King's Landing", "Winterfell", "Winterfell");
        this.addQuestion(q2);
        questions q3 = new questions("Growing up, who was Jon's youngest brother?", "Robb Strak", "Rickard Stark", "Rickon Stark", "Rickon Stark");
        this.addQuestion(q3);
        questions q4 = new questions("Who was Jon's Master-at-Arms as a child?", "Howland Reed", "Jory Cassel", "Rodrick", "Rodrick");
        this.addQuestion(q4);

        questions q5 = new questions("What is Jon's direwolf called?", "Ghost", "Summer", "Grey Wind", "Ghost");
        this.addQuestion(q5);

        questions q6 = new questions("When Jon travels to The Wall to join the Night's Watch, which Lannister travels with him?", "Tyrion Lannister", "Tywin Lannister", "Jaime Lannister", "Tyrion Lannister");
        this.addQuestion(q6);

        questions q7 = new questions("Who is Lord Commander of the Night's Watch when Jon first joins?", "Alliser Throne", "Mance Reydar", "Joer Mormont", "Joer Mormont");
        this.addQuestion(q7);

        questions q8 = new questions("When he first joins the Night's Watch, Jon is appointed to which order?", "Scout", "Stewards", "Builde", "Stewards");
        this.addQuestion(q8);

        questions q9 = new questions("Who does Jon kill to gain the trust of the wildings?", "Eddison Tollet", "Yoren", "Physical Science", "Fertility Study");
        this.addQuestion(q9);

        questions q10 = new questions("What is Jon Snow's relationship to Daenerys Targaryen?", "First Cousin", "Second Cousin", "Nephew", "Nephew");
        this.addQuestion(q10);

        questions q11 = new questions("Who was Jon Snow's first lover?", "Ygritte", "Osha", "Daenerys Targaryen", "Ygritte");
        this.addQuestion(q11);

        questions q12 = new questions("What is the name of Jon's sword?", "Ghost", "Longclaw", "Dawn", "Longclaw");
        this.addQuestion(q12);

        questions q13 = new questions("Who gave Jon his sword?", "Jorah Mormonet", "Joer Morment", "Benjen Stark", "Joer Morment");
        this.addQuestion(q13);

        questions q14 = new questions("Which king is Jon responsible for killing?", "Mance Rayder", "Aerys Targaryen", "Stannis Baratheon", "Mance Rayder");
        this.addQuestion(q14);

        questions q15 = new questions("Who of the following WASN'T executed by Jon for their role in his stabbing?", "Grenn", "Alliser Throne", "Olly", "Grenn");
        this.addQuestion(q15);

        questions q16 = new questions("'The Mountain' is the nickname for which character?", "Sandro Clegane", "Gregor Clegane", "Oberyn Martell", "Gregor Clegane");
        this.addQuestion(q16);

        questions q17 = new questions("Who is Lord Commander of the Kingsguard at the beginning of Game of Thrones?", "Ser Jaime Lannister", "Ser Loris Tyrell", "Ser Barristan Selmy", "Ser Barristan Selmy");
        this.addQuestion(q17);

        questions q18 = new questions("Who was Margaery Tyrell's first husband?", "Tomen Baratheon", "Joffery Baratheon", "Renly Baratheon", "Renly Baratheon");
        this.addQuestion(q18);

        questions q19 = new questions("Who is known as 'The-King-Beyond-the-Wall'?", "The Nigh King", "Mance Rayder", "Stannis Baratheon", "Mance Rayder");
        this.addQuestion(q19);

        questions q20 = new questions("How many times has Sansa Stark been married?", "Once", "Three times", "Twice", "Twice");
        this.addQuestion(q20);

        questions q21 = new questions("Who is the ruler of the Iron Islands at the beginning of Game of Thrones?", "Euron Grejoy", "Belon Grejoy", "Aeron Grejoy", "Belon Grejoy");
        this.addQuestion(q21);

        questions q22 = new questions("Who was the Mad King's firstborn son?", "Viserys Targaryen", "Aegon Targaryen", "Rhaegar Targaryen", "Rhaegar Targaryen");
        this.addQuestion(q22);

        questions q23 = new questions("Who delivered the fatal blow to the King-in-the North, Robb Stark?", "Aliser Throne", "Ramsey Bolton", "Roose Bolton", "Roose Bolton");
        this.addQuestion(q23);

        questions q24 = new questions("Grey Worm and Missandei became allies of Daenerys Targaryen after she liberated the slaves of which city?", "Yunkai", "Qarth", "Astapor", "Astapor");
        this.addQuestion(q24);

        questions q25 = new questions("What is the name of the royal executioner who beheaded Eddard Stark for treason?", "Ser Beric Dondarrion", "Ser Meryn Trant", "Ser llyn Payne", "Ser llyn Payne");
        this.addQuestion(q25);

        questions q26 = new questions("Which rival king attempted to take King's Landing during the Battle of the Blackwater?", "Stannis Baratheon", "Robb Stark", "Renly Baratheon", "Stannis Baratheon");
        this.addQuestion(q26);

        questions q27 = new questions("Who was the fool who helped Sansa Stark escape King's Landing after King Joffrey's death?", "Vardis", "Eddison Tollet", "Dontos Hollard", "Dontos Hollard");
        this.addQuestion(q27);

        questions q28 = new questions("Which city does Samwell Tarly travel to in order to train as a maester?", "Gulltown", "Highgarden", "Oldtown", "Oldtown");
        this.addQuestion(q28);

        questions q29 = new questions("The wildling Gilly has a son, who is the father?", "Samwell Tarly ", "Craster", "Tormund Giantsbane", "Craster");
        this.addQuestion(q29);

        questions q30 = new questions("In which city does Arya Stark train to become a Faceless Man?", "Braavos", "Pentos", "Astapor", "Braavos");
        this.addQuestion(q30);

        questions q31 = new questions("Thoros of Myr is responsible for reviving which character from the dead?", "Sndor Celgane", "Gregor Clegane", "Beric Dondarrian", "Beric Dondarrian");
        this.addQuestion(q31);

        questions q32 = new questions("In Season 4, who does Tywin Lannister plan to marry his daughter, Cersei to?", "Loras Tyrell", "Oberyn Martell", "Petyr Baelish", "Loras Tyrell");
        this.addQuestion(q32);

        questions q33 = new questions("Davos Seaworth grew up in the slums of which city?", "Oldtown", "King's Landing", "Gulltown", "King's Landing");
        this.addQuestion(q33);

        questions q34 = new questions("What relation is Lyanna Mormont to Jorah Mormont?", "Sister", "Niece", "Cousin", "Cousin");
        this.addQuestion(q34);

        questions q35 = new questions("In which of the Free Cities was Robb Stark’s wife, Talisa Maegyr, raised? ?", "Pentos", "Volantis", "Lys", "Volantis");
        this.addQuestion(q35);

        questions q36 = new questions("Which of the following kingdoms did the Andals fail to conquer during their invasion of Westeros?", "The North", "Dorne", "The Iron Islands", "The North");
        this.addQuestion(q36);

        questions q37 = new questions("Who gives Tyrion his facial scar during the Battle of the Blackwater?", "Meryn Trant", "Boros Blount", "Mandon Moore", "Mandon Moore");
        this.addQuestion(q37);

        questions q38 = new questions("We meet three of Oberyn Martell’s daughters, known as the Sand Snakes. How many does he have in total?", "Six", "Eight", "Four", "Eight");
        this.addQuestion(q38);

        questions q39 = new questions("Which of the following houses only became one of the Great Houses of Westeros after Aegon Targaryen's invasion?", "House Tyrell", "House Martell", "House Lannister", "House Tyrell");
        this.addQuestion(q39);

        questions q40 = new questions("Before King Joffrey gives Harrenhal to Petyr Baelish in series 2, who had royal title to it?", "Lord Roose Bolton", "Lord Tywin Lannister", "Lord Jonas Slynt", "Lord Jonas Slynt");
        this.addQuestion(q40);

        questions q41 = new questions("The Faith Militant caused a lot of problems for Cersei. Under the reign of which Targaryen king were they last active?", "Jaehaerys Targaryen", "Aegon Targaryen", "Maegor Targaryen", "Jaehaerys Targaryen");
        this.addQuestion(q41);

        questions q42 = new questions("In the first episode of series 5, a young Cersei visits a woods witch. What is the name of the friend who accompanies her?", "Melera Hetherspoon", "Jeyne Farman", "Jocelyn Swyft", "Melera Hetherspoon");
        this.addQuestion(q42);

        questions q43 = new questions("There are 19 castles along the Wall. To which one does Jon Snow try to send Janos Slynt in series 5?", "Eastwatch-by-the-Sea", "The Shadow Tower", "Greyguard", "Greyguard");
        this.addQuestion(q43);

        questions q44 = new questions("Who did Jorah Mormont defeat to win the tournament at Lannisport after Balon Greyjoy’s first rebellion?", "Jaime Lannister", "Yohn Royce", "Robert Baratheon", "Jaime Lannister");
        this.addQuestion(q44);

        questions q45 = new questions("The Blackwoods of the Riverlands were always bitter enemies of whom?", "The Darrys", "The Rygers", "The Brackens", "The Brackens");
        this.addQuestion(q45);

        questions q46 = new questions("Whose armor is bronze, thousands and thousands of years old, and engraved with magic runes that ward against harm?", "Lord Jason Mallister", "Lord Yohn Royce", "Lord Tywin Lannister", "Lord Yohn Royce\n");
        this.addQuestion(q46);

        questions q47 = new questions("Which House's sigil is of a cluster of grapes?", "Redwynes", "Manderly", "Tyrell", "Redwynes");
        this.addQuestion(q47);

        questions q48 = new questions("Which House is not of the Vale? ", "Corbray", "Waynwood", "Crakehall", "Crakehall");
        this.addQuestion(q48);

        questions q49 = new questions("Who cut down three of Rhaegar's bannermen on the Trident during Robert's Rebellion?", "Lord Jason Mallister", "Lord Eddard Stark", "The Blackfish (Brynden Tully)", "Lord Jason Mallister");
        this.addQuestion(q49);

        questions q50 = new questions("On a maester's chain, what does silver signify?", "Warcraft", "Money and Accounts", "Healing", "Healing");
        this.addQuestion(q50);

        questions q51 = new questions("Which Northern House did not come to Winterfell when Robb called the banners?", "Karstark", "Mormont", "Flint", "Flint");
        this.addQuestion(q51);

        questions q52 = new questions("Whose banners have a white merman with trident in hand, rising from a blue-green sea?", "Tully", "Manderly", "Greyjoy", "Manderly");
        this.addQuestion(q52);

        questions q53 = new questions("Who are not Wildlings around the Vale?", "The Storm Crows", "The Moon Brothers", "The Burned Men", "The Storm Crows");
        this.addQuestion(q53);

        questions q54 = new questions("Which bannerman of the Lannisters has a burning tree for their banner?", "Umber", "Marbrand", "Crakehall", "Marbrand");
        this.addQuestion(q54);

        questions q55 = new questions("Who won the last tourney at Harrenhal when the Mad King still reigned?", "Brandon Stark", "Jaime Lannister", "Prince Rhaegar Targaryen", "Prince Rhaegar Targaryen");
        this.addQuestion(q55);

        questions q56 = new questions("Prince Rhaegar Targaryen was wed to what House when he died?", "Martell", "Tyrell", "Dayne", "Martell");
        this.addQuestion(q56);

        questions q57 = new questions("When Jaime Lannister broke up Edmure Tully's host, which Lord led the survivors back to Riverrun?", "Lord Bracken", "Lord Vance", "Lord Blackwood", "Lord Blackwood");
        this.addQuestion(q57);

        questions q58 = new questions("How many living sons, not bastards, does Lord Walder Frey have?", "28", "25", "21", "21");
        this.addQuestion(q58);

        questions q59 = new questions("What does Ned Stark tell Bran when he beheads a deserter in the pilot episode?", "Our way is the old way", "Fear cuts deeper than a sword", "All men must die", "Our way is the old way");
        this.addQuestion(q59);

        questions q60 = new questions("Who is the first character to say the phrase 'Game of Thrones'?", "Tywin Lannister", "Cersei Lannister", "Tyrion Lannister", "Cersei Lannister");
        this.addQuestion(q60);

        questions q61 = new questions("What title does Robert give Ned Stark on his death bed, until Joffrey turns of age?", "Hand of the King", "Lord Commander of the Kingsguard", "Protector of the Realm", "Protector of the Realm");
        this.addQuestion(q61);

        questions q62 = new questions("How many victories does Robb win before offering peace to the Lannisters in exchange for Sansa’s return?", "Two", "Three", "Four", "Three");
        this.addQuestion(q62);

        questions q63 = new questions("Where does Daenerys have to go to get her dragons back?", "Meereen", "The House of the Undying", "Dragonstone", "The House of the Undying");
        this.addQuestion(q63);

        questions q64 = new questions("Where does Tyrion try to send Shae to protect her?", "Essos", "Braavos", "Pentos", "Pentos");
        this.addQuestion(q64);

        questions q65 = new questions("What does Walder Frey say to Catelyn Stark at the Red Wedding?", "The Lannisters send their regards", "All men should keep their word, Kings most of all", "I owe my new Queen a wedding gift", "I owe my new Queen a wedding gift");
        this.addQuestion(q65);

        questions q66 = new questions("For what crimes does the High Sparrow declare Cersei is doing the walk of atonement?", "Blasphemy and idolatry", "Falsehood and fornication", "Adultery and incest", "Falsehood and fornication");
        this.addQuestion(q66);

        questions q67 = new questions("What does Melisandre burn of Jon Snow’s to try and resurrect him?", "His Hair", "His Blood", "His Clothes", "His Hair");
        this.addQuestion(q67);

        questions q68 = new questions("How many years does Tyrion propose slavery is ended in in Slaver’s Bay?", "One", "Five", "Seven", "Seven");
        this.addQuestion(q68);

        questions q69 = new questions("What is Hodor’s real name?", "Wylis", "Waif", "Walder", "Wylis");
        this.addQuestion(q69);

        questions q70 = new questions("Which of Ramsay Bolton’s arrows kills Rickon before the Battle of the Bastards?", "Third", "Fourth", "Fifth", "Fourth");
        this.addQuestion(q70);

        questions q71 = new questions("What book is Archmaester Ebrose writing?", "A History of the Seven Kingdoms, King Robert I - Queen Cersei I", "The Chronicles of the Wars Following the Death of King Robert I", "The Great Wars of Westeros Following the Death of King Joffrey", "The Chronicles of the Wars Following the Death of King Robert I");
        this.addQuestion(q71);

        questions q72 = new questions("what was the name chosen for Daenerys Strombrn's unborn baby?", "Vhaegar", "Rhaego", "Dragon", "Rhaego");
        this.addQuestion(q72);



        //To Be continue :Playbuzz



        questions q73 = new questions("Who cleans during their sleep ?", "Phoebe", "Rachel", "Monica", "Monica");
        this.addQuestion(q73);

        questions q74 = new questions("Who co-founded the 'I hate Rachel club' ?", "Ross", "Joey", "Gunther", "Ross");
        this.addQuestion(q74);

        questions q75 = new questions("Ross co-founded which club in high school ?", "Fighting Club", "I hate Rachel club", "Study Club", "I hate Rachel club");
        this.addQuestion(q75);

        questions q76 = new questions("What wedding present did Phoebe bought for Monica & Chandler ?", "Guitar", "Big White Dog", "PacMan Machine", "PacMan Machine");
        this.addQuestion(q76);

        questions q77 = new questions("What name does Phoebe suggests for Rachel's baby ?", "Phoebe and Phoebo", "Ben and Emma", "David and Mathew", "Phoebe and Phoebo");
        this.addQuestion(q77);

        questions q78 = new questions("To whom did Joey first told about his feeling for Rachel ?", "Ross", "Phoebe", "Chandler", "Phoebe");
        this.addQuestion(q78);

        questions q79 = new questions("What is the name of the guy Phoebe thinks that he'll be the soul mate of Monica ?", "Chandler", "David", "Don", "Don");
        this.addQuestion(q79);

        questions q80 = new questions("what is the name of the Geller's dog ?", "Lapooh", "Chi Chi", "Tyson", "Chi Chi");
        this.addQuestion(q80);

        questions q81 = new questions("Who proposed Rachel in the hospital ?", "Ross", "Tag", "Joey", "Joey");
        this.addQuestion(q81);

        questions q82 = new questions("who was having sex in a hospital closet ?", "Ross & Rachel", "Monica & Chandler", "Joey & Rachel", "Monica & Chandler");
        this.addQuestion(q82);

        questions q83 = new questions("In which country Chandler got transferred ?", "China", "Yemen", "Tulsa", "Tulsa");
        this.addQuestion(q83);

        questions q84 = new questions("What is Monica & Ross pediatrician name ?", "Dr. Gettleman", "Dr. Clooney", "Dr. Wyle", "Dr. Gettleman");
        this.addQuestion(q84);

        questions q85 = new questions("where did Joey met Mike ?", "The MET", "Central Perk", "Nick's Game", "Central Perk");
        this.addQuestion(q85);

        questions q86 = new questions("what Monica sees when she visits Chandler in Tulsa ?", "She got in wrong apartment", "Chandler is watching shark porn", "Chandler is with some other women", "Chandler is watching shark porn");
        this.addQuestion(q86);

        questions q87 = new questions("which song did Ross sang to make Emma laugh ?", "Twinkle Twinkle Little Star", "Lion Sleep Tonight", "Baby Got Back", "Baby Got Back");
        this.addQuestion(q87);

        questions q88 = new questions("What is the name of the girl Rachel & Ross hired as a nanny ?", "Emily", "Anjela", "Molly", "Molly");
        this.addQuestion(q88);

        questions q89 = new questions("What is the name of Rachel’s assistant that she use to like ?", "David", "Tag", "Ralph", "Tag");
        this.addQuestion(q89);

        questions q90 = new questions("What is the name of the comic book which Ross had in his childhood ?", "Dinosaur Boy", "Geller Boy", "Science Boy", "Science Boy");
        this.addQuestion(q90);

        questions q91 = new questions("Who mugged Ross in his childhood ?", "Phoebe", "Phoebe's Friend", "Gandalf", "Phoebe");
        this.addQuestion(q91);

        questions q92 = new questions("For which lipstick company did Joey did a commercial ?", "Guerlain", "Ichibaan", "MAC", "Ichibaan");
        this.addQuestion(q92);

        questions q93 = new questions("Where did Phoebe & Mike gave their wedding money ?", " to a poor man", "Lottery", "Charity", "Charity");
        this.addQuestion(q93);

        questions q94 = new questions("In which competition did Rachel and Phoebe put Emma on ?", "Baby Beauty pageant", "Smart Baby", "Youngest Baby", "Baby Beauty pageant");
        this.addQuestion(q94);

        questions q95 = new questions("What profession did Chandler chose to tell Erica ?", "Actor", "Business Man", "Doctor", "Doctor");
        this.addQuestion(q95);

        questions q96 = new questions("What profession did Monica chose to tell Erica?", "Cook", "Reverend", "Singer", "Reverend");
        this.addQuestion(q96);

        questions q97 = new questions("Who was Nancy that Phoebe & Rachel misunderstood as Chandler's girlfriend ?", "Stripper", "Chandler's Friend", "Realtor", "Realtor");
        this.addQuestion(q97);

        questions q98 = new questions("Who break the pact in high school between Chandler and Ross ?", "Chandler", "Ross", "Both", "Both");
        this.addQuestion(q98);

        questions q99 = new questions("Who was Monica’s midnight mystery kisser ?", "Ross", "Chandler", "Joey", "Ross");
        this.addQuestion(q99);

        questions q100 = new questions("Which language according to Joey can speak fluently but in reality he can’t ?", "Spanish", "French", "Chinese", "French");
        this.addQuestion(q100);

        questions q101 = new questions("In season 10 Phoebe changes her name to  ?", "Regeen Phalange", "Emma Bananahammock", "Princess Consuela Bananahammock", "Princess Consuela Bananahammock");
        this.addQuestion(q101);

        questions q102 = new questions("Chandler founded a handcuff, who does it belongs to ?", "Monica", "Monica's Mother", "Monica's Grandmother", "Monica's Grandmother");
        this.addQuestion(q102);

        questions q103 = new questions("What is Monica's catchphrase ?", "Oh my God", "Holy hell", "I KNOW", "I KNOW");
        this.addQuestion(q103);

        questions q104 = new questions("For how many season's did Friends run for ?", "10", "20", "11", "10");
        this.addQuestion(q104);


        questions q105 = new questions("What is the name of actor who plays Joey ?", "Matt leBlanc", "Bruce Will", "Mathew Perry", "Matt leBlanc");
        this.addQuestion(q105);

        questions q106 = new questions("Who was the last person to speak a line in Friends ?", "Monica", "Joey", "Chandler", "Chandler");
        this.addQuestion(q106);


        questions q107 = new questions("Who does the gang think Chandler is cheating on Monica with ?", "Nancy", "Anjela", "Janice", "Nancy");
        this.addQuestion(q107);


        questions q109 = new questions("Who first founds out about Chandler & Monica ?", "Phoebe", "Joey", "Rachel", "Joey");
        this.addQuestion(q109);


        questions q110 = new questions("What's the name of the dog that Phoebe let Joey borrow when he was upset ?", "Lapooh", "Chi Chi", "Mozzarella", "Mozzarella");
        this.addQuestion(q110);


        questions q111 = new questions("Who else went to Minsk ?", "Max", "Jared", "Tag", "Max");
        this.addQuestion(q111);


        questions q112 = new questions("What does Phoebe get tattooed ?", "A Dot", "A Dog", "A Skull", "A Dot");
        this.addQuestion(q112);


        questions q113 = new questions("How old was Chandler when he touched a woman's breast ?", "20", "19", "22", "19");
        this.addQuestion(q113);


        questions q114 = new questions("What are Rachel sister names ?", "Emily, Amy", "Jill, Minnie", "Jill, Amy", "Jill, Amy");
        this.addQuestion(q114);

        questions q115 = new questions("Where did Ross & Monica got raised ?", "Long Island", "Yonkers", "Chelsea", "Long Island");
        this.addQuestion(q115);


        questions q116 = new questions("What is the name of Phoebe's brother", "Frank", "Frank Jr", "Mark", "Frank Jr");
        this.addQuestion(q116);


        questions q117 = new questions("_____ is the title song of the show ?", "Baby Got Back", "Lion Sleeps Tonight", "I'll Be There For You", "I'll Be There For You");
        this.addQuestion(q117);


        questions q118 = new questions("How does Ross finally make it to his class on time?", "Roller Skates", "Bicycle", "Car", "Roller Skates");
        this.addQuestion(q118);


        questions q119 = new questions("What according to Chandler, scares the bejesus out of him?", "Haunted House", "Michale Flatley", "Horror Movies", "Michale Flatley");
        this.addQuestion(q119);


        questions q120 = new questions("What does Monica did after breaking up with Richard ?", "To Make Jam", "To Move Out", "To Find Another BoyFriend", "To Make Jam");
        this.addQuestion(q120);


        questions q121 = new questions("What did Joey find in Las Vegas ?", "His Sister", "His identical hand twin", "His Mother", "His identical hand twin");
        this.addQuestion(q121);


        questions q123 = new questions("What present did Paolo sent Rachel ?", "A Dress", "A Watch", "A Pair Of Shoes", "A Pair Of Shoes");
        this.addQuestion(q123);

        questions q124 = new questions("What did Joey get Monica & Chandler as a house warming present ?", "A PacMan Machine", "FoosBall Table", "Baby Duck & Chick ", "Baby Duck & Chick");
        this.addQuestion(q124);


        questions q125 = new questions("What did Joey dress up as for Monica's Halloween party ?", "SuperMan", "Chandler", "Sputnik", "Chandler");
        this.addQuestion(q125);


        questions q126 = new questions("Why did david left phoebe ?", "He Hates Her Friends", "He Is Gay", "He wants To Go to Minsk", "He wants To Go to Minsk");
        this.addQuestion(q126);


        questions q127 = new questions("What happens to Emily wedding ring after Ross's Bachelorette party ?", "Stripper Stole It", "The Duck Swallowed It", "Chandler Took It", "The Duck Swallowed It");
        this.addQuestion(q127);


        questions q128 = new questions("Who has a secret closet full of junk ?", "Joey", "Phoebe", "Monica", "Monica");
        this.addQuestion(q128);


        questions q129 = new questions("Who was fat in high school ?", "Monica", "Phoebe", "Rachel", "Monica");
        this.addQuestion(q129);


        questions q130 = new questions("Who had a huge crush on Joshua ?", "Rachel", "Monica", "Phoebe", "Rachel");
        this.addQuestion(q130);


        questions q131 = new questions("Who tried to seduce Chandler ?", "Rachel", "Phoebe", "Janice", "Phoebe");
        this.addQuestion(q131);


        questions q132 = new questions("Chandler's co-worker thinks his name is ?", "Clint", "Toby", "Muriel", "Toby");
        this.addQuestion(q132);

        questions q133 = new questions("Who got her hair corn-rolled ?", "Phoebe", "Rachel", "Monica", "Monica");
        this.addQuestion(q133);

        questions q134 = new questions("Whose girlfriend punches him all the time?", "Joey", "Chandler", "Ross", "Joey");
        this.addQuestion(q134);


        questions q135 = new questions("Monica's neighbors said that her holiday candy tastes like ?", "Little Drops Of Heaven", "Drops Of Rain", "Worst Candies Ever", "Little Drops Of Heaven");
        this.addQuestion(q135);

        questions q136 = new questions("Who was the only Friend who could get Emma to stop crying ?", "Monica", "Phoebe", "Chandler", "Monica");
        this.addQuestion(q136);

        questions q137 = new questions("What habit does Rachel take up to fit in with her colleages at Ralph Lauren ?", "Drinking", "Smoking Cigarettes", "Nothing", "Smoking Cigarettes");
        this.addQuestion(q137);

        questions q138 = new questions("We were on a ______", "lunch", "hat-rick", "Break", "Break");
        this.addQuestion(q138);

        questions q139 = new questions("Which encyclopedia volume did Joey bought ?", "W", "X", "V", "V");
        this.addQuestion(q139);

        questions q140 = new questions("What was Emma's first word?", "Gleeba", "Mliba", "Cleeba", "Gleeba");
        this.addQuestion(q140);

        questions q141 = new questions("What is the Mr.Beaumont ?", "Name Of Joey's Boat", "Phoebe's Massage Client", "Ross's Boss", "Name Of Joey's Boat");
        this.addQuestion(q141);

        questions q142 = new questions("What is 'The Routine' ?", "Comic Book", "Movie Name", "Monica & Ross Dance", "Monica & Ross Dance");
        this.addQuestion(q142);

        questions q143 = new questions("Who remain unmarried till the end ?", "Phoebe", "Monica", "Joey", "Joey");
        this.addQuestion(q143);

        questions q145 = new questions("What nickname does Ross wants people to call him by ?", "The Rossasaurus", "Dr Ross", "The Rossatron", "The Rossatron");
        this.addQuestion(q145);

        questions q146 = new questions("Which one of Joey's sisters did Chandler fool around with ?", "Mary Angela", "Mary Catherine", "Mary Dina", "Mary Angela");
        this.addQuestion(q146);

        questions q147 = new questions("Where do the girls took Chandler after Kathy cheats on him ?", "Central Perk", "For Dinner", "A Strip Club", "A Strip Club");
        this.addQuestion(q147);

        questions q148 = new questions("Who helps Joey pluck his eyebrows ?", "Monica", "Rachel", "Chandler", "Chandler");
        this.addQuestion(q148);

        questions q149 = new questions("Which Friend ends up at the one-woman show ?", "Chandler", "Ross", "Phoebe", "Chandler");
        this.addQuestion(q149);

        questions q150 = new questions("What did Monica lose in the quiches ?", "A Ring", "A Finger Nail", "A Coin", "A Finger Nail");
        this.addQuestion(q150);

        questions q151 = new questions("What did the gang use to poke the 'ugly naked guy' ?", "Chop Sticks", "Tooth Picks", "Pencils", "Chop Sticks");
        this.addQuestion(q151);

        questions q152 = new questions("Who was locked in a box to prove their loyalty ?", "Joey", "Ross", "Chandler", "Chandler");
        this.addQuestion(q152);

        questions q153 = new questions("How long was the letter that Rachel wrote to Ross?", "18 pages (Front and Back)", "16 pages (Front and Back)", "19 pages (Front and Back)", "18 pages (Front and Back)");
        this.addQuestion(q153);

        questions q154 = new questions("Who convinced Bonnie to shave her head ?", "Rachel", "Monica", "Phoebe", "Rachel");
        this.addQuestion(q154);

        questions q155 = new questions("What was the name of the product that Monica was hired to make recipes from ?", "Chocolate", "Mocolate", "Maltate", "Mocolate");
        this.addQuestion(q155);

        questions q156 = new questions("How do Ross & Rachel say their 'Perfect goodbye' ?", "They Kissed", "They Fight", "They Sleep Together", "They Sleep Together");
        this.addQuestion(q156);

        questions q157 = new questions("What was the name of the detergent used by Rachel & Ross ?", "Uberweiss", "Edelweiss", "Extraweiss", "Uberweiss");
        this.addQuestion(q157);

        questions q158 = new questions("Which friends have kissed all 5 other members ?", "Rachel", "Joey", "Phoebe", "Rachel");
        this.addQuestion(q158);

        questions q159 = new questions("What does WENUS stand for?", "Weekly Estimated Network Usage Systems", "Weekly Estimated Net Usage Systems", "Weekly Estimated Non Usage Systems", "Weekly Estimated Net Usage Systems");
        this.addQuestion(q159);

        questions q160 = new questions("Where did Rachel lose her engagement ring ?", "In Monica's Apartment", "Under Her Bed", "In Lasagna", "In Lasagna");
        this.addQuestion(q160);

        questions q161 = new questions("What was the name of Gunther's roommate ?", "Sarah", "Chloe", "Jasmine", "Jasmine");
        this.addQuestion(q161);

        questions q162 = new questions("What song did Monica sang at Mike's piano bar?", "We Are The Champions", "Delta Dawn", "I Touch Myself", "Delta Dawn");
        this.addQuestion(q162);

        questions q163 = new questions("What accent did Ross use on his first day teaching at a university ?", "British", "Scottish", "Indian", "British");
        this.addQuestion(q163);

        questions q164 = new questions("Who have danced with Mr.Treeger ?", "Rachel", "Monica", "Joey", "Joey");
        this.addQuestion(q164);

        questions q165 = new questions("Joey doesn't share _____", "Room", "Clothes", "Food", "Food");
        this.addQuestion(q165);

        questions q166 = new questions("How many babies did Phoebe carry for her brother ?", "3", "2", "1", "3");
        this.addQuestion(q166);

        questions q167 = new questions("In las vegas, ross gets married to", "Rachel", "Emily", "Carol", "Rachel");
        this.addQuestion(q167);

        questions q168 = new questions("What is the name of Ross's monkey ?", "Maurice", "Marcel", "Cujo", "Marcel");
        this.addQuestion(q168);

        questions q169 = new questions("What is Phoebe's sister called ?", "Phoebo", "Amy", "Ursula", "Ursula");
        this.addQuestion(q169);

        questions q170 = new questions("Who marries Chandler & Monica ?", "Joey", "Ross", "Monica's Father", "Joey");
        this.addQuestion(q170);

        questions q171 = new questions("Where did Chandler & Monica first slept together ?", "In Monica's Apartment", "In Chandler's Apartment", "In London", "In London");
        this.addQuestion(q171);

        questions q172 = new questions("What is the name of actress who plays Phoebe ?", "Courteney Cox", "Ellen DeGeneres", "Lisa Kudrow", "Lisa Kudrow");
        this.addQuestion(q172);

        questions q173 = new questions("Chandler was forced to work at ?", "China", "Yemen", "Tulsa", "Tulsa");
        this.addQuestion(q173);

        questions q174 = new questions("What is the name of Chandler's roommate after Joey moves out ?", "Eddie", "Mark", "Ross", "Eddie");
        this.addQuestion(q174);

        questions q175 = new questions("What is the name of Joey's agent ?", "Sophie", "Estelle", "Ema", "Estelle");
        this.addQuestion(q175);

        questions q176 = new questions("What is the name of the neighbour who leaves everything to Monica & Rachel ?", "Mr.Heckles", "Mr.David", "Mr.Jack", "Mr.Heckles");
        this.addQuestion(q176);

        questions q177 = new questions("Who introduced Phoebe to Mike ?", "Ross", "Joey", "Chandler", "Joey");
        this.addQuestion(q177);

        questions q178 = new questions("Whose catchphrase is Oh My God! ?", "Phoebe", "Rachel", "Janice", "Janice");
        this.addQuestion(q178);

        questions q179 = new questions("What is the name of the actress who plays Rachel ?", "Jennifer Aniston", "Courteney Cox", "Winona Ryder", "Jennifer Aniston");
        this.addQuestion(q179);

        questions q180 = new questions("Which Friend use to live on streets ?", "Rachel", "Joey", "Phoebe", "Phoebe");
        this.addQuestion(q180);

        questions q181 = new questions("What type of animal is Hugsy ?", "Penguin", "Dog", "Cat", "Penguin");
        this.addQuestion(q181);

        questions q182 = new questions("Who is the female paleontologist both Ross & Joey dated ?", "Dr.Martha", "Charlie", "Dr. Jennifer", "Charlie");
        this.addQuestion(q182);

        questions q183 = new questions("What is Chandler's mother job ?", "Business Women", "Stripper", "Erotic Novelist", "Erotic Novelist");
        this.addQuestion(q183);

        questions q184 = new questions("What color of sweater belongs to the father of Rachel's baby ?", "Red", "Blue", "Green", "Red");
        this.addQuestion(q184);

        questions q185 = new questions("How many sisters does Joey have ?", "3", "5", "7", "7");
        this.addQuestion(q185);

        questions q186 = new questions("Where does Chandler tell Janice he has been relocated to avoid her?", "Paris", "Yemen", "China", "Yemen");
        this.addQuestion(q186);

        questions q187 = new questions("How many siblings does Chandler have ?", "No one", "2", "3", "No One");
        this.addQuestion(q187);

        questions q188 = new questions("What is the name of actress who plays Monica ?", "Lisa Kudrow", "Courteney Cox", "Isabella Rossellini", "Courteney Cox");
        this.addQuestion(q188);

        questions q189 = new questions("Where do Ross & Phoebe got stuck ?", "At Ross's Apartment", "In Closet", "An Air Vent", "In Closet");
        this.addQuestion(q189);

        questions q190 = new questions("Which shoe of Monica's did Marcel poop in ?", "Left One", "Right One", "Both", "Left One");
        this.addQuestion(q190);

        questions q191 = new questions("How many nipples does Chandler have ?", "1", "2", "3", "3");
        this.addQuestion(q191);

        questions q192 = new questions("How did Rachel find out about Monica & Chandler ?", "They Told Her", "Joey Told Her", "She Heard Them On The Phone", "She Heard Them On The Phone");
        this.addQuestion(q192);

        questions q193 = new questions("Friends episode name begins with ?", "The One", "From the", "With Only...", "The One");
        this.addQuestion(q193);

        questions q194 = new questions("Where did Rachel get her tattoo ?", "Shoulder", "Back", "Hips", "Hips");
        this.addQuestion(q194);

        questions q195 = new questions("Ross moves into the apartment of ?", "Ugly Naked Guy", "No One", "Mr Heckels", "Ugly Naked Guy");
        this.addQuestion(q195);

        questions q196 = new questions("What are the names of Ross's Wives throughout the show ?", "Susan, Rachel, Emily", "Carol, Emily, Rachel", "Carol, Emily, Susan", "Carol, Emily, Rachel");
        this.addQuestion(q196);

        questions q197 = new questions("What is the name of Monica's hot cousin ?", "Susan", "lily", "Cassie", "Cassie");
        this.addQuestion(q197);

        questions q198 = new questions("Where does Chandler's boss hits him ?", "shoulder", "head", "butt", "butt");
        this.addQuestion(q198);

        questions q199 = new questions("What was Chandler's new year resolution ?", "to dance", "not to make fun of anyone", " to stay away from janice", "not to make fun of anyone");
        this.addQuestion(q199);

        questions q200 = new questions("Who is the master of sarcasm ?", "Chandler", "David", "Richard", "Chandler");
        this.addQuestion(q200);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }

    // reads
    public void addQuestion(questions quest) {
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQuestion());
        values.put(KEY_ANSWER, quest.getAnswer());
        values.put(KEY_OPTA, quest.getOptionOne());
        values.put(KEY_OPTB, quest.getOptionTwo());
        values.put(KEY_OPTC, quest.getOptionThree());

        dbase.insert(TABLE_QUEST, null, values);
    }

    // gets all questions and adds them to an ArrayList to be used by MainActivity
    public List<questions> getAllQuestions() {
        List<questions> qaList = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);


        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {

                    questions quest = new questions();
                    quest.setId(cursor.getInt(0));
                    quest.setQuestion(cursor.getString(1));
                    quest.setAnswer(cursor.getString(2));
                    quest.setOptionOne(cursor.getString(3));
                    quest.setOptionTwo(cursor.getString(4));
                    quest.setOptionThree(cursor.getString(5));
                    qaList.add(quest);
                    Collections.shuffle(qaList);
                } while (cursor.moveToNext());

                cursor.close();
                dbase.close();
            }
        }


        return qaList;
    }


    // returns the number of  questions
    public int rowCount() {
        int row = 0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        cursor.close();
        return row;
    }


}