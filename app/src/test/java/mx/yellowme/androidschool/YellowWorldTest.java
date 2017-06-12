package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class YellowWorldTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateTextViewContent() {
        TextView textView = (TextView) activity.findViewById(R.id.textViewUser);
        assertNotNull("textViewUser not found", textView);
        assertEquals("textViewUser doesn't have the text 'Yellow World!' ", "Yellow World!", textView.getText());
    }
}