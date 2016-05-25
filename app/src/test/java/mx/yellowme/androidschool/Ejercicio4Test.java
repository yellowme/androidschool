package mx.yellowme.androidschool;

/**
 * Created by javikin on 5/13/16.
 */

import android.text.InputType;
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
public class Ejercicio4Test {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }


    @Test
    public void validateContent() {

        String hint = activity.getResources().getString(R.string.hint_text_info);
        EditText editText = (EditText) activity.findViewById(R.id.editTextUsuario);

        assertNotNull("El hint 'hint_text_info' no fue encontrado", hint);
        assertEquals("El tipo de input no es de numero", hint , editText.getHint());

    }
}