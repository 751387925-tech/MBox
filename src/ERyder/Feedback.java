public class Feedback{
    private String firstName;
    private String lastName;
    private String email;
    private String completefeedback;
    private String reviewID;
    private long longFeedback;
    public Feedback(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public void analyseFeedback(boolean isConcatenation, String sent1, String sent2, String sent3, String sent4, String sent5){
        if(isConcatenation){
            this.completefeedback = feedbackUsingConcatenation(sent1, sent2, sent3, sent4, sent5);
            this.longFeedback = checkFeedbackLength(this.completefeedback);
            this.reviewID = createReviewID(this.firstName, this.lastName, this.completefeedback);
        } else {
            this.completefeedback = feedbackUsingStringBuilder(sent1, sent2, sent3, sent4, sent5);
            this.longFeedback = checkFeedbackLength(this.completefeedback);
            this.reviewID = createReviewID(this.firstName, this.lastName, this.completefeedback);
        }
     }
    private String feedbackUsingConcatenation(String sent1, String sent2, String sent3, String sent4, String sent5){
        StringBuilder sb = new StringBuilder();
        sb.append(sent1).append(" ").append(sent2).append(" ").append(sent3).append(" ").append(sent4).append(" ").append(sent5);
        return sb.toString();
    }
    public String checkFeedbackLength(String completefeedback){
        String concatenatedFeedback = feedbackUsingConcatenation(completefeedback, "", "", "", "");
        return concatenatedFeedback;
    }
    private String createReviewID(String firstName, String lastName, String completefeedback){
        this.reviewID = ((firstName + lastName).toUpperCase() + "_" + (completefeedback.length())).replace(" ","");
        return this.reviewID;
    }
    public String feedbackUsingBuilder(String sent1, String sent2, String sent3, String sent4, String sent5){
        StringBuilder sb = new StringBuilder();
        sb.append(sent1).append(" ").append(sent2).append(" ").append(sent3).append(" ").append(sent4).append(" ").append(sent5);
        return sb.toString();
    }
    private boolean checkLength(String completeFeedback){
        if(completeFeedback.length() > 500){
            longFeedback = true;
        } else {
            longFeedback = false;
        }
        return longFeedback;
    }
}