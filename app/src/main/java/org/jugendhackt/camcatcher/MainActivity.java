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
                "<iframe width=\"425\" height=\"350\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://www.openstreetmap.org/export/embed.html?bbox=8.495816588401796%2C49.475773891267146%2C8.498498797416689%2C49.477053102705405&amp;layer=mapnik\" style=\"border: 1px solid black\"></iframe><br/><small><a href=\"https://www.openstreetmap.org/#map=19/49.47641/8.49716\">Größere Karte anzeigen</a></small>";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
                Base64.NO_PADDING);
        myWebView.loadData(encodedHtml, "text/html", "base64");
    }
}