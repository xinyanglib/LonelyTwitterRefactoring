package ca.ualberta.cs.lonelytweet;

import java.util.Date;

import ca.ualberta.cs.lonelytweet.LonelyTweet;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	public Date getTweetDate() {
        return tweetDate;
    }

	public String getTweetBody() {
        return tweetBody;
    }
}