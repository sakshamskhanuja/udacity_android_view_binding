## View Binding

### Description

The application uses View binding to replace ```findViewById```.

<b>Step 1</b> - Changes made to ```build.gradle```:

```
android {
    ...

    buildFeatures {
        viewBinding true
    }
}
```

<b>Step 2</b> - View ID are set for views under ```activity_main.xml```:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout...>

    <!-- TextView -->
    <TextView
        android:id="@id/text_view"
        .../>

    <!-- Button -->
    <Button
        android:id="@id/button_update"
        .../>
</LinearLayout>
```

<b>Step 3</b> - Use the newly created ```ActivityMainBinding``` class to use views.

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Sets content.
        setContentView(binding.getRoot());

        // Attaching OnClickListener to "Update" Button.
        binding.buttonUpdate.setOnClickListener((v) -> {
            // Setting text from R.string.text_two.
            binding.textView.setText(R.string.text_two);
        });
    }
}
```
