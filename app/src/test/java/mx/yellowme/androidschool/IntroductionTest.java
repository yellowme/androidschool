package mx.yellowme.androidschool;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by kevingamboa17 on 6/8/17.
 */
public class IntroductionTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateActivity() {
        assertNotNull("MainActivity not found", activity);
    }
}
