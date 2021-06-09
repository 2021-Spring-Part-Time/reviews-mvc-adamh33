package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String review;
    private String imgUrl;
    private String category;
    private String plot;


    public String getCategory() {
        return category;
    }

    public String getPlot() {
        return plot;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReview() {
        return review;
    }

    public String getImgUrl() {
        return imgUrl;
    }


    public Review(long id, String title, String imgUrl,String category ,String plot, String review) {
        this.id = id;
        this.title = title;
        this.review = review;
        this.imgUrl = imgUrl;
        this.category = category;
        this.plot = plot;
    }

}
