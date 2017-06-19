package mx.yellowme.androidschool;

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

/**
 * Created by kevingamboa17 on 6/19/17.
 */

@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class StringResourcesTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateTextViewContent() {
        String string = activity.getResources().getString(R.string.yellow_world);
        String hint = activity.getResources().getString(R.string.hint_text_info);
        EditText editText = (EditText) activity.findViewById(R.id.editTextUser);
        TextView textView = (TextView) activity.findViewById(R.id.textViewUser);

        assertNotNull("String 'yellow_world' not found", string);
        assertEquals("textView's string is not equal to the source 'yellow_world' ", string , textView.getText().toString());

        assertNotNull("Hint 'hint_text_info' not found", hint);
        assertEquals("editText's hint is not equal to the source 'hint_text_info' ", hint , editText.getHint().toString());
    }
}
