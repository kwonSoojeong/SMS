package univ.sm.data;

import univ.sm.R;

/**
 * Created by LeeHeesun on 2017-01-26.
 */
public enum ModelObject {

    RED("test", R.drawable.question_1),
    BLUE("test", R.drawable.question_2),
    GREEN("test", R.drawable.question_3),
    WHITE("test", R.drawable.question_4);

    private String mTitleResId;
    private int mLayoutResId;

    ModelObject(String titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public String getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
