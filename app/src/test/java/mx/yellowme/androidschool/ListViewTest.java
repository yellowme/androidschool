package mx.yellowme.androidschool;

import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kevingamboa17 on 6/22/17.
 */

@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class ListViewTest {
    private MainActivity activity;
    private Menu activity2;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
        activity2 = Robolectric.setupActivity(Menu.class);
    }


    @Test
    public void validateListView() {
        String firstOfList;

        Button button = (Button) activity.findViewById(R.id.button);
        button.performClick();

        ListView listView = (ListView) activity2.findViewById(R.id.listViewCountries);
        try {
            listView.performItemClick(listView.getChildAt(0),0,listView.getChildAt(0).getId());
            firstOfList = ((TextView)listView.getChildAt(0)).getText().toString();
        }
        catch (NullPointerException e){
            firstOfList=null;
        }

        ShadowToast shadowToast = new ShadowToast();
        String first = activity.getResources().getStringArray(R.array.countries)[0];

        assertEquals("01 The listView doesn't have the elements", first, firstOfList);
        assertEquals("02 Isn't the right text in toast", first, shadowToast.getTextOfLatestToast());
        assertEquals("03 The arrayString doesn't have 20 elements", 20, activity.getResources().getStringArray(R.array.countries).length);
    }
}
