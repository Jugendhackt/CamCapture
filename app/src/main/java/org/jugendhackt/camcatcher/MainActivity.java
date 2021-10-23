package org.jugendhackt.camcatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView myWebView = (WebView) findViewById(R.id.map);
        myWebView.getSettings().setJavaScriptEnabled(true);
        String unencodedHtml =
                "<iframe width=\"425\" height=\"350\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://overpass-turbo.eu/map.html?Q=%2F*%0AThis%20is%20an%20example%20Overpass%20query.%0ATry%20it%20out%20by%20pressing%20the%20Run%20button%20above!%0AYou%20can%20find%20more%20examples%20with%20the%20Load%20tool.%0A*%2F%0Anode%0A%20%20%5Bman_made%3Dsurveillance%5D%0A%20%20(49.47386895454751%2C8.449172973632812%2C49.515011643842094%2C8.524618148803711)%3B%0Aout%3B\" style=\"border: 1px solid black\"></iframe><br/><small><a href=\"https://www.openstreetmap.org/#map=19/49.47641/8.49716\">Größere Karte anzeigen</a></small>";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
                Base64.NO_PADDING);
        myWebView.loadData(encodedHtml, "text/html", "base64");
    }
}