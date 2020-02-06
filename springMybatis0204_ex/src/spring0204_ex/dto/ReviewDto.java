package spring0204_ex.dto;

public class ReviewDto {
	private int reviewId;
	private int customerId;
	private String reviewMessage;
	
	public ReviewDto() {
	}

	public ReviewDto(int reviewId, int customerId, String reviewMessage) {
		this.reviewId = reviewId;
		this.customerId = customerId;
		this.reviewMessage = reviewMessage;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}

	@Override
	public String toString() {
		return "ReviewDto [reviewId=" + reviewId + ", customerId=" + customerId + ", reviewMessage=" + reviewMessage
				+ "]";
	}
}