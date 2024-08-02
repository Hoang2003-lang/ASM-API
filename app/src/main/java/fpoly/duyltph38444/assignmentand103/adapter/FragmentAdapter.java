package fpoly.duyltph38444.assignmentand103.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fpoly.duyltph38444.assignmentand103.Fragment.DetailFragment;
import fpoly.duyltph38444.assignmentand103.Fragment.FavouriteFragment;
import fpoly.duyltph38444.assignmentand103.Fragment.FrofileFragment;
import fpoly.duyltph38444.assignmentand103.Fragment.HomeFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0){
            return HomeFragment.newInstance();

        } else if (position==1) {
            return DetailFragment.newInstance();

        }else if (position==2) {
            return FavouriteFragment.newInstance();

        }else
            return FrofileFragment.newInstance();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
