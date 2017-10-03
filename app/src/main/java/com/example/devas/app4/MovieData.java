package com.example.devas.app4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by devas on 9/12/2017.
 */
public class MovieData {
List<Map<String,?>> moviesList;

public List<Map<String, ?>> getMoviesList() {
        return moviesList;
        }

public int getSize(){
        return moviesList.size();
        }

public HashMap getItem(int i){
        if (i >=0 && i < moviesList.size()){
        return (HashMap) moviesList.get(i);
        } else return null;
        }

public MovieData(){
        Integer vote_count ;
        Integer id ;
        Double vote_avg ;
        Double popularity ;
        String title ;
        String poster_path ;
        String backdrop_path ;
        String overview ;
        String release ;
        List < Integer > genres ;


        moviesList = new ArrayList<Map<String,?>>();
        vote_count = 546;
        vote_avg = 9.0;
        popularity=25.038621;
        poster_path="/2gvbZMtV1Zsl7FedJa5ysbpBx2G.jpg";
        backdrop_path= "/nl79FQ8xWZkhL3rDr1v2RFFR6J0.jpg";
        overview = "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.";
        release="1995-10-20";
        moviesList.add(createMovie("Dilwale Dulhania Le Jayenge",vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_2 ,overview, release));

        vote_count = 8054;
        vote_avg = 8.5;
        popularity=25.038621;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.";
        release="1994-09-23";
        moviesList.add(createMovie("The Shawshank Redemption", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_1 ,overview, release));

        vote_count = 896;
        vote_avg = 8.5;
        popularity=35.824862;
        poster_path="/xq1Ugd62d23K2knRUx6xxuALTZB.jpg";
        backdrop_path= "/mMtUybQ6hL24FXo0F3Z4j2KG7kZ.jpg";
        overview = "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.";
        release="2016-08-26";
        moviesList.add(createMovie("Your Name.",vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_3 ,overview, release));

        vote_count = 5796;
        vote_avg = 8.4;
        popularity=39.228992;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.";
        release="1972-03-14";
        moviesList.add(createMovie("The Godfather", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_4 ,overview, release));

        vote_count = 4228;
        vote_avg =  8.3;
        popularity=26.213647;
        poster_path="/yPisjyLweCl1tbgwgtzBCNCBle.jpg";
        backdrop_path= "/rIpSszng8P0DL0TimSzZbpfnvh1.jpg";
        overview = "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.";
        release="1993-11-29";
        moviesList.add(createMovie("Schindler's List", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_5 ,overview, release));

        vote_count = 165;
        vote_avg = 8.3;
        popularity=14.645821;
        poster_path="/he609rnU3tiwBjRklKNa4n2jQSd.jpg";
        backdrop_path= "/rMCew7St2vy9iV3QOPzx15sAkFJ.jpg";
        overview = "This feature-length special consists of three interwoven stories. In a mysterious and remote snowy outpost, Matt and Potter share a Christmas meal, swapping creepy tales of their earlier lives in the outside world. Matt is a charismatic American trying to bring the reserved, secretive Potter out of his shell. But are both men who they appear to be? A woman gets thrust into a nightmarish world of 'smart' gadgetry. Plus a look at what would happen if you could 'block' people in real life.";
        release="2014-12-16";
        moviesList.add(createMovie("Black Mirror: White Christmas", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_6 ,overview, release));

        vote_count = 8054;
        vote_avg = 8.5;
        popularity=25.038621;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "A ten year old girl who wanders away from her parents along a path that leads to a world ruled by strange and unusual monster-like animals. Her parents have been changed into pigs along with others inside a bathhouse full of these creatures. Will she ever see the world how it once was?";
        release="2001-07-20";
        moviesList.add(createMovie("Spirited Away", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_8 ,overview, release));

        vote_count = 3788;
        vote_avg = 8.3;
        popularity=36.084967;
        poster_path="/ynXoOxmDHNQ4UAy0oU6avW71HVW.jpg";
        backdrop_path= "/mnpRKVSXBX6jb56nabvmGKA0Wig.jpg";
        overview = "Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.";
        release="2014-10-10";
        moviesList.add(createMovie("Whiplash", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_7 ,overview, release));

        vote_count = 4117;
        vote_avg = 8.3;
        popularity=58.847741;
        poster_path="/lIv1QinFqz4dlp5U4lQ6HaiskOZ.jpg";
        backdrop_path= "/6bbZ6XyvgfjhQwbplnUh1LSj1ky.jpg";
        overview = "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.";
        release="1974-12-20";
        moviesList.add(createMovie("The Godfather: Part II", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_9 ,overview, release));

        vote_count = 3269;
        vote_avg = 8.3;
        popularity=31.193847;
        poster_path="/bVq65huQ8vHDd1a4Z37QtuyEvpA.jpg";
        backdrop_path= "/gLbBRyS7MBrmVUNce91Hmx9vzqI.jpg";
        overview = "A closeted boy runs the risk of being outed by his own heart after it pops out of his chest to chase down the boy of his dreams.";
        release="2017-06-01";
        moviesList.add(createMovie("In a Heartbeat", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_10 ,overview, release));

        vote_count = 86;
        vote_avg = 8.3;
        popularity=13.6503;
        poster_path="/wJUJROdLOtOzMixkjkx1aaZGSLl.jpg";
        backdrop_path= "/4datX8btikWEikf7esqEe6fhw.jpg";
        overview = "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.";
        release="1999-10-15";
        moviesList.add(createMovie("Fight Club", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_11 ,overview, release));


        vote_count = 9154;
        vote_avg = 8.3;
        popularity=56.253264;
        poster_path="/adw6Lq9FiC9zjYEpOqfq03ituwp.jpg";
        backdrop_path= "/87hTDiay2N2qWyX4Ds7ybXi9h8I.jpg";
        overview = "A touching story of an Italian book seller of Jewish ancestry who lives in his own little fairy tale. His creative and happy life would come to an abrupt halt when his entire family is deported to a concentration camp during World War II. While locked up he tries to convince his son that the whole thing is just a game.";
        release="1997-12-20";
        moviesList.add(createMovie("Life Is Beautiful", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_12 ,overview, release));

        vote_count = 8054;
        vote_avg = 8.5;
        popularity=25.038621;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "Long buried secrets finally come to light as someone has been playing a very long game indeed. Sherlock and John face their greatest ever challenge. Is the game finally over?";
        release="2017-01-15";
        moviesList.add(createMovie("Sherlock: The Final Problem",vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_13 ,overview, release));

        vote_count = 8198;
        vote_avg = 8.2;
        popularity=40.081675;
        poster_path="/dM2w364MScsjFf8pfMbaWUcWrR.jpg";
        backdrop_path= "/9rZg1J6vMQoDVSgRyWcpJa8IAGy.jpg";
        overview = "A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time.";
        release="1994-10-08";
        moviesList.add(createMovie("Pulp Fiction", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_14 ,overview, release));

        vote_count = 234;
        vote_avg = 8.3;
        popularity=64.278477;
        poster_path="/1hRoyzDtpgMU7Dz4JF22RANzQO7.jpg";
        backdrop_path= "/nnMC0BM6XbjIIrT4miYmMtPGcQV.jpg";
        overview = "Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as the Joker.";
        release="2008-07-16";
        moviesList.add(createMovie("The Dark Knight", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_15 ,overview, release));

        vote_count = 287;
        vote_avg = 8.2;
        popularity=14.858881;
        poster_path="/lQy2QVcacuH55k37K9Ox0gw3YpZ.jpg";
        backdrop_path= "/8bxjRFqFztBoXdVEx6q2u66a0s1.jpg";
        overview = "In 2013, something terrible is awakening in London's National Gallery; in 1562, a murderous plot is afoot in Elizabethan England; and somewhere in space an ancient battle reaches its devastating conclusion. All of reality is at stake as the Doctor's own dangerous past comes back to haunt him.";
        release="2013-11-23";
        moviesList.add(createMovie("Doctor Who: The Day of the Doctor", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_16 ,overview, release));

        vote_count = 8054;
        vote_avg = 8.5;
        popularity=25.038621;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "While serving time for insanity at a state mental hospital, implacable rabble-rouser, Randle Patrick McMurphy inspires his fellow patients to rebel against the authoritarian rule of head nurse, Mildred Ratched.";
        release= "1975-11-18";
        moviesList.add(createMovie("One Flew Over the Cuckoo's Nest", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_17 ,overview, release));

        vote_count =  7679;
        vote_avg = 8.2;
        popularity=44.278697;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/xBKGJQsAIeweesB79KC89FpBrVr.jpg";
        overview = "A man with a low IQ has accomplished great things in his life and been present during significant historic events - in each case, far exceeding what anyone imagined he could do. Yet, despite all the things he has attained, his one true love eludes him. 'Forrest Gump' is the story of a man who rose above his challenges, and who proved that determination, courage, and love are more important than ability.";
        release="1994-07-06";
        moviesList.add(createMovie("Forrest Gump", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_18 ,overview, release));

        vote_count = 2236;
        vote_avg = 8.2;
        popularity=26.874145;
        poster_path="/4ZP1DHlqlp83DH2lqCdqpU2g51c.jpg";
        backdrop_path= "/3md49VBCeqY6MSNyAVY6d5eC6bA.jpg";
        overview = "When larcenous real estate clerk Marion Crane goes on the lam with a wad of cash and hopes of starting a new life, she ends up at the notorious Bates Motel, where manager Norman Bates cares for his housebound mother. The place seems quirky, but fine… until Marion decides to take a shower.";
        release="1960-06-16";
        moviesList.add(createMovie("Psycho", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_19 ,overview, release));

        vote_count = 2047;
        vote_avg = 8.2;
        popularity=20.620783;
        poster_path="/3W0v956XxSG5xgm7LB6qu8ExYJ2.jpg";
        backdrop_path= "/lH2Ga8OzjU1XlxJ73shOlPx6cRw.jpg";
        overview = "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other.";
        release="1957-03-25";
        moviesList.add(createMovie("12 Angry Men", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_20 ,overview, release));

        vote_count = 767;
        vote_avg = 6.5;
        popularity=284.260457;
        poster_path="/tb86j8jVCVsdZnzf8I6cIi65IeM.jpg";
        backdrop_path= "/o8u0NyEigCEaZHBdCYTRfXR8U4i.jpg";
        overview = "Several years after the tragic death of their little girl, a dollmaker and his wife welcome a nun and several girls from a shuttered orphanage into their home, soon becoming the target of the dollmaker's possessed creation, Annabelle.";
        release="2017-08-03";
        moviesList.add(createMovie("Annabelle: Creation", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_21 ,overview, release));

        vote_count = 377;
        vote_avg =7.4;
        popularity=263.72191;
        poster_path="/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg";
        backdrop_path="/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg";
        overview = "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.";
        release="2017-08-17";
        moviesList.add(createMovie("It", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_22 ,overview, release));

        vote_count = 202;
        vote_avg = 5.8;
        popularity=91.781873;
        poster_path="/9O7gLzmreU0nGkIB6K3BsJbzvNv.jpg";
        backdrop_path= "/6fwuBSN56KtiHH19bLRIxGtfpC5.jpg";
        overview = "Single mother Karla McCoy lives a perfect life with her young son Frankie. One day, upon entering a local park, Karla sees her son suddenly being abducted out of the blue by a kidnapper. To save Frankie from being taken, Karla goes out on a mission to demand people in the city to help rescue her son.";
        release="2017-08-04";
        moviesList.add(createMovie("Kidnap", vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_24 ,overview, release));

        vote_count = 13;
        vote_avg = 5.9;
        popularity=77.785294;
        poster_path="/qmi2dsuoyzZdJ0WFZYQazbX8ILj.jpg";
        backdrop_path= "/rTi26DGOfFRAp7NMwzlvhO9UMm1.jpg";
        overview = "Trying to reverse a family curse, brothers Jimmy and Clyde Logan set out to execute an elaborate robbery during the legendary Coca-Cola 600 race at the Charlotte Motor Speedway.";
        release="2017-08-17";
        moviesList.add(createMovie("Logan Lucky",vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_23 ,overview, release));

        vote_count = 33;
        vote_avg = 5.9;
        popularity=47.415571;
        poster_path="/dzqEq8Jbvb5SYGoYPqLyIRrt6Cm.jpg";
        backdrop_path= "/u3hiCBwJ2yGCiJb3kOoqXThTQ7Z.jpg";
        overview = "Federation trooper Johnny Rico is ordered to work with a group of new recruits on a satellite station on Mars, where giant bugs have decided to target their next attack.";
        release="2017-08-21";
        moviesList.add(createMovie("Starship Troopers: Traitor of Mars",vote_count, vote_avg, popularity, poster_path, backdrop_path, R.drawable.ap_movie_25 ,overview, release));


}


private HashMap createMovie(String name,Integer vote_count,
        Double vote_avg, Double popularity,
        String poster_path,
        String backdrop_path, int image, String overview, String year) {
        HashMap movie = new HashMap();
        movie.put("vote_avg",vote_avg);
        movie.put("vote_count",vote_count);
        movie.put("popularity",popularity);
        movie.put("poster_path",poster_path);
        movie.put("backdrop_path",backdrop_path);
        movie.put("image",image);
        movie.put("name", name);
        movie.put("overview", overview);
        movie.put("year", year);
        movie.put("selection",false);
        return movie;
        }


        public void addItem(int position, HashMap movie){
                moviesList.add(position,movie);
        }

        public void removeItem(int position){
                if (position >=0 && position < moviesList.size()) {
                        moviesList.remove(position);
                }
        }
}