package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

import ca.ualberta.cs.lonelytweet.LonelyTweet;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
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

		String string = getTweetDate() + " | " + getTweetBody() ;
		Log.i("ImportantTweet", string);
		return string;
	}

	public Date getTweetDate() {
        return tweetDate;
    }

	public String getTweetBody() {
        return tweetBody;
    }
}