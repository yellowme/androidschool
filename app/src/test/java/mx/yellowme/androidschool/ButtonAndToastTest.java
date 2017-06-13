package mx.yellowme.androidschool;

import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;

/**
 * Created by kevingamboa17 on 6/12/17.
 */

@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class ButtonAndToastTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateToast() {
        EditText editText = (EditText) activity.findViewById(R.id.editTextUser);
        Button button = (Button) activity.findViewById(R.id.buttonUser);
        String testText = "My input text";
        ShadowToast toast = new ShadowToast();

        editText.setText(testText);
        button.performClick();

        assertEquals("the toast is not showing the editText text", testText, toast.getTextOfLatestToast() );
    }
}