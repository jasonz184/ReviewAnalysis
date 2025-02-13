import java.util.ArrayList;

public class ReviewAnalysis 
{
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;

    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis(Review[] reviews) 
    {
       allReviews = reviews;
    }

    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() 
    {
        double sum = 0;
        for(int i = 0; i < allReviews.length; i++)
        {
            sum += allReviews[i].getRating();
        }
        return sum / allReviews.length;
    }

    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() 
    {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < allReviews.length; i++)
        {
            String comment = allReviews[i].getComment();
            for(int j = 0; j < comment.length(); j++)
            {
                if(comment.charAt(j) == '!')
                {
                    if(!(comment.charAt(comment.length() - 1) == '.' || comment.charAt(comment.length() - 1) == '!')) result.add(i + "-" + comment + ".");
                    else result.add(i + "-" + comment);
                }
            }
        }
        return result;
    }
}