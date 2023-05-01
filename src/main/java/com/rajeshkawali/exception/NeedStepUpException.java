package com.rajeshkawali.exception;

//package com.backbase.dbs.payment.extension;

/**
 * Indicates step up authentication is needed.
 */
public class NeedStepUpException extends Exception {

    private final String challenge;

    public NeedStepUpException(String message, String challenge) {
        super(message);
        this.challenge = challenge;
    }

    public String getChallenge() {
        return challenge;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Need a response to " + this.challenge;
    }
}