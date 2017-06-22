package mx.yellowme.androidschool;

import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
 * Created by kevingamboa17 on 6/22/17.
 */

@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class InputTypeTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateToast() {
        Button button = (Button) activity.findViewById(R.id.buttonUser);

        EditText editText1 = (EditText) activity.findViewById(R.id.editTextUser1);
        EditText editText2 = (EditText) activity.findViewById(R.id.editTextUser2);

        editText1.setText("1");
        editText2.setText("2");
        button.performClick();

        TextView textViewResult = (TextView) activity.findViewById(R.id.textViewResult);
        int result = Integer.parseInt(textViewResult.getText().toString());


        assertEquals("01 Type number", InputType.TYPE_CLASS_NUMBER, editText1.getInputType());
        assertEquals("02 Type number", InputType.TYPE_CLASS_NUMBER, editText1.getInputType());

        assertEquals("03 result",3,result);
    }
}