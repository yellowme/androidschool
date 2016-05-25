package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


@Config(constants = BuildConfig.class, sdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class Ejercicio5Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateContent() {

        String hint = activity.getResources().getString(R.string.btn_action);
        Button button = (Button) activity.findViewById(R.id.buttonAction);

        assertNotNull("btn_action no Encontrado", button);
        assertNotNull("El text 'btn_action' no fue encontrado", hint);
        assertEquals("El button no contiene el texto del resource 'btn_action'", hint , button.getText());

    }
}