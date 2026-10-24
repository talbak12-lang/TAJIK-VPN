package tj.tajikvpn;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(28, 28, 28, 28);
        root.setBackgroundColor(Color.rgb(248, 249, 247));

        TextView flag = new TextView(this);
        flag.setText("🇹🇯");
        flag.setTextSize(72);
        flag.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("TAJIK VPN");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(20, 90, 55));
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("Сервер ещё не настроен");
        status.setTextSize(16);
        status.setTextColor(Color.DKGRAY);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 24, 0, 24);

        Button connect = new Button(this);
        connect.setText("Подключить VPN");
        connect.setEnabled(false);

        TextView note = new TextView(this);
        note.setText("После настройки сервера WireGuard кнопка подключения будет подключена к VPN.");
        note.setTextSize(14);
        note.setTextColor(Color.GRAY);
        note.setGravity(Gravity.CENTER);
        note.setPadding(0, 24, 0, 0);

        root.addView(flag);
        root.addView(title);
        root.addView(status);
        root.addView(connect);
        root.addView(note);
        setContentView(root);
    }
}
