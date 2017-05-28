package univ.sm.data;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import univ.sm.board.BoardListFragment;
import univ.sm.board.BoardPostingFragment;

/**
 * Created by heesun on 2017-04-23.
 */
public class BoardMainPageAdapter extends FragmentStatePagerAdapter {


    public BoardMainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new BoardListFragment();
            case 1:
                return new BoardPostingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}