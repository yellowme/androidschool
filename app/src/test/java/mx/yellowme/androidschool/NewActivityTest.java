package mx.yellowme.androidschool;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by kevingamboa17 on 6/16/17.
 */

@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class NewActivityTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateStarActivity() {
        EditText editText = (EditText) activity.findViewById(R.id.editTextUser);
        Button button = (Button) activity.findViewById(R.id.buttonUser);
        String testText = "My input text";

        editText.setText(testText);
        button.performClick();

        Intent expectedIntent = new Intent(activity, DisplayMessageActivity.class);
        expectedIntent.putExtra("MESSAGE", testText);

        ShadowActivity shadowActivity = Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();


        assertEquals("DisplayMessageActivity isn't starting ",expectedIntent.getComponent().getClassName(),actualIntent.getComponent().getClassName());
        assertNotNull("Extra has nothing with key value 'MESSAGE'", actualIntent.getStringExtra("MESSAGE"));
        assertEquals("The text of the editText is not intent extra with key 'MESSAGE' ", testText, actualIntent.getStringExtra("MESSAGE") );
    }

    @Test
    public void validateTextView() {
        String testText = "My input text";

        Intent intent = new Intent(activity,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE",testText);

        Activity activity2 = Robolectric.buildActivity(DisplayMessageActivity.class).withIntent(intent).create().get();
        String textView = ((TextView)activity2.findViewById(R.id.textViewUser2)).getText().toString();

        assertEquals("The textview of DisplayMessageActivity has not the expected string",testText,textView);
    }

}