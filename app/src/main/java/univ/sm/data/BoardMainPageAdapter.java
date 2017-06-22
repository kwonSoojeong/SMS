package univ.sm.data;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;

import univ.sm.R;
import univ.sm.board.BoardListFragment;
import univ.sm.board.BoardPostingFragment;

/**
 * Created by heesun on 2017-04-23.
 */
public class BoardMainPageAdapter extends FragmentStatePagerAdapter {
    FragmentTransaction ft = null;
    public BoardMainPageAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return BoardListFragment.newInstatnce();
            case 1:
                return BoardPostingFragment.newInstatnce();
            default:
                return BoardListFragment.newInstatnce();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
