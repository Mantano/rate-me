package com.androidsx.rateme;

import android.os.Parcelable;

public interface OnFeedbackListener extends Parcelable {

    void onFeedback( float rating );
}
