package com.cuongmv162.customizedmaterialedittext.feedback;

/**
 * Created by cuongmv162 on 1/28/2017.
 */

public interface FeedbackPresenter {
    void sendFeedback(String name, String email, String content);

    void onDestroy();
}
