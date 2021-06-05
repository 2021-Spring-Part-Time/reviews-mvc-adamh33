package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review review1 = new Review(1L, "The Nightman Cometh","/images/nightman.jpg","S4,Ep13","Charlie stages a rock opera based on his song \"The Nightman\", and recruits the rest of the gang to help him with it.","What can I say about this episode? It's one of their best. In a show already unique and with its own corner of the modern comedy market, this episode stands out as one of the most memorable of the series as a whole. I laughed so hard I about cried. The acting and the writing hit full stride as the gang performs the musical. It's sheer, raw, unapologetic brilliance. The song at the end has been stuck in my head for days.");
        Review review2 = new Review(2L,"Chardee MacDennis: The Game of Games","/images/chardee.jpg","S7,Ep7","When the gang has no plans, they decide to stay indoors and play a board game, one of their own devising. (It doesn't much resemble Chutes and Ladders). A drinking game consisting of 3 levels and a 15 minute timer. ","Chardee MacDennis: The Game of Games is a amalgam of all their favorite games, and it’s just as insane, crazy and undecipherable as you would think a game made by this group would be. The game is like a combination of Trivial Pursuit, Hungry Hungry Hippos and drunken Double Dare." );
        Review review3 = new Review(3L,"Charlie Work","/images/charlieWork.jpg","S10Ep4","Charlie gets tipped off that the health inspector is coming to inspect Paddy's on the day Dennis, Dee, Frank, and Mac are involved in a scheme involving steaks, airline miles, and chickens.","Bravo. Good or bad, I always enjoy it when Sunny goes for something new and tries out different styles of comedy. This formula-breaker however was one of the best episodes the show's ever produced. A fast, frantic laugh-fest featuring outstanding work from Charlie Day. ");

        reviewList.put(review1.getId(),review1);
        reviewList.put(review2.getId(),review2);
        reviewList.put(review3.getId(),review3);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewList.put(review.getId(),review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
