public class Main
{
    public static void main(String[] args) 
    {
        Review[] reviews = {new Review(4, "Good! Thx"), new Review(3, "OK site"), new Review(5, "Great!"), new Review(2, "Poor! Bad."), new Review(3, "")};
        ReviewAnalysis a = new ReviewAnalysis(reviews);
        System.out.println(a.getAverageRating());
        System.out.println(a.collectComments());
    }
}